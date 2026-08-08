package com.domo.stones.and.ores.block;

import com.domo.stones.and.ores.DomoSStonesAndOres;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    // -----------------------------------------
    // Base Serpentinite block types
    // -----------------------------------------
    public static final Block SERPENTINITE_BLOCK = registerBlock(
            "serpentinite_block",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(1.5f, 3.5f))
    );

    public static final Block SERPENTINITE_STAIRS = registerBlock(
            "serpentinite_stairs",
            new StairsBlock(SERPENTINITE_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .strength(1.5f, 3.5f))
    );

    public static final Block SERPENTINITE_SLAB = registerBlock(
            "serpentinite_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(1.5f, 3.5f))
    );

    public static final Block SERPENTINITE_WALL = registerBlock(
            "serpentinite_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(1.5f, 3.5f))
    );

    // -----------------------------------------
    // Polished Serpentinite block types
    // -----------------------------------------
    public static final Block POLISHED_SERPENTINITE_BLOCK = registerBlock(
      "polished_serpentinite_block",
      new Block(AbstractBlock.Settings.create()
              .requiresTool()
              .strength(1.5f, 3.5f))
    );

    public static final Block POLISHED_SERPENTINITE_STAIRS = registerBlock(
      "polished_serpentinite_stairs",
      new StairsBlock(POLISHED_SERPENTINITE_BLOCK.getDefaultState(),
              AbstractBlock.Settings.create()
                      .requiresTool().strength(1.5f, 3.5f))
    );

    public static final Block POLISHED_SERPENTINITE_SLAB = registerBlock(
        "polished_serpentinite_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(1.5f, 3.5f))
    );

    public static final Block POLISHED_SERPENTINITE_WALL = registerBlock(
            "polished_serpentinite_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(1.5f, 3.5f))
    );

    // -----------------------------------------
    // Serpentinite Brick block types
    // -----------------------------------------
    public static final Block SERPENTINITE_BRICKS_BLOCK = registerBlock(
            "serpentinite_bricks_block",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(1.5f, 3.5f))
    );

    public static final Block SERPENTINITE_BRICKS_STAIRS = registerBlock(
            "serpentinite_bricks_stairs",
            new StairsBlock(SERPENTINITE_BRICKS_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .strength(1.5f, 3.5f))
    );

    public static final Block SERPENTINITE_BRICKS_SLAB = registerBlock(
            "serpentinite_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(1.5f, 3.5f))
    );

    public static final Block SERPENTINITE_BRICKS_WALL = registerBlock(
            "serpentinite_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(1.5f, 3.5f))
    );

    // -----------------------------------------
    // Caen Stone block types
    // -----------------------------------------
    public static final Block CAEN_STONE_BLOCK = registerBlock(
            "caen_stone_block",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(1.5f, 3.5f))
    );

    public static final Block CAEN_STONE_STAIRS = registerBlock(
            "caen_stone_stairs",
            new StairsBlock(CAEN_STONE_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .strength(1.5f, 3.5f))
    );

    public static final Block CAEN_STONE_SLAB = registerBlock(
      "caen_stone_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(1.5f, 3.5f))
    );

    public static final Block CAEN_STONE_WALL = registerBlock(
            "caen_stone_wall",
            new WallBlock(AbstractBlock.Settings.copy(Blocks.ANDESITE_WALL))
    );

    // -----------------------------------------
    // Caen Stone Bricks block types
    // -----------------------------------------
    public static final Block CAEN_STONE_BRICKS = registerBlock(
            "caen_stone_bricks_block",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(0.5f, 2.5f))
    );

    public static final Block CAEN_STONE_BRICKS_STAIRS = registerBlock(
            "caen_stone_bricks_stairs",
            new StairsBlock(CAEN_STONE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .strength(0.5f, 2.5f))
    );

    public static final Block CAEN_STONE_BRICKS_SLAB = registerBlock(
            "caen_stone_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(0.5f, 2.5f))
    );

    public static final Block CAEN_STONE_BRICKS_WALL = registerBlock(
            "caen_stone_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create()
                            .requiresTool()
                            .strength(0.5f, 2.5f))
    );

    // -----------------------------------------
    // Cobbled Caen Stone block types
    // -----------------------------------------
    public static final Block COBBLED_CAEN_STONE = registerBlock(
            "cobbled_caen_stone_block",
                new Block(AbstractBlock.Settings.create()
                        .requiresTool()
                        .strength(0.5f, 2.5f))
    );

    public static final Block COBBLED_CAEN_STONE_STAIRS = registerBlock(
      "cobbled_caen_stone_stairs",
      new StairsBlock(COBBLED_CAEN_STONE.getDefaultState(),
              AbstractBlock.Settings.create()
                      .requiresTool()
                      .strength(0.5f, 2.5f))
    );

    public static final Block COBBLED_CAEN_STONE_SLAB = registerBlock(
            "cobbled_caen_stone_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(0.5f, 2.5f))
    );

    public static final Block COBBLED_CAEN_STONE_WALL = registerBlock(
    "cobbled_caen_stone_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(0.5f, 2.5f)
            )
    );

    // -----------------------------------------
    // Blueschist block types
    // -----------------------------------------
    public static final Block BLUESCHIST_BLOCK = registerBlock(
            "blueschist_block",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(0.5f, 2.5f))
    );

    public static final Block BLUESCHIST_SLAB = registerBlock(
            "blueschist_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(0.5f, 2.5f))
    );

    public static final Block BLUESCHIST_STAIRS = registerBlock(
      "blueschist_stairs",
            new StairsBlock(BLUESCHIST_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .strength(0.5f, 2.5f))
    );

    public static final Block BLUESCHIST_WALL = registerBlock(
            "blueschist_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(0.5f, 2.5f)
            )
    );

    // -----------------------------------------
    // Polished Blueschist block types
    // -----------------------------------------
    public static final Block POLISHED_BLUESCHIST_BLOCK = registerBlock(
            "polished_blueschist_block",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(0.5f, 2.5f))
    );

    public static final Block POLISHED_BLUESCHIST_SLAB = registerBlock(
            "polished_blueschist_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(0.5f, 2.5f))
    );

    public static final Block POLISHED_BLUESCHIST_STAIRS = registerBlock(
            "polished_blueschist_stairs",
            new StairsBlock(BLUESCHIST_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .strength(0.5f, 2.5f))
    );

    public static final Block POLISHED_BLUESCHIST_WALL = registerBlock(
            "polished_blueschist_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(0.5f, 2.5f)
            )
    );

    // -----------------------------------------
    // Blueschist Brick block types
    // -----------------------------------------
    public static final Block BLUESCHIST_BRICKS_BLOCK = registerBlock(
            "blueschist_bricks_block",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(0.5f, 2.5f))
    );

    public static final Block BLUESCHIST_BRICKS_SLAB = registerBlock(
            "blueschist_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(0.5f, 2.5f))
    );

    public static final Block BLUESCHIST_BRICKS_STAIRS = registerBlock(
            "blueschist_bricks_stairs",
            new StairsBlock(BLUESCHIST_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .strength(0.5f, 2.5f))
    );

    public static final Block BLUESCHIST_BRICKS_WALL = registerBlock(
            "blueschist_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(0.5f, 2.5f)
            )
    );

    // -----------------------------------------
    // Blueschist Large Brick block types
    // -----------------------------------------
    public static final Block BLUESCHIST_LARGE_BRICKS_BLOCK = registerBlock(
            "blueschist_large_bricks_block",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(0.5f, 2.5f))
    );

    public static final Block BLUESCHIST_LARGE_BRICKS_SLAB = registerBlock(
            "blueschist_large_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(0.5f, 2.5f))
    );

    public static final Block BLUESCHIST_LARGE_BRICKS_STAIRS = registerBlock(
            "blueschist_large_bricks_stairs",
            new StairsBlock(BLUESCHIST_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .strength(0.5f, 2.5f))
    );

    public static final Block BLUESCHIST_LARGE_BRICKS_WALL = registerBlock(
            "blueschist_large_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(0.5f, 2.5f)
            )
    );

    // -----------------------------------------
    // Dolomite block types
    // -----------------------------------------
    public static final Block DOLOMITE_BLOCK = registerBlock(
            "dolomite_block",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(0.5f, 2.5f))
    );

    public static final Block DOLOMITE_SLAB = registerBlock(
            "dolomite_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(0.5f, 2.5f))
    );

    public static final Block DOLOMITE_STAIRS = registerBlock(
            "dolomite_stairs",
            new StairsBlock(DOLOMITE_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .strength(0.5f, 2.5f))
    );

    public static final Block DOLOMITE_WALL = registerBlock(
            "dolomite_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(0.5f, 2.5f)
            )
    );

    // -----------------------------------------
    // Dolomite Brick block types
    // -----------------------------------------
    public static final Block DOLOMITE_BRICKS_BLOCK = registerBlock(
            "dolomite_bricks_block",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(0.5f, 2.5f))
    );

    public static final Block DOLOMITE_BRICKS_SLAB = registerBlock(
            "dolomite_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(0.5f, 2.5f))
    );

    public static final Block DOLOMITE_BRICKS_STAIRS = registerBlock(
            "dolomite_bricks_stairs",
            new StairsBlock(DOLOMITE_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .strength(0.5f, 2.5f))
    );

    public static final Block DOLOMITE_BRICKS_WALL = registerBlock(
            "dolomite_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(0.5f, 2.5f)
            )
    );


    // Function that takes our block and registers it into the correct registry
    public static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);

        return Registry.register(
                Registries.BLOCK,
                Identifier.of(DomoSStonesAndOres.MOD_ID, name),
                block
        );
    }

    // The Registry.register function is what we use to register/add our item to minecrafts existing registers

    // The first param Registries.ITEM is the register we are adding to
    // The second param is the id of our object we are adding to the register
    // The third param is the specific object we are storing. In this case, it is a new BlockItem obj
    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(
                Registries.ITEM,
                Identifier.of(DomoSStonesAndOres.MOD_ID, name),
                new BlockItem(block, new Item.Settings())
        );

        // A BlockItem is simply a special subclass of Item that tells minecraft that this item is placeable as a block
        // The BlockItem object contains an internal ref to the block object itself
    }

    public static void registerBlocks() {
        DomoSStonesAndOres.LOGGER.info("Registering Mod Blocks for " + DomoSStonesAndOres.MOD_ID);

        // Base serpentinite ore blocks being added to the Building Blocks creative tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).
                register(entries -> entries.add(SERPENTINITE_BLOCK));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).
                register(entries -> entries.add(SERPENTINITE_STAIRS));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).
                register(entries -> entries.add(SERPENTINITE_SLAB));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).
                register(entries -> entries.add(SERPENTINITE_WALL));

        // Polished serpentinite blocks being added to the Building Blocks creative tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(POLISHED_SERPENTINITE_BLOCK));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(POLISHED_SERPENTINITE_STAIRS));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(POLISHED_SERPENTINITE_SLAB));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(POLISHED_SERPENTINITE_WALL));

        // Brick blocks being added to the Building Blocks creative tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(SERPENTINITE_BRICKS_BLOCK));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(SERPENTINITE_BRICKS_STAIRS));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(SERPENTINITE_BRICKS_SLAB));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(SERPENTINITE_BRICKS_WALL));

        // Caen Stone
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(CAEN_STONE_BLOCK));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(CAEN_STONE_STAIRS));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(CAEN_STONE_SLAB));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(CAEN_STONE_WALL));


        // Caen Stone Bricks
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(CAEN_STONE_BRICKS));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(CAEN_STONE_BRICKS_STAIRS));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(CAEN_STONE_BRICKS_SLAB));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(CAEN_STONE_BRICKS_WALL));

        // Cobbled Caen Stone
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(COBBLED_CAEN_STONE));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(COBBLED_CAEN_STONE_STAIRS));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(COBBLED_CAEN_STONE_SLAB));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(COBBLED_CAEN_STONE_WALL));

        // Blueschist
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(BLUESCHIST_BLOCK));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(BLUESCHIST_STAIRS));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(BLUESCHIST_SLAB));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(BLUESCHIST_WALL));

        //Polished Blueschist
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(POLISHED_BLUESCHIST_BLOCK));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(POLISHED_BLUESCHIST_STAIRS));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(POLISHED_BLUESCHIST_SLAB));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(POLISHED_BLUESCHIST_WALL));

        //Blueschist Bricks
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(BLUESCHIST_BRICKS_BLOCK));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(BLUESCHIST_BRICKS_STAIRS));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(BLUESCHIST_BRICKS_SLAB));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(BLUESCHIST_BRICKS_WALL));

        //Blueschist Large Bricks
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(BLUESCHIST_LARGE_BRICKS_BLOCK));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(BLUESCHIST_LARGE_BRICKS_STAIRS));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(BLUESCHIST_LARGE_BRICKS_SLAB));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(BLUESCHIST_LARGE_BRICKS_WALL));

        //Dolomite
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(DOLOMITE_BLOCK));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(DOLOMITE_STAIRS));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(DOLOMITE_SLAB));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(DOLOMITE_WALL));

        //Dolomite
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(DOLOMITE_BRICKS_BLOCK));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(DOLOMITE_BRICKS_STAIRS));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(DOLOMITE_BRICKS_SLAB));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(DOLOMITE_BRICKS_WALL));
    }
}
