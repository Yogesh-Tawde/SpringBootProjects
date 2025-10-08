package com.yt.repository;

import org.springframework.data.repository.CrudRepository;

import com.yt.entity.Doctor;


public interface IDoctorRepo extends CrudRepository<Doctor,Integer>
{

}
