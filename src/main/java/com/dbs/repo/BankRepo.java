package com.dbs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dbs.beans.Bank;

@Repository
public interface BankRepo extends JpaRepository<Bank,String> {

	
	@Query(
			  value = "SELECT * FROM Bank b WHERE b.bic like ?1 or b.bic like ?2", 
			  nativeQuery = true)
			Bank findBankByBIC(String bic,String bic2);
}