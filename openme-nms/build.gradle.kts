plugins {
    id("java")
}

dependencies {
    for (subproject in subprojects) {
        implementation(subproject)
    }
}

tasks.register("upgradeNMS", OpenMeNMS::class) {
    group = "nms"
    description = "upgrades the NMS version"
}

