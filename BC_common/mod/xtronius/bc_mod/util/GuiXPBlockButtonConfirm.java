package mod.xtronius.bc_mod.util;

import mod.xtronius.bc_mod.gui.GuiXPBlock;
import net.minecraft.client.resources.I18n;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiXPBlockButtonConfirm extends GuiXPBlockButton
{
    /** Beacon GUI this button belongs to. */
    final GuiXPBlock guiXPBlock;

    public GuiXPBlockButtonConfirm(GuiXPBlock par1GuiXPBlock, int par2, int par3, int par4)
    {
        super(par2, par3, par4, GuiXPBlock.getXPBlockGuiTextures(), 90, 220);
        this.guiXPBlock = par1GuiXPBlock;
    }

    public void func_82251_b(int par1, int par2)
    {
        this.guiXPBlock.drawCreativeTabHoveringText(I18n.getString("gui.done"), par1, par2);
    }
}
