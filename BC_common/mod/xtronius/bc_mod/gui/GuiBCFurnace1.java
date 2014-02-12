package mod.xtronius.bc_mod.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mod.xtronius.bc_mod.container.ContainerBCFurnace1;
import mod.xtronius.bc_mod.lib.Reference;
import mod.xtronius.bc_mod.tileEntity.TileEntityBCFurnace1;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class GuiBCFurnace1 extends GuiContainer
{
    public static final ResourceLocation texture = new ResourceLocation(Reference.MOD_Gui, "textures/gui/BCFurnace1.png");
    private TileEntityBCFurnace1 BCFurnace1Inventory;

    public GuiBCFurnace1(InventoryPlayer par1InventoryPlayer, TileEntityBCFurnace1 par2TileEntityBCFurnace1)
    {
        super(new ContainerBCFurnace1(par1InventoryPlayer, par2TileEntityBCFurnace1));
        this.BCFurnace1Inventory = par2TileEntityBCFurnace1;
        
    }

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    protected void drawGuiContainerForegroundLayer(int par1, int par2)
    {
        String s = this.BCFurnace1Inventory.isInvNameLocalized() ? this.BCFurnace1Inventory.getInvName() : I18n.getString(this.BCFurnace1Inventory.getInvName());
        this.fontRenderer.drawString(s, this.xSize / 2 - this.fontRenderer.getStringWidth(s) / 2, 6, 4210752);
        this.fontRenderer.drawString(I18n.getString("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
    }

    /**
     * Draw the background layer for the GuiContainer (everything behind the items)
     */
    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(texture);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
        int i1;

        if (this.BCFurnace1Inventory.isBurning())
        {
            i1 = this.BCFurnace1Inventory.getBurnTimeRemainingScaled(12);
            this.drawTexturedModalRect(k + 56, l + 36 + 12 - i1, 176, 12 - i1, 14, i1 + 2);
        }

        i1 = this.BCFurnace1Inventory.getCookProgressScaled(24);
        this.drawTexturedModalRect(k + 79, l + 34, 176, 14, i1 + 1, 16);
    }
}
