plugins {
    id("java")
}

dependencies {
    for (subproject in subprojects) {
        implementation(subproject)
    }
}
