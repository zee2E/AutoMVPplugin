package com.github.zee2e.automvpplugin.services

import com.github.zee2e.automvpplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
