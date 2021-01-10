package com.github.tangjing1989.ideaplugindemo.services

import com.intellij.openapi.project.Project
import com.github.tangjing1989.ideaplugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
