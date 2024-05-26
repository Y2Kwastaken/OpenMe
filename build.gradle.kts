plugins {
    id("java-library")
    id("maven-publish")
    id("io.freefair.aggregate-javadoc-jar") version "8.4"
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":openme-core"))
    implementation(project(":openme-nms"))
}

tasks.build {
    this.dependsOn(tasks.shadowJar)
}

subprojects {
    apply(plugin = "java")

    java {
        disableAutoTargetJvm()
        toolchain.languageVersion = JavaLanguageVersion.of(21)
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    dependencies {
        compileOnly("org.jetbrains:annotations-java5:24.0.1")
    }

    tasks.compileJava {
        options.encoding = "UTF-8"
    }

    tasks.test {
        useJUnitPlatform()
        testLogging {
            events("PASSED", "SKIPPED", "FAILED", "STANDARD_OUT", "STANDARD_ERROR")
        }
    }

    tasks.withType<Javadoc> {
        exclude("sh/miles/openme/nms/impl/**")
    }
}

tasks.withType<Javadoc> {
    val options = this.options
    if (options !is StandardJavadocDocletOptions) return@withType
    options.addStringOption("Xdoclint:none", "-quiet")
    options.links(
        "https://docs.oracle.com/en/java/javase/17/docs/api/",
        "https://hub.spigotmc.org/javadocs/spigot/",
        "https://javadoc.io/doc/org.jetbrains/annotations-java5/24.0.1",
    )
    options.encoding = "UTF-8"
}

publishing {
    publications {
        create<MavenPublication>("Maven") {
            project.shadow.component(this)
            this.artifact(tasks.aggregateJavadocJar)
        }
    }

    repositories {
        maven("https://maven.miles.sh/libraries") {
            credentials {
                this.username = System.getenv("PINEAPPLE_REPOSILITE_USERNAME")
                this.password = System.getenv("PINEAPPLE_REPOSILITE_PASSWORD")
            }
        }
    }
}

