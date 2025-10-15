package com.yt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.yt.entity.Doctor;
import com.yt.repository.IDoctorRepo;

@Service("doctorPagingService")
public class DoctorPagingServiceImpl implements IDoctorpagingService 
{
	@Autowired
	private IDoctorRepo doctorRepo;

	@Override
	public Page<Doctor> shoAllDoctorByPageNo(int pageNo, int pageSize, boolean asc, String... props) 
	{
		
		Sort sort = Sort.by(asc ? Direction.ASC :Direction.DESC,props);
		
		PageRequest pageable = PageRequest.of(pageNo, pageSize, sort);
		
		Page<Doctor> page = doctorRepo.findAll(pageable);
		return page;
	}

}
