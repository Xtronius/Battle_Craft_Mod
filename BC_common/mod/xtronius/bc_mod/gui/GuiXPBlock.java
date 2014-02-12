package mod.xtronius.bc_mod.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.Iterator;

import mod.xtronius.bc_mod.container.ContainerXPBlock;
import mod.xtronius.bc_mod.lib.Reference;
import mod.xtronius.bc_mod.tileEntity.TileEntityXPBlock;
import mod.xtronius.bc_mod.util.GuiXPBlockButtonCancel;
import mod.xtronius.bc_mod.util.GuiXPBlockButtonConfirm;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.tileentity.TileEntityBeacon;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class GuiXPBlock extends GuiContainer
{
    //private static final ResourceLocation xpBlockGuiTextures = new ResourceLocation("textures/gui/container/beacon.png");
    public static final ResourceLocation xpBlockGuiTextures = new ResourceLocation(Reference.MOD_Gui, "textures/gui/XPBlock.png");
    private TileEntityXPBlock xpblock;
    private GuiXPBlockButtonConfirm xpBlockConfirmButton;
    private GuiXPBlockButtonCancel xpBlockCancelButton;
    private boolean buttonsNotDrawn;

    public GuiXPBlock(InventoryPlayer playerInv, TileEntityXPBlock entity)
    {
        super(new ContainerXPBlock(playerInv, entity));
        this.xpblock = entity;
        this.xSize = 230;
        this.ySize = 219;
    }

    /**
     * Adds the buttons (and other controls) to the screen in question.
     */
    public void initGui()
    {
        super.initGui();
        this.buttonList.add(this.xpBlockConfirmButton = new GuiXPBlockButtonConfirm(this, -1, this.guiLeft + 164, this.guiTop + 107));
        this.buttonList.add(new GuiXPBlockButtonCancel(this, -2, this.guiLeft + 190, this.guiTop + 107));
        setDefault();
    }
    public void setDefault() {
    	this.buttonsNotDrawn = true;
        this.xpBlockConfirmButton.enabled = true;
    }
    /**
     * Called from the main game loop to update the screen.
     */
    public void updateScreen()
    {
        super.updateScreen();
        
        if (this.buttonsNotDrawn)
        {
            this.buttonsNotDrawn = false;
            int i;
            int j;
            int k;
            int l = 0;
            GuiXPBlockButtonConfirm guixpblockbuttonpower;
            
            i = 0;
            j = i * 22 + (i - 1) * 2;
            
            for (int i1 = 0; i1 <= 2; ++i1)
            {
                for (k = 0; k < i; ++k)
                {
                	guixpblockbuttonpower = new GuiXPBlockButtonConfirm(this, i1 << 8 | l, this.guiLeft + 76 + k * 24 - j / 2, this.guiTop + 22 + i1 * 25);
                    this.buttonList.add(guixpblockbuttonpower);

//                    if (i1 >= this.beacon.getLevels())
//                    {
//                        guixpblockbuttonpower.enabled = false;
//                    }
//                    else if (l == this.beacon.getPrimaryEffect())
//                    {
//                        guixpblockbuttonpower.func_82254_b(true);
//                    }
                }
            }

            byte b0 = 3;
            i = TileEntityBeacon.effectsList[b0].length + 1;
            j = i * 22 + (i - 1) * 2;

            for (k = 0; k < i - 1; ++k)
            {
                l = TileEntityBeacon.effectsList[b0][k].id;
                guixpblockbuttonpower = new GuiXPBlockButtonConfirm(this, b0 << 8 | l, this.guiLeft + 167 + k * 24 - j / 2, this.guiTop + 47);
                this.buttonList.add(guixpblockbuttonpower);

//                if (b0 >= this.beacon.getLevels())
//                {
//                  guixpblockbuttonpower.enabled = false;
//                }
//                else if (l == this.beacon.getSecondaryEffect())
//                {
//                    guixpblockbuttonpower.func_82254_b(true);
//                }
            }

//            if (this.beacon.getPrimaryEffect() > 0)
//            {
//                GuiBeaconButtonPower guibeaconbuttonpower1 = new GuiBeaconButtonPower(this, b0 << 8 | this.beacon.getPrimaryEffect(), this.guiLeft + 167 + (i - 1) * 24 - j / 2, this.guiTop + 47, this.beacon.getPrimaryEffect(), b0);
//                this.buttonList.add(guibeaconbuttonpower1);
//
//                if (b0 >= this.beacon.getLevels())
//                {
//                    guibeaconbuttonpower1.enabled = false;
//                }
//                else if (this.beacon.getPrimaryEffect() == this.beacon.getSecondaryEffect())
//                {
//                    guibeaconbuttonpower1.func_82254_b(true);
//                }
//            }
            GuiXPBlockButtonConfirm guixpblockpower1 = new GuiXPBlockButtonConfirm(this, b0 << 8, this.guiLeft + 167 + (i - 1) * 24 - j / 2, this.guiTop + 47);
            if(guixpblockpower1.enabled)
        System.out.println("Wasup my Wiger");
        }
        

    }

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    protected void drawGuiContainerForegroundLayer(int par1, int par2)
    {
        RenderHelper.disableStandardItemLighting();
//        this.drawCenteredString(this.fontRenderer, I18n.getString("tile.beacon.primary"), 62, 10, 14737632);
//        this.drawCenteredString(this.fontRenderer, I18n.getString("tile.beacon.secondary"), 169, 10, 14737632);
        Iterator iterator = this.buttonList.iterator();

        while (iterator.hasNext())
        {
            GuiButton guibutton = (GuiButton)iterator.next();

            if (guibutton.func_82252_a())
            {
                guibutton.func_82251_b(par1 - this.guiLeft, par2 - this.guiTop);
                break;
            }
        }

        RenderHelper.enableGUIStandardItemLighting();
    }

    /**
     * Draw the background layer for the GuiContainer (everything behind the items)
     */
    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(xpBlockGuiTextures);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        int i1;
        
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
//        itemRenderer.zLevel = 100.0F;
//        itemRenderer.renderItemAndEffectIntoGUI(this.fontRenderer, this.mc.getTextureManager(), new ItemStack(Item.emerald), k + 42, l + 109);
//        itemRenderer.renderItemAndEffectIntoGUI(this.fontRenderer, this.mc.getTextureManager(), new ItemStack(Item.diamond), k + 42 + 22, l + 109);
//        itemRenderer.renderItemAndEffectIntoGUI(this.fontRenderer, this.mc.getTextureManager(), new ItemStack(Item.ingotGold), k + 42 + 44, l + 109);
//        itemRenderer.renderItemAndEffectIntoGUI(this.fontRenderer, this.mc.getTextureManager(), new ItemStack(Item.ingotIron), k + 42 + 66, l + 109);
//        itemRenderer.zLevel = 0.0F;
        
        if (this.xpblock.isBurning())
        {
            i1 = this.xpblock.getBurnTimeRemainingScaled(12);
            this.drawTexturedModalRect(k + 56, l + 36 + 12 - i1, 176, 12 - i1, 14, i1 + 2);
        }

        i1 = this.xpblock.getCookProgressScaled(24);
        this.drawTexturedModalRect(k + 79, l + 34, 176, 14, i1 + 1, 16);
    }

    public static ResourceLocation getXPBlockGuiTextures()
    {
        return xpBlockGuiTextures;
    }
}
