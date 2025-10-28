package com.yt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yt.entity.BankAccount;

public interface IBankAccountRepository extends JpaRepository<BankAccount, Long> 
{

}
