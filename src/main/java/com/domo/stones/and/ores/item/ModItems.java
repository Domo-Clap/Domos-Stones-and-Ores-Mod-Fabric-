package com.domo.stones.and.ores.item;

import java.util.function.Function;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.BuiltinRegistries;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

import com.domo.stones.and.ores.DomoSStonesAndOres;

public class ModItems {



    public static <T extends Item> T register(
            String name,
            Function<Item.Settings, T> itemFactory,
            Item.Settings settings
    ) {
        // Create the identifier
        Identifier id = Identifier.of(DomoSStonesAndOres.MOD_ID, name);

        // Create the item
        T item = itemFactory.apply(settings);

        // Register it
        return Registry.register(Registries.ITEM, id, item);
    }

    public static void registerModItems() {
        DomoSStonesAndOres.LOGGER.info("Registering Mod Items for " + DomoSStonesAndOres.MOD_ID);

        // ItemGroupEvents is a Fabric API class that is pretty much a collection of events related to creative
        // item groups.

        // .modifyEntriesEvent is a type of event from the ItemGroupEvents class. Basically us telling fabric to modify
        // the contents of one of Minecraft's creative tabs. In this case, we select ItemGroups.INGREDIENTS

        // The register function takes the event we get returned from .modifyEntriesEvent, and says, when we catch the event
        // add this item to the creative tab

        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).
         //       register(entries -> entries.add(ModItems.PURPLE_SLIME_BALL));

        // The entries list is basically the following:
        // When Minecraft is building the Ingredients tab, it creates a collection of items.
        //
        //Fabric hands you that collection, which is basically a list of MC items called entries
        // And we are just adding to it via the lambda
    }
}
