package com.hodongman.days.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hodongman.days.repository.ProjectRepository;
import com.hodongman.days.entity.project.ProjectEntity;

@RestController
public class ProjectController {

    @Autowired
    ProjectRepository repo;

    @GetMapping("/api/project")
    public List<ProjectEntity> index() {
        
        List<ProjectEntity> projectList = repo.findAll();
        return projectList;
    }
}