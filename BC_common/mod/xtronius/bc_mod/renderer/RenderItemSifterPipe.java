package mod.xtronius.bc_mod.renderer;

import mod.xtronius.bc_mod.tileEntity.TileEntitySifterPipe;
import mod.xtronius.bc_mod.tileEntity.Model.ModelPipe;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class RenderItemSifterPipe implements IItemRenderer{

	public ModelPipe model; 
	
	public RenderItemSifterPipe(){
		model = new ModelPipe();
	}
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
	return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) {
	return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		TileEntityRenderer.instance.renderTileEntityAt(new TileEntitySifterPipe(), 0.0D, 0.0D, 0.0D, 0.0F);
		
	}

}
