package com.yt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yt.entity.Politician;
import com.yt.repository.IPoliticianRepo;

@Service("politicianService")
public class PoliticianServiceImpl implements IPoliticianService 
{
    
	@Autowired
	private IPoliticianRepo repo;

	@Override
	public Iterable<Politician> showAllPoliticiansById(Iterable<Integer>id) 
	{
		return repo.findAllById(id);
	}
	

}
