
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.compartido.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.compartido.block.AntorchaBlock;
import net.mcreator.compartido.CompartidoMod;

public class CompartidoModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CompartidoMod.MODID);
	public static final RegistryObject<Block> ANTORCHA = REGISTRY.register("antorcha", () -> new AntorchaBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
