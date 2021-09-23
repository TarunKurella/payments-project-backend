package com.dbs.service;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.dbs.beans.Bank;
import com.dbs.repo.BankRepo;

@Service
public class BankService {
	
	@Autowired
	BankRepo bankrepo;

	
	public List<Bank> getAllBanks(){
		return bankrepo.findAll();
	}
	
	public Bank getBank(String bic){
		return bankrepo.findBankByBIC(bic,bic.substring(0,bic.length()-3).concat("___"));
	}
	
	@SuppressWarnings("deprecation")
	public Boolean isInSDN(String name)throws Exception {
		
		File sdnFile = new ClassPathResource("sdnlist.txt").getFile();
		
		return FileUtils.readFileToString(sdnFile).contains(name);
	}
}
