package com.hodongman.days.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hodongman.days.repository.ProjectOptionRepository;
import com.hodongman.days.entity.option.ProjectOptionEntity;

@RestController
public class ProjectOptionController {

    @Autowired
    ProjectOptionRepository repo;

    @GetMapping("/api/project/option")
    public List<ProjectOptionEntity> index() {
        
        List<ProjectOptionEntity> projectList = repo.findAll();
        return projectList;
    }
}