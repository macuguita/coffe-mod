package com.macuguita.item.custom

import net.minecraft.entity.LivingEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.item.tooltip.TooltipType
import net.minecraft.stat.Stats
import net.minecraft.text.Text
import net.minecraft.util.Colors
import net.minecraft.util.UseAction
import net.minecraft.world.World

class CoffeeItem(settings: Settings?) : Item(settings) {

    override fun getUseAction(stack: ItemStack?): UseAction {
        return UseAction.DRINK
    }

    override fun finishUsing(stack: ItemStack?, world: World?, user: LivingEntity?): ItemStack {
        if (user is PlayerEntity) {
            user!!.resetStat(Stats.CUSTOM.getOrCreateStat(Stats.TIME_SINCE_REST))
        }
        return super.finishUsing(stack, world, user)
    }

    override fun appendTooltip(
        stack: ItemStack?,
        context: TooltipContext?,
        tooltip: MutableList<Text>?,
        type: TooltipType?
    ) {
        tooltip!!.add(Text.translatable("tooltip.coffee.coffee").withColor(Colors.LIGHT_GRAY))
    }
}