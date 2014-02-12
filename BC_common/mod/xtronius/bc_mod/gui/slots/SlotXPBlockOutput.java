package mod.xtronius.bc_mod.gui.slots;

import mod.xtronius.bc_mod.container.ContainerXPBlock;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SlotXPBlockOutput extends Slot
{
    /** The beacon this slot belongs to. */
    final ContainerXPBlock xpBlock;

    public SlotXPBlockOutput(ContainerXPBlock containerXPBlock, IInventory par2IInventory, int x, int y, int z)
    {
        super(par2IInventory, x, y, z);
        this.xpBlock = containerXPBlock;
    }

    /**
     * Check if the stack is a valid item for this slot. Always true beside for the armor slots.
     */
    public boolean isItemValid(ItemStack stack)
    {
        //return par1ItemStack == null ? false : par1ItemStack.itemID == Item.emerald.itemID || par1ItemStack.itemID == Item.diamond.itemID || par1ItemStack.itemID == Item.ingotGold.itemID || par1ItemStack.itemID == Item.ingotIron.itemID;
        return stack == null;
        
    }

    /**
     * Returns the maximum stack size for a given slot (usually the same as getInventoryStackLimit(), but 1 in the case
     * of armor slots)
     */
    public int getSlotStackLimit()
    {
        return 64;
    }
}
