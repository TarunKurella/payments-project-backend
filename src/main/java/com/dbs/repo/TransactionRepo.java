package com.dbs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbs.beans.Transaction;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction, Integer> {

	
	
}