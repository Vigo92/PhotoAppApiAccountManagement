package com.vigo.photoapp.api.account.management.ui.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountControllers {
	
	
	
	@GetMapping("/status/check")
	public String status() {
		
		return "Working";
	}

}
