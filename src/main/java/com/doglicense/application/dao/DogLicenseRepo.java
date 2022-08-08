package com.doglicense.application.dao;

import org.springframework.data.repository.CrudRepository;

import com.doglicense.application.model.DogLicense;

public interface DogLicenseRepo extends CrudRepository<DogLicense, Integer> {
	
}
