package com.dbs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbs.beans.Account;

@Repository
public interface AccountRepo extends JpaRepository< Account, String> {

}
