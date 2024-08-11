package com.maistroz.maistroz;

import org.springframework.stereotype.Service;

@Service
public class CategoriesService {
	
	public ServiceCategory[] categoriesList(){
		return ServiceCategory.values();
	
	}

}
