plugins {
    kotlin("jvm")
    kotlin("kapt")
}

group = "com.main.commons"
version = ""

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation(kotlin("stdlib"))
    compileOnly("org.pf4j:pf4j:3.14.0"){
        exclude(group = "org.slf4j")
    }
}

kotlin {
    jvmToolchain(21)
}

tasks.test {
    useJUnitPlatform()
}