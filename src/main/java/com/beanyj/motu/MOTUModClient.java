package com.beanyj.motu;

import com.beanyj.motu.entity.ModEntities;
import com.beanyj.motu.entity.client.GranamyrModel;
import com.beanyj.motu.entity.client.GranamyrRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class MOTUModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(GranamyrModel.GRANAMYR, GranamyrModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.GRANAMYR, GranamyrRenderer::new);
    }
}
