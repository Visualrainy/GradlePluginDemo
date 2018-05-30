package com.plugin.guild.gradleplugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class GradlePlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.extensions.create('gradlePluginConf', GradlePluginExtensions)

        project.gradle.addListener(new GradleTaskListener())

        project.task('gradlePluginTesting') doLast {
            def closure = project['gradlePluginConf'].testMap

            def result = closure('Peng!!!')
            println "task result is ${result}"
            println "url is ${project['gradlePluginConf'].url}"
        }
    }
}