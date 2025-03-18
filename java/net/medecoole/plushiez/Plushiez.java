package net.medecoole.plushiez;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.medecoole.plushiez.block.ModBlocks;
import net.medecoole.plushiez.block.ModItemGroups;
import net.medecoole.plushiez.util.ModLootTableModifiers;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Plushiez implements ModInitializer {
	public static final String MOD_ID = "plushiez";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	private static final Identifier BASTON_TREASURE_ID =
			Identifier.of("minecraft", "chests/bastion_treasure");
	@Override
	public void onInitialize() {
		ModBlocks.initialize();
		FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(modContainer -> {
			ResourceManagerHelper.registerBuiltinResourcePack(
					Identifier.of(MOD_ID,"no-layers"),
					modContainer,
					ResourcePackActivationType.NORMAL
			);
		});
		ModItemGroups.registerItemGroups();
		ModLootTableModifiers.modifyLootTables();
	}
}