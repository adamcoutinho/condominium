package com.main.plugin

import com.main.commons.InterfaceService
import org.pf4j.Extension
import org.pf4j.Plugin
import org.pf4j.PluginWrapper

class PluginController: Plugin() {

    override fun start() {
        println("PluginController.start")
    }

    override fun stop() {
        println("PluginController.stop")
    }

}