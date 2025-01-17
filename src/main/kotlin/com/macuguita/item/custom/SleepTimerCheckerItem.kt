package com.macuguita.item.custom

import com.macuguita.Coffee
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.server.network.ServerPlayerEntity
import net.minecraft.stat.Stats
import net.minecraft.util.Hand
import net.minecraft.util.TypedActionResult
import net.minecraft.world.World

class SleepTimerCheckerItem(settings: Settings?) : Item(settings) {

    fun getTimeSinceRest(player: PlayerEntity): Int {
        if (player is ServerPlayerEntity) {
            // Fetch the value of the TIME_SINCE_REST stat
            return player.statHandler.getStat(Stats.CUSTOM, Stats.TIME_SINCE_REST)
        }
        return 0 // Default to 0 if the player isn't a ServerPlayerEntity
    }
    override fun use(world: World?, user: PlayerEntity?, hand: Hand?): TypedActionResult<ItemStack> {
        Coffee.LOGGER.info("User's sleep timer is: " + getTimeSinceRest(user!!))
        return super.use(world, user, hand)
    }
}