package mod.xtronius.bc_mod.container;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mod.xtronius.bc_mod.gui.slots.SlotXPBlockOutput;
import mod.xtronius.bc_mod.tileEntity.TileEntityXPBlock;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;


public class ContainerXPBlock extends Container
{
    private TileEntityXPBlock xpBlock;
    //private final SlotFurnace slotFurnace;
    private int lastCookTime;
    private int lastBurnTime;
    private int lastItemBurnTime;

    public ContainerXPBlock(InventoryPlayer par1InventoryPlayer, TileEntityXPBlock tileEntityXPBlock)
    {
        this.xpBlock = tileEntityXPBlock;
//        this.addSlotToContainer(new Slot(tileEntityXPBlock, 0, 56, 17));
//        this.addSlotToContainer(new Slot(tileEntityXPBlock, 1, 56, 53));
        
        this.addSlotToContainer(new Slot(tileEntityXPBlock, 0, 40, 110));
        this.addSlotToContainer(new Slot(tileEntityXPBlock, 1, 69, 110));
        this.addSlotToContainer(new SlotFurnace(par1InventoryPlayer.player, tileEntityXPBlock, 0, 136, 110));
        //this.addSlotToContainer(this.xpBlockOutput = new SlotXPBlockOutput(this, tileEntityXPBlock, 0, 136, 110));
        byte b0 = 36;
        short short1 = 137;
        int i;

        for (i = 0; i < 3; ++i)
        {
            for (int j = 0; j < 9; ++j)
            {
                this.addSlotToContainer(new Slot(par1InventoryPlayer, j + i * 9 + 9, b0 + j * 18, short1 + i * 18));
            }
        }

        for (i = 0; i < 9; ++i)
        {
            this.addSlotToContainer(new Slot(par1InventoryPlayer, i, b0 + i * 18, 58 + short1));
        }
    }

    public void addCraftingToCrafters(ICrafting par1ICrafting)
    {
        super.addCraftingToCrafters(par1ICrafting);
        par1ICrafting.sendProgressBarUpdate(this, 0, this.xpBlock.furnaceCookTime);
        par1ICrafting.sendProgressBarUpdate(this, 1, this.xpBlock.furnaceBurnTime);
        par1ICrafting.sendProgressBarUpdate(this, 2, this.xpBlock.currentItemBurnTime);
    }

    /**
     * Looks for changes made in the container, sends them to every listener.
     */
    public void detectAndSendChanges()
    {
        super.detectAndSendChanges();

        for (int i = 0; i < this.crafters.size(); ++i)
        {
            ICrafting icrafting = (ICrafting)this.crafters.get(i);

            if (this.lastCookTime != this.xpBlock.furnaceCookTime)
            {
                icrafting.sendProgressBarUpdate(this, 0, this.xpBlock.furnaceCookTime);
            }

            if (this.lastBurnTime != this.xpBlock.furnaceBurnTime)
            {
                icrafting.sendProgressBarUpdate(this, 1, this.xpBlock.furnaceBurnTime);
            }

            if (this.lastItemBurnTime != this.xpBlock.currentItemBurnTime)
            {
                icrafting.sendProgressBarUpdate(this, 2, this.xpBlock.currentItemBurnTime);
            }
        }

        this.lastCookTime = this.xpBlock.furnaceCookTime;
        this.lastBurnTime = this.xpBlock.furnaceBurnTime;
        this.lastItemBurnTime = this.xpBlock.currentItemBurnTime;
    }

    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int par1, int par2)
    {
        if (par1 == 0)
        {
            this.xpBlock.furnaceCookTime = par2;
        }

        if (par1 == 1)
        {
            this.xpBlock.furnaceBurnTime = par2;
        }

        if (par1 == 2)
        {
            this.xpBlock.currentItemBurnTime = par2;
        }
    }

    public boolean canInteractWith(EntityPlayer par1EntityPlayer)
    {
        return this.xpBlock.isUseableByPlayer(par1EntityPlayer);
    }

    /**
     * Called when a player shift-clicks on a slot. You must override this or you will crash when someone does that.
     */
    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(par2);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (par2 == 2)
            {
                if (!this.mergeItemStack(itemstack1, 3, 39, true))
                {
                    return null;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }
            else if (par2 != 1 && par2 != 0)
            {
                if (FurnaceRecipes.smelting().getSmeltingResult(itemstack1) != null)
                {
                    if (!this.mergeItemStack(itemstack1, 0, 1, false))
                    {
                        return null;
                    }
                }
                else if (TileEntityXPBlock.isItemFuel(itemstack1))
                {
                    if (!this.mergeItemStack(itemstack1, 1, 2, false))
                    {
                        return null;
                    }
                }
                else if (par2 >= 3 && par2 < 30)
                {
                    if (!this.mergeItemStack(itemstack1, 30, 39, false))
                    {
                        return null;
                    }
                }
                else if (par2 >= 30 && par2 < 39 && !this.mergeItemStack(itemstack1, 3, 30, false))
                {
                    return null;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 3, 39, false))
            {
                return null;
            }

            if (itemstack1.stackSize == 0)
            {
                slot.putStack((ItemStack)null);
            }
            else
            {
                slot.onSlotChanged();
            }

            if (itemstack1.stackSize == itemstack.stackSize)
            {
                return null;
            }

            slot.onPickupFromSlot(par1EntityPlayer, itemstack1);
        }

        return itemstack;
    }
}
