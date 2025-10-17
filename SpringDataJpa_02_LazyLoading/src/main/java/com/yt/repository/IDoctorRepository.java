package com.yt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yt.entity.Doctor;

public interface IDoctorRepository extends JpaRepository<Doctor,Integer> 
{

}
