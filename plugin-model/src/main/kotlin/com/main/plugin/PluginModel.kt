package com.main.plugin

import com.main.commons.InterfaceService
import org.pf4j.Extension
import org.pf4j.Plugin

class PluginModel: Plugin() {

    override fun start() {
        println("PluginModel.start()")
    }

    override fun stop() {
        println("PluginModel.stop()")
    }



}