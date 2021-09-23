package com.dbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.beans.Transaction;
import com.dbs.repo.TransactionRepo;
import com.dbs.beans.Account;

@Service
public class TransactionService {
	
	@Autowired
	TransactionRepo transactionRepo;
	
	@Autowired
	AccountRepo accountRepo;
	
	public Transaction addTransaction(Transaction transaction) {
		Account account=accountRepo.findById(transaction.getFromAccount());
		account.setClearBalance(account.getClearBalance()-((transaction.getAmount()*125)/100));
		accountRepo.save(account);
		return transactionRepo.save(transaction);
	}

}
