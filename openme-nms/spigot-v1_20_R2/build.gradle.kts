plugins {
    id("openmenms")
}

dependencies {
    compileOnly("org.spigotmc:spigot:1.20.2-R0.1-SNAPSHOT:remapped-mojang")
}

tasks.remap {
    this.version.set("1.20.2")
}
