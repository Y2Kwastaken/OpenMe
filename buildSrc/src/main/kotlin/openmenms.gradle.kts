plugins {
    id("java")
    id("io.github.patrick.remapper")
}

dependencies {
    compileOnly(project(":openme-nms:api"))
}

tasks.jar {
    finalizedBy(tasks.remap)
}
