package com.yt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.yt.entity.Doctor;

public interface IDoctorRepo1 extends PagingAndSortingRepository<Doctor,Integer>,CrudRepository<Doctor,Integer>
{

}
