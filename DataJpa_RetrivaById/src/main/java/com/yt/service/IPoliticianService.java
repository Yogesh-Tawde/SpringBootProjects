package com.yt.service;

import com.yt.entity.Politician;

public interface IPoliticianService 
{
	public Iterable<Politician> showAllPoliticiansById(Iterable<Integer>id);

}
