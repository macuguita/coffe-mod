package com.macuguita

import com.macuguita.item.ModItems
import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object Coffee : ModInitializer {
	const val MOD_ID = "coffee"
    val LOGGER = LoggerFactory.getLogger("test")

	override fun onInitialize() {
		ModItems.registerModItems()
	}
}