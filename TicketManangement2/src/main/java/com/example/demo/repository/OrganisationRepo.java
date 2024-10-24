package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.model.OrganisationTable;

@EnableJpaRepositories
public interface OrganisationRepo extends JpaRepository<OrganisationTable,Integer> {

}
