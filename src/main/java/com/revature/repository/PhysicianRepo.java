package com.revature.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.entities.Physician;

public interface PhysicianRepo extends JpaRepository<Physician, Serializable> {

}
