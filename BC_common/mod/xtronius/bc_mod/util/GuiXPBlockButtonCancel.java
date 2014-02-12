package mod.xtronius.bc_mod.util;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mod.xtronius.bc_mod.gui.GuiXPBlock;
import net.minecraft.client.resources.I18n;

@SideOnly(Side.CLIENT)
public class GuiXPBlockButtonCancel extends GuiXPBlockButton
{
    /** Beacon GUI this button belongs to. */
    final GuiXPBlock xpBlock;

    public GuiXPBlockButtonCancel(GuiXPBlock par1GuiBeacon, int par2, int par3, int par4)
    {
        super(par2, par3, par4, GuiXPBlock.getXPBlockGuiTextures(), 112, 220);
        this.xpBlock = par1GuiBeacon;
    }

    public void func_82251_b(int par1, int par2)
    {
        this.xpBlock.drawCreativeTabHoveringText(I18n.getString("gui.close"), par1, par2);
    }
}
