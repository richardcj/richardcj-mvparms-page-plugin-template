package com.github.richardcj.richardcjmvparmspageplugintemplate.services

import com.github.richardcj.richardcjmvparmspageplugintemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
