package com.main.orchestratorapi.controller

import org.apache.coyote.Response
import org.pf4j.PluginManager
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/plugin")
class PluginController(private val pluginManager: PluginManager) {

    @GetMapping
    fun listAllPlugins(){
    }

    @PostMapping
    fun commands(): ResponseEntity<Any>{

        return ResponseEntity.ok().build()
    }

}