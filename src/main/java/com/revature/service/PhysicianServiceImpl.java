package com.revature.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.bindings.PhysicianForm;
import com.revature.entities.Physician;
import com.revature.repository.PhysicianRepo;
@Service
public class PhysicianServiceImpl implements PhysicianService {
	
	@Autowired
	private PhysicianRepo phyRepo;

	@Override
	public String savePhy(PhysicianForm pf) {
		Physician entity = new Physician();
		BeanUtils.copyProperties(pf, entity);
		entity = phyRepo.save(entity);
		if(entity.getpId() !=null) {
			return "Details saved";
		}else {
			return "Details not saved";
		}
	}
	
	

	@Override
	public List<PhysicianForm> viewAll() {
		List<PhysicianForm> dataList = new ArrayList<>();
		List<Physician> findAll = phyRepo.findAll();
		
		for(Physician entity:findAll) {
			PhysicianForm pf = new PhysicianForm();
			BeanUtils.copyProperties(entity, pf);
			dataList.add(pf);
			
		}
		return dataList;
	}

	@Override
	public PhysicianForm editPhy(Integer pId) {
		Optional<Physician> id = phyRepo.findById(pId);
		if(id.isPresent()) {
			Physician entity= id.get();
			PhysicianForm pf = new PhysicianForm();
			BeanUtils.copyProperties(entity, pf);
			return pf;
		}
		return null;
	}

	@Override
	public List<PhysicianForm> deletePhy(Integer pId) {
		phyRepo.deleteById(pId);
		return viewAll();
	}

}
