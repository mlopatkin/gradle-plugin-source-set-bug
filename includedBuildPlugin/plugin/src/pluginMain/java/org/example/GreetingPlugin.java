package org.example;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class GreetingPlugin implements Plugin<Project> {
    public void apply(Project project) {
        System.out.println("Hello from GreetingPlugin.java");
    }
}