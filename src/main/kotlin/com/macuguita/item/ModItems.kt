package com.macuguita.item

import com.macuguita.Coffee
import com.macuguita.item.custom.CoffeeItem
import com.macuguita.item.custom.SleepTimerCheckerItem
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.item.Item
import net.minecraft.item.ItemGroups
import net.minecraft.item.Items
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

object ModItems {

    val COFFEE = registerItem("coffee", CoffeeItem(Item.Settings().food(ModFoodComponents.COFFE)))
    val TIMER_CHECKER = registerItem("timer_checker", SleepTimerCheckerItem(Item.Settings()))

    fun registerItem (name : String, item : Item) : Item {
        return Registry.register(Registries.ITEM, Identifier.of(Coffee.MOD_ID, name), item)
    }

    fun registerModItems() {
        Coffee.LOGGER.info("Registering mod items for " + Coffee.MOD_ID)
    }

    fun registerToVanillaItemGroups() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register { content ->
            content.addBefore(Items.MUSHROOM_STEW, COFFEE)
        }
    }
}