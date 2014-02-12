package mod.xtronius.bc_mod.renderer;


import mod.xtronius.bc_mod.blocks.Misc.BaseMetalFence;
import mod.xtronius.bc_mod.proxy.ClientProxy;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

/*public class RenderCustomBlocks
  implements ISimpleBlockRenderingHandler
{
	RenderBlocks renderblocks = new RenderBlocks();
  public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer)
  {
    
  }

  public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, BaseMetalFence block, int modelId, RenderBlocks renderer)
  {
    if (modelId == ClientProxy.renderBCFenceID)
    {
    	renderBlockBCFence(world, block, x, y, z, renderer);
    }
    

    return true;
  }

  public boolean shouldRender3DInInventory()
  {
    return true;
  }

  public int getRenderId()
  {
    return 0;
  }
  public boolean renderBlockBCFence(IBlockAccess world, Block par1BlockFence, int x, int y, int z, RenderBlocks renderer)
  {
      boolean flag = false;
      float f = 0.375F;
      float f1 = 0.625F;
      renderblocks.setRenderBounds((double)f, 0.0D, (double)f, (double)f1, 1.0D, (double)f1);
      renderblocks.renderStandardBlock(par1BlockFence, x, y, z);
      flag = true;
      boolean flag1 = false;
      boolean flag2 = false;

      if (BaseMetalFence.canConnectFenceTo(renderblocks.blockAccess, x - 1, y, z) || BaseMetalFence.canConnectFenceTo(renderblocks.blockAccess, x + 1, y, z))
      {
          flag1 = true;
      }

      if (BaseMetalFence.canConnectFenceTo(renderblocks.blockAccess, x, y, z - 1) || BaseMetalFence.canConnectFenceTo(renderblocks.blockAccess, x, y, z + 1))
      {
          flag2 = true;
      }

      boolean flag3 = BaseMetalFence.canConnectFenceTo(renderblocks.blockAccess, x - 1, y, z);
      boolean flag4 = BaseMetalFence.canConnectFenceTo(renderblocks.blockAccess, x + 1, y, z);
      boolean flag5 = BaseMetalFence.canConnectFenceTo(renderblocks.blockAccess, x, y, z - 1);
      boolean flag6 = BaseMetalFence.canConnectFenceTo(renderblocks.blockAccess, x, y, z + 1);

      if (!flag1 && !flag2)
      {
          flag1 = true;
      }

      f = 0.4375F;
      f1 = 0.5625F;
      float f2 = 0.75F;
      float f3 = 0.9375F;
      float f4 = flag3 ? 0.0F : f;
      float f5 = flag4 ? 1.0F : f1;
      float f6 = flag5 ? 0.0F : f;
      float f7 = flag6 ? 1.0F : f1;

      if (flag1)
      {
    	  renderblocks.setRenderBounds((double)f4, (double)f2, (double)f, (double)f5, (double)f3, (double)f1);
    	  renderblocks.renderStandardBlock(par1BlockFence, x, y, z);
          flag = true;
      }

      if (flag2)
      {
    	  renderblocks.setRenderBounds((double)f, (double)f2, (double)f6, (double)f1, (double)f3, (double)f7);
    	  renderblocks.renderStandardBlock(par1BlockFence, x, y, z);
          flag = true;
      }

      f2 = 0.375F;
      f3 = 0.5625F;

      if (flag1)
      {
    	  renderblocks.setRenderBounds((double)f4, (double)f2, (double)f, (double)f5, (double)f3, (double)f1);
    	  renderblocks.renderStandardBlock(par1BlockFence, x, y, z);
          flag = true;
      }

      if (flag2)
      {
    	  renderblocks.setRenderBounds((double)f, (double)f2, (double)f6, (double)f1, (double)f3, (double)f7);
    	  renderblocks.renderStandardBlock(par1BlockFence, x, y, z);
          flag = true;
      }

      par1BlockFence.setBlockBoundsBasedOnState(renderblocks.blockAccess, x, y, z);
      return flag;
  }

  @Override
  public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
	if (modelId == ClientProxy.renderBCFenceID)
    {
    	renderBlockBCFence(world, block, x, y, z, renderer);
    }
    

    return false;

}
}*/