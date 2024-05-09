package net.mcreator.compartido.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.compartido.entity.FreyaEntity;

public class FreyaModel extends GeoModel<FreyaEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreyaEntity entity) {
		return new ResourceLocation("compartido", "animations/freya.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreyaEntity entity) {
		return new ResourceLocation("compartido", "geo/freya.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreyaEntity entity) {
		return new ResourceLocation("compartido", "textures/entities/" + entity.getTexture() + ".png");
	}

}
