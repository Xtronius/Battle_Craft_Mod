package mod.xtronius.bc_mod.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.InventoryLargeChest;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public final class StackUtil
{
  private static final Random random = new Random();

  public static List<AdjacentInv> getAdjacentInventories(TileEntity source)
  {
    List inventories = new ArrayList();

    for (Direction direction : Direction.directions) {
      TileEntity target = direction.applyToTileEntity(source);
      if ((target instanceof IInventory))
      {
        IInventory inventory = (IInventory)target;

        if ((target instanceof TileEntityChest)) {
          for (Direction direction2 : Direction.directions) {
            if ((direction2 != Direction.YN) && (direction2 != Direction.YP))
            {
              TileEntity target2 = direction2.applyToTileEntity(target);

              if ((target2 instanceof TileEntityChest)) {
                inventory = new InventoryLargeChest("", inventory, (IInventory)target2);
                break;
              }
            }
          }
        }
        if ((!(target instanceof IPersonalBlock)) || (
          ((source instanceof IPersonalBlock)) && 
          (((IPersonalBlock)target).permitsAccess(((IPersonalBlock)source).getUsername()))))
        {
          inventories.add(new AdjacentInv(inventory, direction));
        }
      }
    }
    Collections.sort(inventories, new Comparator()
    {
      public int compare(StackUtil.AdjacentInv a, StackUtil.AdjacentInv b) {
        if (((a.inv instanceof IPersonalBlock)) || (!(b.inv instanceof IPersonalBlock)))
          return -1;
        if (((b.inv instanceof IPersonalBlock)) || (!(a.inv instanceof IPersonalBlock))) {
          return 1;
        }
        return b.inv.getSizeInventory() - a.inv.getSizeInventory();
      }

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
    });
    return inventories;
  }

  public static int distribute(TileEntity source, ItemStack itemStack, boolean simulate) {
    int transferred = 0;

    for (AdjacentInv inventory : getAdjacentInventories(source)) {
      int amount = putInInventory(inventory.inv, inventory.dir.getInverse(), itemStack, simulate);

      transferred += amount;
      itemStack.stackSize -= amount;

      if (itemStack.stackSize == 0)
        break;
    }
    itemStack.stackSize += transferred;

    return transferred;
  }

  public static ItemStack fetch(TileEntity source, ItemStack itemStack, boolean simulate) {
    ItemStack ret = null;
    int oldStackSize = itemStack.stackSize;

    for (AdjacentInv inventory : getAdjacentInventories(source)) {
      ItemStack transferred = getFromInventory(inventory.inv, inventory.dir.getInverse(), itemStack, simulate);

      if (transferred != null) {
        if (ret == null) {
          ret = transferred;
        } else {
          ret.stackSize += transferred.stackSize;
          itemStack.stackSize -= transferred.stackSize;
        }

        if (ret.stackSize == itemStack.stackSize)
          break;
      }
    }
    itemStack.stackSize = oldStackSize;

    return ret;
  }

  public static void distributeDrop(TileEntity source, List<ItemStack> itemStacks)
  {
    for (Iterator it = itemStacks.iterator(); it.hasNext(); ) {
      ItemStack itemStack = (ItemStack)it.next();

      int amount = distribute(source, itemStack, false);

      if (amount == itemStack.stackSize)
        it.remove();
      else {
        itemStack.stackSize -= amount;
      }
    }

    for (ItemStack itemStack : itemStacks) {
      dropAsEntity(source.worldObj, source.xCoord, source.yCoord, source.zCoord, itemStack);
    }

    itemStacks.clear();
  }

  public static ItemStack getFromInventory(IInventory inv, Direction side, ItemStack itemStackDestination, boolean simulate) {
    ItemStack ret = null;
    int toTransfer = itemStackDestination.stackSize;
    int vanillaSide = side.toSideValue();

    for (int i : getInventorySlots(inv, vanillaSide)) {
      if (toTransfer <= 0) break;
      if ((!(inv instanceof ISidedInventory)) || (((ISidedInventory)inv).canExtractItem(i, itemStackDestination, vanillaSide)))
      {
        ItemStack itemStack = inv.getStackInSlot(i);

        if ((itemStack != null) && (isStackEqual(itemStack, itemStackDestination))) {
          if (ret == null) ret = copyWithSize(itemStack, 0);

          int transfer = Math.min(toTransfer, itemStack.stackSize);

          if (!simulate) {
            itemStack.stackSize -= transfer;
            if (itemStack.stackSize == 0) inv.setInventorySlotContents(i, null);
          }

          toTransfer -= transfer;
          ret.stackSize += transfer;
        }
      }
    }
    if ((!simulate) && (toTransfer != itemStackDestination.stackSize)) {
      inv.onInventoryChanged();
    }

    return ret;
  }

  public static int putInInventory(IInventory inv, Direction side, ItemStack itemStackSource, boolean simulate) {
    int toTransfer = itemStackSource.stackSize;
    int vanillaSide = side.toSideValue();
    int[] slots = getInventorySlots(inv, vanillaSide);

    for (int i : slots) {
      if (toTransfer <= 0) break;
      if ((inv.isItemValidForSlot(i, itemStackSource)) && (
        (!(inv instanceof ISidedInventory)) || (((ISidedInventory)inv).canInsertItem(i, itemStackSource, vanillaSide))))
      {
        ItemStack itemStack = inv.getStackInSlot(i);

        if ((itemStack != null) && (itemStack.isItemEqual(itemStackSource))) {
          int transfer = Math.min(toTransfer, itemStack.getMaxStackSize() - itemStack.stackSize);

          if (!simulate) itemStack.stackSize += transfer;

          toTransfer -= transfer;
        }
      }
    }
    for (int i : slots) {
      if (toTransfer <= 0) break;
      if ((inv.isItemValidForSlot(i, itemStackSource)) && (
        (!(inv instanceof ISidedInventory)) || (((ISidedInventory)inv).canInsertItem(i, itemStackSource, vanillaSide))))
      {
        ItemStack itemStack = inv.getStackInSlot(i);

        if (itemStack == null) {
          int transfer = Math.min(toTransfer, itemStackSource.getMaxStackSize());

          if (!simulate) {
            ItemStack dest = copyWithSize(itemStackSource, transfer);
            inv.setInventorySlotContents(i, dest);
          }

          toTransfer -= transfer;
        }
      }
    }
    if ((!simulate) && (toTransfer != itemStackSource.stackSize)) {
      inv.onInventoryChanged();
    }

    return itemStackSource.stackSize - toTransfer;
  }

  public static int[] getInventorySlots(IInventory inv, int side) {
    if ((inv instanceof ISidedInventory)) {
      return ((ISidedInventory)inv).getAccessibleSlotsFromSide(side);
    }
    int[] ret = new int[inv.getSizeInventory()];

    for (int i = 0; i < ret.length; i++) {
      ret[i] = i;
    }

    return ret;
  }

  public static void dropAsEntity(World world, int x, int y, int z, ItemStack itemStack)
  {
    if (itemStack == null) return;

    double f = 0.7D;
    double dx = world.rand.nextFloat() * f + (1.0D - f) * 0.5D;
    double dy = world.rand.nextFloat() * f + (1.0D - f) * 0.5D;
    double dz = world.rand.nextFloat() * f + (1.0D - f) * 0.5D;

    EntityItem entityItem = new EntityItem(world, x + dx, y + dy, z + dz, itemStack.copy());
    entityItem.delayBeforeCanPickup = 10;
    world.spawnEntityInWorld(entityItem);
  }

  public static ItemStack copyWithSize(ItemStack itemStack, int newSize) {
    ItemStack ret = itemStack.copy();
    ret.stackSize = newSize;
    return ret;
  }

  public static NBTTagCompound getOrCreateNbtData(ItemStack itemStack) {
    NBTTagCompound ret = itemStack.getTagCompound();

    if (ret == null) {
      ret = new NBTTagCompound("tag");

      itemStack.setTagCompound(ret);
    }

    return ret;
  }

  public static boolean isStackEqual(ItemStack stack1, ItemStack stack2) {
    return (stack1 != null) && (stack2 != null) && (stack1.itemID == stack2.itemID) && (((!stack1.getHasSubtypes()) && (!stack1.isItemStackDamageable())) || ((stack1.getItemDamage() == stack2.getItemDamage()) && (ItemStack.areItemStackTagsEqual(stack1, stack2))));
  }

  public static boolean damageItemStack(ItemStack itemStack, int amount)
  {
    if (itemStack.attemptDamageItem(amount, random)) {
      itemStack.stackSize -= 1;
      itemStack.setItemDamage(0);

      return itemStack.stackSize <= 0;
    }

    return false;
  }

  public static void consumInventoryItem(EntityPlayer player, ItemStack itemStack)
  {
    for (int i = 0; i < player.inventory.mainInventory.length; i++)
    {
      if ((player.inventory.mainInventory[i] != null) && (player.inventory.mainInventory[i].isItemEqual(itemStack)))
      {
        player.inventory.decrStackSize(i, 1);
        return;
      }
    }
  }

  public static class AdjacentInv
  {
    public IInventory inv;
    public Direction dir;

    public AdjacentInv(IInventory inv, Direction dir)
    {
      this.inv = inv;
      this.dir = dir;
    }
  }
private String tier;
  public static List<String> getHudInfo(ItemStack itemStack)
  {
    List info = new LinkedList();
    info.add(Buffer.manager.getToolTip(itemStack));
    info.add(StatCollector.translateToLocal("bc_mod.item.tooltip.PowerTier") + " " + Buffer.tier);
    return info;
  }
}