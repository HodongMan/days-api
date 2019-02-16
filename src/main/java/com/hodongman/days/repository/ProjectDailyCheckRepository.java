package com.hodongman.days.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hodongman.days.entity.dailycheck.ProjectDailyCheckEntity;

public interface ProjectDailyCheckRepository extends JpaRepository<ProjectDailyCheckEntity, Long>{}