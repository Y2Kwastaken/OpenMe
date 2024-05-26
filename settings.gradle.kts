rootProject.name = "OpenMe"

gradle.rootProject {
    this.version = "1.0.2-SNAPSHOT"
    this.group = "sh.miles"
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        mavenLocal()
        maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    }
}

include("openme-core", "openme-nms")
file("openme-nms").listFiles()?.forEach { project ->
    if (project.resolve("build.gradle.kts").exists()) run {
        include("openme-nms:${project.name}")
    }
}
