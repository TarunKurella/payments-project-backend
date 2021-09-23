package com.dbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.beans.Bank;
import com.dbs.service.BankService;

@RestController
public class BankController {
	
	@Autowired
	BankService bankservice;
	
	@GetMapping(value="bank")
	List<Bank> getAllbanks(){
		return bankservice.getAllBanks();
	}
	

	
	@GetMapping(value="checksdn/{name}")
	@CrossOrigin(origins = "http://localhost:4200")
	Boolean checkWithSDN(@PathVariable("name") String name)throws Exception {
		return bankservice.isInSDN(name);
	}
	
	
	@GetMapping(value="getbank/{bic}")
	@CrossOrigin(origins = "http://localhost:4200")
	ResponseEntity<Bank>  getBank(@PathVariable("bic") String bic)throws Exception {
		
		Bank bank = bankservice.getBank(bic);
		System.out.println(bank.getInstituteName());
		
		return new ResponseEntity<Bank>(bank,HttpStatus.OK);
	}

}
