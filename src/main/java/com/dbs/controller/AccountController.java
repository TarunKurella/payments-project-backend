package com.dbs.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.beans.Account;
import com.dbs.repo.AccountRepo;
import com.dbs.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	AccountRepo accountRepo;
	
	@Autowired
	AccountService accountService;
	
	@GetMapping(value="accounts")
	@CrossOrigin(origins = "http://localhost:4200")
	List<Account> getAccounts(){
		return accountRepo.findAll();
	}
	
	
	@GetMapping(value="getaccount/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<Account> getAccount(@PathVariable("id") String id) {
		Optional account = accountService.findAccountById(id);
		if(account.isPresent()) {
			Account response = (Account) account.get();
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
		return new ResponseEntity<>(new Account(), HttpStatus.NOT_FOUND);
	}
}
