package dev.tryfle.velgear

import dev.tryfle.velgear.util.LoggerUtil
import net.fabricmc.api.ModInitializer

class Velgear : ModInitializer {

    companion object {
        const val MOD_ID = "velgear"
    }
    
    override fun onInitialize() {
        ItemRegistry.register()
        LoggerUtil.logger.info("Velgear initialized.")
    }
}