package com.yt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yt.entity.Doctor;

public interface IDoctorRepo  extends JpaRepository<Doctor,Integer> 
{
	public List<Doctor> findByNameEquals(String name);
	
	public Iterable<Doctor> findByNameStartingWith(String prefix);
}