plugins {
    `java-gradle-plugin`
}

sourceSets {
    create("pluginMain")
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