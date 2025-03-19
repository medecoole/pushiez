package net.medecoole.plushiez.block;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.medecoole.plushiez.Plushiez;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block MEDECOOLE_PLUSHIE = register(new MedecoolePlushieBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(1)) {
    }, "medecoole_plushie", true);
    public static final Block ARTHYS_PLUSHIE = register(new MedecoolePlushieBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(1)) {
    }, "arthys_plushie", true);
    public static final Block DREWSBONES_PLUSHIE = register(new MedecoolePlushieBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(1)) {
    }, "drewsbones_plushie", true);
    public static final Block VAL_PLUSHIE = register(new MedecoolePlushieBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(1)) {
    }, "val_plushie", true);
    public static final Block INFINITYFARZAD_PLUSHIE = register(new MedecoolePlushieBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(1)) {
    }, "infinityfarzad_plushie", true);
    public static final Block NETHR_PLUSHIE = register(new MedecoolePlushieBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(1)) {
    }, "nethr_plushie", true);
    public static final Block DOCTOR4T_PLUSHIE = register(new MedecoolePlushieBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(1)) {
    }, "doctor4t_plushie", true);
    public static final Block LUXINTRUS_PLUSHIE = register(new MedecoolePlushieBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(1)) {
    }, "luxintrus_plushie", true);
    public static final Block WINSWEEP_PLUSHIE = register(new MedecoolePlushieBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(1)) {
    }, "winsweep_plushie", true);
    public static final Block DIANSU_PLUSHIE = register(new MedecoolePlushieBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(1)) {
    }, "diansu_plushie", true);
    public static final Block BASIC_PLUSHIE = register(new MedecoolePlushieBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(1)) {
    }, "plushie_base", true);
    public static final Block STEVE_PLUSHIE = register(new MedecoolePlushieBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(1)) {
    }, "steve_plushie", true);
    public static final Block ZOMBIE_PLUSHIE = register(new MedecoolePlushieBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(1)) {
    }, "zombie_plushie", true);
    public static final Block HUSK_PLUSHIE = register(new MedecoolePlushieBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(1)) {
    }, "husk_plushie", true);
    public static final Block SKELETON_PLUSHIE = register(new MedecoolePlushieBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(1)) {
    }, "skeleton_plushie", true);
    public static final Block MISSING_PLUSHIE = register(new MedecoolePlushieBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(1)) {
    }, "missing_plushie", true);
    public static final Block GLITCH_PLUSHIE = register(new MedecoolePlushieBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).strength(1)) {
    }, "glitch_plushie", true);
    public static final Block TALON_PLUSHIE = register(new MedecoolePlushieBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(1)) {
    }, "talon_plushie", true);
    public static final Block KAUPENJOE_PLUSHIE = register(new MedecoolePlushieBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(1)) {
    }, "kaupenjoe_plushie", true);


    public static final Block VILLAGER_PLUSHIE = register(new VillagerPlushieBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(1)) {
    }, "villager_plushie", true);
    public static final Block LIBRARIAN_VILLAGER_PLUSHIE = register(new VillagerPlushieBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(1)) {
    }, "librarian_villager_plushie", true);
    public static final Block WANDERING_TRADER_PLUSHIE = register(new VillagerPlushieBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(1)) {
    }, "wandering_trader_plushie", true);
    public static final Block EVOKER_PLUSHIE = register(new VillagerPlushieBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(1)) {
    }, "evoker_plushie", true);
    public static final Block PILLAGER_PLUSHIE = register(new VillagerPlushieBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(1)) {
    }, "pillager_plushie", true);

    public static final Block PIGLIN_PLUSHIE = register(new PiglinPlushieBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(1)) {
    }, "piglin_plushie", true);
    public static final Block PIGLIN_BRUTE_PLUSHIE = register(new PiglinPlushieBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(1)) {
    }, "piglin_brute_plushie", true);
    public static final Block PANDA_PLUSHIE = register(new PandaPlushieBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL).strength(1)) {
    }, "panda_plushie", true);
    public static Block register(Block block, String name, boolean shouldRegisterItem) {
        Identifier id = Identifier.of(Plushiez.MOD_ID, name);

        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }

        return Registry.register(Registries.BLOCK, id, block);
    }
    public static void initialize() {
    }

}
