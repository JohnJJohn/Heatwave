package com.heatwave.item;

import com.heatwave.HeatWave;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item COPPERNETHERITE_ALLOY = registerItem("copper-netherite_alloy", new Item(new Item.Settings()));



   private static Item registerItem(String name, Item item) {
       return Registry.register(Registries.ITEM, Identifier.of(HeatWave.MOD_ID, name), item);
   }
    public static void registerModItems()
    {
        HeatWave.LOGGER.info("Registering Mod Items for " + HeatWave.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(COPPERNETHERITE_ALLOY);
        });
    }
}
