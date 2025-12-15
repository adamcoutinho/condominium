package com.main.orchestratorapi.config

import org.pf4j.spring.SpringPluginManager
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class PluginConfig {
    @Bean
    fun pluginManager(applicationContext: ApplicationContext): SpringPluginManager {
        val springPluginManager: SpringPluginManager = SpringPluginManager()
        springPluginManager.setApplicationContext(applicationContext)
        springPluginManager.init()
        return springPluginManager
    }
}