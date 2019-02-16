package com.hodongman.days.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hodongman.days.entity.project.ProjectEntity;

public interface ProjectRepository extends JpaRepository<ProjectEntity, Long>{}