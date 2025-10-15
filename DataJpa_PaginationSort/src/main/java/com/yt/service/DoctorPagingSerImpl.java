package com.yt.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.yt.entity.Doctor;
import com.yt.repository.IDoctorRepo1;

@Service("doctorPagingSer")
public class DoctorPagingSerImpl implements IDoctorPagingSer
{
    @Autowired
    private IDoctorRepo1 repo1;
    
	@Override
	public void showDataThroughPaging(int pageSize) 
	{
		long count = repo1.count();
		
		long pagesCount =(count/pageSize);
		if(count%pageSize!=0)
			pagesCount++;
	
		for(int i=0;i<pagesCount;i++)
		{
			PageRequest pageable = PageRequest.of(i, pageSize);
			//getting each page record
			Page<Doctor> page = repo1.findAll(pageable);
			System.out.println("Pages: "+(page.getNumber()+1)+" Records: "+page.getTotalPages());
			page.getContent()
			.forEach(System.out::println);
		}
		
		
	}

}
