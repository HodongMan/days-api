package com.hodongman.days.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hodongman.days.entity.option.ProjectOptionEntity;;

public interface ProjectOptionRepository extends JpaRepository<ProjectOptionEntity, Long>{}