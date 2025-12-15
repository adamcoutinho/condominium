plugins {
    kotlin("jvm")
    kotlin("kapt")
}

group = "com.main.plugin"
version = ""

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    compileOnly("org.pf4j:pf4j:3.14.0")
    kapt("org.pf4j:pf4j:3.14.0")
    implementation(project(":commons"))
    implementation("org.jetbrains.kotlin:kotlin-reflect")
}

kotlin {
    jvmToolchain(21)
}

tasks.test {
    useJUnitPlatform()
}

tasks.jar {
    archiveBaseName.set("plugin-model")
    manifest {
        attributes["Plugin-Class"] = "com.main.plugin.PluginModel"
        attributes["Plugin-Id"] = "plugin-model"
        attributes["Plugin-Version"] = "1.0.0"
        attributes["Plugin-Provider"] = "Dev"
    }
}