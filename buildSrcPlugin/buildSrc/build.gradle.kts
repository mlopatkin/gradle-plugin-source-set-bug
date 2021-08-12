plugins {
    `java-gradle-plugin`
    `groovy-gradle-plugin`
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

sourceSets {
    create("pluginMain") {
        compileClasspath = sourceSets.findByName("main")!!.compileClasspath
    }
}

gradlePlugin {
    pluginSourceSet(sourceSets.findByName("pluginMain"))
    plugins {
        create("simplePlugin") {
            id = "org.example.greeting"
            implementationClass = "org.example.GreetingPlugin"
        }
    }
}