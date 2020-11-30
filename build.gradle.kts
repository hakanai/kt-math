plugins {
    id("io.github.gciatto.kt-mpp-pp")
    id("org.danilopianini.git-sensitive-semantic-versioning")
}

repositories {
    gradlePluginPortal()
    mavenCentral()
    maven("https://dl.bintray.com/kotlin/dokka")
    maven("https://jitpack.io")
}

description = "Kotlin MPP Math"
group = "io.github.gciatto"

gitSemVer {
    minimumVersion.set("0.1.0")
    developmentIdentifier.set("dev")
    noTagIdentifier.set("archeo")
    developmentCounterLength.set(2) // How many digits after `dev`
    version = computeGitSemVer() // THIS IS MANDATORY, AND MUST BE LAST IN THIS BLOCK!
}

println("${rootProject.name} version: $version")

kotlinMultiplatform {
    developer("Giovanni Ciatto", "giovanni.ciatto@gmail.com", "http://about.me/gciatto")
}

//publishing {
//    publications.withType<MavenPublication> {
//        println("""
//            name=$name
//            groupId=$groupId
//            version=$version
//        """.trimIndent())
//    }
//}