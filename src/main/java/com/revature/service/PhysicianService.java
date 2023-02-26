package com.revature.service;

import java.util.List;

import com.revature.bindings.PhysicianForm;

public interface PhysicianService {
	public String savePhy(PhysicianForm pf);
	public List<PhysicianForm> viewAll();
	public PhysicianForm editPhy(Integer pId);
	public List<PhysicianForm> deletePhy(Integer pId);

}
