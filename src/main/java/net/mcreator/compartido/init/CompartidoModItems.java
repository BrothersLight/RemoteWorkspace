
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.compartido.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.compartido.item.LanjaronItem;
import net.mcreator.compartido.item.CacaItem;
import net.mcreator.compartido.item.BoladecacaItem;
import net.mcreator.compartido.item.BezoyaItem;
import net.mcreator.compartido.CompartidoMod;

public class CompartidoModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CompartidoMod.MODID);
	public static final RegistryObject<Item> FREYA_SPAWN_EGG = REGISTRY.register("freya_spawn_egg", () -> new ForgeSpawnEggItem(CompartidoModEntities.FREYA, -3355444, -13421773, new Item.Properties()));
	public static final RegistryObject<Item> ANTORCHA = block(CompartidoModBlocks.ANTORCHA);
	public static final RegistryObject<Item> BEZOYA = REGISTRY.register("bezoya", () -> new BezoyaItem());
	public static final RegistryObject<Item> LANJARON = REGISTRY.register("lanjaron", () -> new LanjaronItem());
	public static final RegistryObject<Item> CACA = REGISTRY.register("caca", () -> new CacaItem());
	public static final RegistryObject<Item> BOLADECACA = REGISTRY.register("boladecaca", () -> new BoladecacaItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
