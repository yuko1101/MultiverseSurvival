package io.github.yuko1101.multiversesurvival

import com.onarandombox.MultiverseCore.MultiverseCore
import org.bukkit.Bukkit
import org.bukkit.World
import org.bukkit.WorldType
import org.bukkit.plugin.java.JavaPlugin


class MultiverseSurvival : JavaPlugin() {

    companion object {
        lateinit var core: MultiverseCore
    }

    override fun onEnable() {
        core = Bukkit.getServer().pluginManager.getPlugin("Multiverse-Core") as MultiverseCore

        core.mvWorldManager.addWorld("resource_world", World.Environment.NORMAL, null, WorldType.NORMAL, true, null)
    }

    override fun onDisable() {

    }
}