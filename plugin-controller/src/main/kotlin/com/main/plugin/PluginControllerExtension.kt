package com.main.plugin

import com.main.commons.IServiceController

class PluginControllerExtension : IServiceController() {

    override fun execute(any: Any): Any? {
        println("${this.javaClass.name} - App-Origin[$any]")
        return "test extension generic[${this.javaClass.name}]"
    }

}