package net.bettermc.expanse.blocks;

import net.bettermc.expanse.ExpanseMain;
import net.bettermc.expanse.blocks.custom.ModFluidBlock;
import net.bettermc.expanse.fluids.ModFluids;
import net.bettermc.expanse.items.ModItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.FurnaceBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.HashSet;
import java.util.Set;

public class BlockRegistry {
    public static final Block STEEL_BLOCK = registerBlock("steel_block",
        new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroups.ORES
    );
    public static final Block OSMIUM_ORE = registerBlock("osmium_ore",
        new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroups.ORES
    );
    public static final Block OSMIUM_BLOCK = registerBlock("osmium_block",
        new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroups.ORES
    );
    public static final Block DEEPSLATE_OSMIUM_ORE = registerBlock("deepslate_osmium_ore",
        new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroups.ORES
    );
    public static final Block DEEPSLATE_URANIUM_ORE = registerBlock("deepslate_uranium_ore",
        new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroups.ORES
    );
    public static final Block URANIUM_ORE = registerBlock("uranium_ore",
        new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroups.ORES
    );

    public static final Block LEAD_ORE = registerBlock("lead_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroups.ORES
    );
    public static final Block DEEPSLATE_LEAD_ORE = registerBlock("deepslate_lead_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroups.ORES
    );
    public static final Block LEAD_BLOCK = registerBlock("lead_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroups.ORES
    );

    public static final Block SILVER_ORE = registerBlock("silver_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroups.ORES
    );
    public static final Block DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroups.ORES
    );
    public static final Block SILVER_BLOCK = registerBlock("silver_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroups.ORES
    );

    public static final Block COBALT_ORE = registerBlock("cobalt_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroups.ORES
    );
    public static final Block DEEPSLATE_COBALT_ORE = registerBlock("deepslate_cobalt_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroups.ORES
    );
    public static final Block COBALT_BLOCK = registerBlock("cobalt_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroups.ORES
    );

    public static final Block TITANIUM_ORE = registerBlock("titanium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroups.ORES
    );
    public static final Block DEEPSLATE_TITANIUM_ORE = registerBlock("deepslate_titanium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroups.ORES
    );
    public static final Block TITANIUM_BLOCK = registerBlock("titanium_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroups.ORES
    );

    // PLANET BLOCKS
    public static final Block MOON_STONE = registerBlock("moon_stone",
        new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ModItemGroups.ORES
    );
    public static final Block MOON_SAND = registerBlock("moon_sand",
        new Block(FabricBlockSettings.of(Material.SOIL).strength(6f).requiresTool()), ModItemGroups.ORES
    );
    public static final Block ELECTRIC_FURNACE = registerBlock("electric_furnace",
        new FurnaceBlock(FabricBlockSettings.of(Material.STONE)
                                            .strength(6f)
                                            .requiresTool()), ModItemGroups.TOOLS
    );

    public static final Block OIL_FLUID_BLOCK = registerBlockWithoutBlockItem("oil_fluid_block",
            new ModFluidBlock(ModFluids.OIL_STILL, FabricBlockSettings.of(Material.WATER)
                    .noCollision().nonOpaque().dropsNothing()), ModItemGroups.ORES);

    public static Set<Block> blocks = new HashSet<>();

    private static Block registerBlockWithoutBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.BLOCK, new Identifier(ExpanseMain.MOD_ID, name), block);
    }
    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(ExpanseMain.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(ExpanseMain.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings().group(group))
        );
    }


    public static void registerModBlocks() {
        System.out.println("Registering Mod Blocks for " + ExpanseMain.MOD_ID);
    }
}
