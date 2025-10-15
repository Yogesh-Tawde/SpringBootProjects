package com.yt.service;

import com.yt.entity.Doctor;

public interface IDoctorService 
{
	public Iterable<Doctor> showDoctInfoBySort(boolean asc,String ...props); 

}
