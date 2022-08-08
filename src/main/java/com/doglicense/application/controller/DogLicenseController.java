package com.doglicense.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.doglicense.application.dao.DogLicenseRepo;
import com.doglicense.application.model.DogLicense;

/**
 * 
 * Dog License Controller to save Dog License Application.
 *
 */
@Controller
public class DogLicenseController {

	@Autowired
	DogLicenseRepo dogLicenseRepo;

	/**
	 * Method to return the default home page for the path "/"
	 * 
	 * @return home page
	 */
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}

	/**
	 * Method to save a new dog license application and return to home page after
	 * successful insertion.
	 * 
	 * @param dogLicense
	 * @return home page
	 */
	@RequestMapping("saveApplication")
	public String saveDogLicense(DogLicense dogLicense) {
		dogLicenseRepo.save(dogLicense);
		return "home.jsp";
	}
}
