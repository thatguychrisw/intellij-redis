package com.github.thatguychrisw.intellijredis.services

import com.intellij.openapi.project.Project
import com.github.thatguychrisw.intellijredis.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
