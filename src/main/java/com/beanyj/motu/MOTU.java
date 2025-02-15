package com.beanyj.motu;

import com.beanyj.motu.entity.ModEntities;
import com.beanyj.motu.entity.custom.GranamyrEntity;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MOTU implements ModInitializer {
	public static final String MOD_ID = "motu";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModEntities.registerModEntities();

		FabricDefaultAttributeRegistry.register(ModEntities.GRANAMYR, GranamyrEntity.createAttributes());
	}
}