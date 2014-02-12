package mod.xtronius.bc_mod.util;

import net.minecraft.entity.player.EntityPlayer;

public abstract interface IPersonalBlock
{
  public abstract boolean permitsAccess(EntityPlayer paramEntityPlayer);

  public abstract boolean permitsAccess(String paramString);

  public abstract String getUsername();
}