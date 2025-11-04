package com.yt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yt.entity.Faculty;

public interface IFacultyRepository extends JpaRepository<Faculty,Integer> 
{

}
