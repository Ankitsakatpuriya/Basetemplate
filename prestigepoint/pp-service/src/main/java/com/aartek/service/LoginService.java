package com.aartek.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.repository.Loginrepository;

@Service
public class LoginService 
{

	@Autowired
	private Loginrepository loginrepository;
	
        public void showPage()
        
    {
        	loginrepository.showPage();
		System.out.println("inside Service");
	}
	
	
	
	
	
	
}
