package com.revature.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.revature.service.PhysicianService;

@RestController
public class PhysicianRestController {
	
	@Autowired
	private PhysicianService service;

}
