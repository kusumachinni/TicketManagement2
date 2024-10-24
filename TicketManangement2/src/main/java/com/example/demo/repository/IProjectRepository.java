package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Project;

public interface IProjectRepository extends JpaRepository<Project, Integer> {
//
}
