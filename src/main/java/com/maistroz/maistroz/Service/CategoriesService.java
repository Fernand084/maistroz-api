package com.maistroz.maistroz.Service;

import org.springframework.stereotype.Service;

import com.maistroz.maistroz.ServiceCategory;

@Service
public class CategoriesService {
	
	public ServiceCategory[] categoriesList(){
		return ServiceCategory.values();
	
	}

}
