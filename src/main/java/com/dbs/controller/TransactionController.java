package com.dbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.beans.Transaction;
import com.dbs.service.TransactionService;

@RestController
public class TransactionController {
	
	@Autowired
	TransactionService transactionService;
	
	@PostMapping(value="transaction")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<Transaction> addTransaction(@RequestBody Transaction transaction) {
		System.out.println("BIC is "+transaction.getBic());
		
		Transaction transRecieved = transactionService.addTransaction(transaction);
		return new ResponseEntity<>(transRecieved, HttpStatus.OK);
	}

}
