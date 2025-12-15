package com.main.orchestratorapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OrchestratorApiApplication

fun main(args: Array<String>) {
    runApplication<OrchestratorApiApplication>(*args)
}
