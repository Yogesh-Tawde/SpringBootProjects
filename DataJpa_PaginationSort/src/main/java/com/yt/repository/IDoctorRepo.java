package com.yt.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.yt.entity.Doctor;


public interface IDoctorRepo  extends PagingAndSortingRepository<Doctor,Integer>
{

}
