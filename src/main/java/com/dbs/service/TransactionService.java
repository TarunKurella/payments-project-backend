package com.dbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.beans.Transaction;
import com.dbs.repo.TransactionRepo;

@Service
public class TransactionService {
	
	@Autowired
	TransactionRepo transactionRepo;
	
	public Transaction addTransaction(Transaction transaction) {
		return transactionRepo.save(transaction);
	}

}
