plugins {
    kotlin("jvm") version "1.8.21"
}

group = "com.github.softwaresale"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.1")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.8.21")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}