package com.yt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yt.repository.IPersonRepository;


@Service
public class AssociationMgmtServiceImpl implements IAssociationMgmtService
{
	
	@Autowired
	private IPersonRepository perRepo;

	@Override
	public List<Object[]> fetchDataByJoinUningParent() 
	{
		
		return perRepo.fetchDataByUsingParent();
	}
	
	
	
}
