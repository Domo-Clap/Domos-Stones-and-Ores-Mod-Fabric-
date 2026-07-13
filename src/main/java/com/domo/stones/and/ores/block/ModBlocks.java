package com.domo.stones.and.ores.block;

import com.domo.stones.and.ores.DomoSStonesAndOres;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    // Creates our Serpentinite block object and registers it
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

        // Adds our block item to a creative menu
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).
                register(entries -> entries.add(SERPENTINITE_BLOCK));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).
                register(entries -> entries.add(SERPENTINITE_STAIRS));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).
                register(entries -> entries.add(SERPENTINITE_SLAB));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(POLISHED_SERPENTINITE_BLOCK));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(POLISHED_SERPENTINITE_STAIRS));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(POLISHED_SERPENTINITE_SLAB));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register(entries -> entries.add(SERPENTINITE_BRICKS_BLOCK));
    }
}
