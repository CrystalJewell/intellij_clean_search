package com.github.crystaljewell.intellijcleansearch.services

import com.github.crystaljewell.intellijcleansearch.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
