plugins {
    kotlin("jvm")
    id("application")
    id("com.gradleup.shadow") version "9.3.0"
    kotlin("kapt")
}

group = "com.main"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(project(":commons"))
    implementation("org.pf4j:pf4j:3.14.0")

}

kotlin {
    jvmToolchain(21)
}

application {
    mainClass.set("com.main.orchestrator.OrchestratorApplicationKt")
}

tasks.jar {
    archiveBaseName.set("orchestrator")
    archiveVersion.set("")        // remove versão
    archiveClassifier.set("")     // remove classifier
    manifest {
        attributes["Main-Class"] = "com.main.orchestrator.OrchestratorApplicationKt"
    }


    from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })

    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}