package com.yt.service;

import org.springframework.data.domain.Page;

import com.yt.entity.Doctor;

public interface IDoctorpagingService 
{
	public Page<Doctor> shoAllDoctorByPageNo(int pageNo,int pageSize,boolean asc,String ...props);

}
