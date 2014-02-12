package mod.xtronius.bc_mod.util;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraftforge.common.ForgeDirection;

public enum Direction
{
  XN(0), 

  XP(1), 

  YN(2), 

  YP(3), 

  ZN(4), 

  ZP(5);

  private int dir;
  public static final Direction[] directions = values();

  private Direction(int dir)
  {
    this.dir = dir;
  }

  public TileEntity applyToTileEntity(TileEntity tileEntity)
  {
    int[] coords = { tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord };

    coords[(this.dir / 2)] += getSign();

    if ((tileEntity.worldObj != null) && (tileEntity.worldObj.blockExists(coords[0], coords[1], coords[2]))) {
      try {
        return tileEntity.worldObj.getBlockTileEntity(coords[0], coords[1], coords[2]);
      } catch (Exception e) {
        throw new RuntimeException("error getting TileEntity at dim " + tileEntity.worldObj.provider.dimensionId + " " + coords[0] + "/" + coords[1] + "/" + coords[2]);
      }
    }
    return null;
  }

  public Direction getInverse()
  {
    int inverseDir = this.dir - getSign();

    for (Direction direction : directions) {
      if (direction.dir == inverseDir) return direction;
    }

    return this;
  }

  public int toSideValue()
  {
    return (this.dir + 4) % 6;
  }

  private int getSign()
  {
    return this.dir % 2 * 2 - 1;
  }

  public ForgeDirection toForgeDirection() {
    return ForgeDirection.getOrientation(toSideValue());
  }
}