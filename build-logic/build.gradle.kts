plugins {
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.serialization) apply false
    alias(libs.plugins.buildconfig) apply false
    alias(libs.plugins.vanniktech.maven.publish) apply false
    id("gobley-gradle-build") apply false
}

tasks.register("publishAllToMavenLocal") {
    group = "publishing"
    description = "Publishes all build-logic plugins to Maven Local"

    dependsOn(subprojects.mapNotNull { it.tasks.findByName("publishToMavenLocal") })
}