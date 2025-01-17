package com.macuguita.datagen

import com.macuguita.item.ModItems
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.client.BlockStateModelGenerator
import net.minecraft.data.client.ItemModelGenerator
import net.minecraft.data.client.Models

class ModModelProvider(output: FabricDataOutput?) : FabricModelProvider(output) {
    override fun generateBlockStateModels(p0: BlockStateModelGenerator?) {
    }

    override fun generateItemModels(p0: ItemModelGenerator?) {
        p0!!.register(ModItems.COFFEE, Models.GENERATED)
    }
}