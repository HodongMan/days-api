package com.hodongman.days.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hodongman.days.repository.ProjectDailyCheckRepository;
import com.hodongman.days.entity.dailycheck.ProjectDailyCheckEntity;

@RestController
public class ProjectDailyCheckController {

    @Autowired
    ProjectDailyCheckRepository repo;

    @GetMapping("/api/project/check")
    public List<ProjectDailyCheckEntity> index() {
        
        List<ProjectDailyCheckEntity> projectList = repo.findAll();
        return projectList;
    }
}