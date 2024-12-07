plugins {
    kotlin("jvm") version "2.1.0"
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.1")
    testImplementation("io.kotest:kotest-runner-junit5:5.8.0")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.10.1")
    implementation(kotlin("stdlib-jdk8"))
}

tasks {
    wrapper {
        gradleVersion = "8.11.1"
    }
}
repositories {
    mavenCentral()
}
kotlin {
    jvmToolchain(21)
}