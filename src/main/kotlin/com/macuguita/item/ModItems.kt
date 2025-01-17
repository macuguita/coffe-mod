package com.macuguita.item

import com.macuguita.Coffee
import com.macuguita.item.custom.CoffeeItem
import com.macuguita.item.custom.SleepTimerCheckerItem
import net.minecraft.item.Item
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
        Coffee.LOGGER.info("Registering mod iitems for " + Coffee.MOD_ID)
    }
}