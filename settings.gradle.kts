plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "platform-condominium"
include("orchestrator-api")
include("orchestrator")
include("plugin-model")
include("commons")
include("plugin-controller")