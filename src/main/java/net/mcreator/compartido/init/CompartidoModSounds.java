
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.compartido.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.compartido.CompartidoMod;

public class CompartidoModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CompartidoMod.MODID);
	public static final RegistryObject<SoundEvent> LIVINGSOUND_FREYA = REGISTRY.register("livingsound_freya", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("compartido", "livingsound_freya")));
	public static final RegistryObject<SoundEvent> HURT_SOUND_FREYA = REGISTRY.register("hurt_sound_freya", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("compartido", "hurt_sound_freya")));
	public static final RegistryObject<SoundEvent> FREYA_LIVING_SOUND_2 = REGISTRY.register("freya_living_sound_2", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("compartido", "freya_living_sound_2")));
}
