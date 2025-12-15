    package com.main.orchestrator

    import com.main.commons.IServiceController
    import com.main.commons.InterfaceService
    import org.pf4j.DefaultPluginManager
    import org.pf4j.PluginManager
    import java.nio.file.Paths

    fun main(args: Array<String>) {
        println("init project")
    //    val path = Paths.get("plugin-model/build/libs/plugin-model.jar")


        val pluginManager: PluginManager = DefaultPluginManager()
        pluginManager.loadPlugins()
        pluginManager.startPlugins()
        val plugins =  pluginManager.plugins
        plugins.forEach { plugin ->
            println("  - ${plugin.pluginId} (state: ${plugin.pluginState})")
        }

        val interfaces: List<IServiceController> = pluginManager.getExtensions(IServiceController::class.java)

        println("\nExtensions InterfaceService:")
        interfaces.forEach { ext ->
            println("  - ${ext.javaClass.name} -> Result: ${ext.execute("orchestratorApplication")}")
        }
        println("Total search extensions: ${interfaces.size}")

        println("\nExtension add classpath:")
        val classpathExtensions = pluginManager.getExtensionClassNames(InterfaceService::class.java.name)
        classpathExtensions.forEach { println("  - $it") }

        println("\nExtensions by Plugin:")
        val startedPlugins = pluginManager.getStartedPlugins()
        for (plugin in startedPlugins) {
            val pluginId = plugin.pluginId
            val pluginExtensions = pluginManager.getExtensionClassNames(pluginId)
            println("Plugin '$pluginId' add extensions:")
            pluginExtensions.forEach { println("  - $it") }
        }

        pluginManager.stopPlugins()


    }