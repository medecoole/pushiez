package net.medecoole.plushiez.block;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.medecoole.plushiez.Plushiez;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PLUSHIEZ = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Plushiez.MOD_ID, "plushiez"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.BASIC_PLUSHIE))
                    .displayName(Text.translatable("itemgroup.plushiez"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BASIC_PLUSHIE);
                        entries.add(ModBlocks.STEVE_PLUSHIE);
                        entries.add(ModBlocks.ZOMBIE_PLUSHIE);
                        entries.add(ModBlocks.HUSK_PLUSHIE);
                        entries.add(ModBlocks.SKELETON_PLUSHIE);
                        entries.add(ModBlocks.VILLAGER_PLUSHIE);
                        entries.add(ModBlocks.LIBRARIAN_VILLAGER_PLUSHIE);
                        entries.add(ModBlocks.WANDERING_TRADER_PLUSHIE);
                        entries.add(ModBlocks.PILLAGER_PLUSHIE);
                        entries.add(ModBlocks.EVOKER_PLUSHIE);
                        entries.add(ModBlocks.PIGLIN_PLUSHIE);
                        entries.add(ModBlocks.PIGLIN_BRUTE_PLUSHIE);
                        entries.add(ModBlocks.PANDA_PLUSHIE);
                        entries.add(ModBlocks.MEDECOOLE_PLUSHIE);
                        entries.add(ModBlocks.DREWSBONES_PLUSHIE);
                        entries.add(ModBlocks.ARTHYS_PLUSHIE);
                        entries.add(ModBlocks.VAL_PLUSHIE);
                        entries.add(ModBlocks.NETHR_PLUSHIE);
                        entries.add(ModBlocks.INFINITYFARZAD_PLUSHIE);
                        entries.add(ModBlocks.DOCTOR4T_PLUSHIE);
                        entries.add(ModBlocks.LUXINTRUS_PLUSHIE);
                        entries.add(ModBlocks.WINSWEEP_PLUSHIE);
                        entries.add(ModBlocks.DIANSU_PLUSHIE);
                        entries.add(ModBlocks.TALON_PLUSHIE);
                        entries.add(ModBlocks.KAUPENJOE_PLUSHIE);
                    }).build());
    public static void registerItemGroups() {
    }
}