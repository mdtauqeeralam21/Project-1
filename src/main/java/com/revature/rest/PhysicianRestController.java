package com.revature.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.bindings.PhysicianForm;
import com.revature.service.PhysicianService;

@RestController
public class PhysicianRestController {
	
	@Autowired
	private PhysicianService service;
	
	@PostMapping("/save")
	public String save(PhysicianForm form) {
		String status=service.savePhy(form);
		return status;
	}
	
	@GetMapping("/view")
	public List<PhysicianForm> viewData(){
		return service.viewAll();
	}

}
