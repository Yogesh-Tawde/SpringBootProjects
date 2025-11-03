package com.yt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yt.entity.PhoneNumber;

public interface IPhoneNumberRepository  extends JpaRepository<PhoneNumber,Long>
{

}
