plugins {
    id("com.gradle.build-scan").version("2.1")
    id("com.github.ben-manes.versions").version("0.20.0")
    id("org.ajoberstar.grgit").version("3.0.0")
    id("com.github.sherter.google-java-format").version("0.8")
    id("net.ltgt.errorprone").version("0.7.1")
}

repositories {
    mavenCentral()
    maven(url = "http://repo.gradle.org/gradle/libs-releases-local")
    maven(url = "https://maven.google.com")
    jcenter()
}

googleJavaFormat {
    toolVersion = "1.7"
    exclude("server/src/test/resources/*")
    exclude("server/out/*")
    exclude("src/test/resources/*")
    exclude("out/*")
}

dependencies {
    errorprone("com.google.errorprone:error_prone_core:2.3.2")
    errorproneJavac("com.google.errorprone:javac:9+181-r4173-1")
}

allprojects {
    repositories {
        mavenCentral()
        maven(url = "http://repo.gradle.org/gradle/libs-releases-local")
        maven(url = "https://maven.google.com")
        jcenter()
    }
}
