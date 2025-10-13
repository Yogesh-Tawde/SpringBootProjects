package com.yt.repository;

import org.springframework.data.repository.CrudRepository;

import com.yt.entity.Politician;

public interface IPoliticianRepo extends CrudRepository<Politician,Integer> 
{

}
