package accieo.midas.hunger;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class MidasBlockRenderer {
    
    public static void renderBlocks(){
        BlockRenderLayerMap.INSTANCE.putBlock(MidasBlocks.SWEET_GOLDEN_BERRY_BUSH, RenderLayer.getCutout());
    }

}
