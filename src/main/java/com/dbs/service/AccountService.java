package com.dbs.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.beans.Account;
import com.dbs.repo.AccountRepo;

@Service
public class AccountService {
    
	@Autowired
	AccountRepo accountRepo;
	
	public Optional<Account> findAccountById(String id) {
		return accountRepo.findById(id);
	}
}
