plugins {
    id("java")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17

    withJavadocJar()
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.16.4-R0.1-SNAPSHOT")

    compileOnly(project(":openme-nms:api"))

}
