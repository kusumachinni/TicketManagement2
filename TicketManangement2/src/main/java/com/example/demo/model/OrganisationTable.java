package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NonNull;
@Entity
@Data
public class OrganisationTable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer orgId;
	@NonNull
	private String pMangName;
	@NonNull
	private String pMangPassword;
}
