package com.maistroz.maistroz.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maistroz.maistroz.ServiceCategory;
import com.maistroz.maistroz.Service.CategoriesService;

@RestController
@RequestMapping("/api/service-categories")
public class CategoriesController {

	private final CategoriesService categoriesService;
	
	public CategoriesController(CategoriesService catService) {
		this.categoriesService = catService;
	}
	
	
	@GetMapping
	public ServiceCategory[] getAllMaistroz(){
		return categoriesService.categoriesList();
	}

	
	
	
}
