package com.michaelcgood.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michaelcgood.model.Account;

public interface AccountRepository extends JpaRepository<Account,Long> {

	Optional<Account> findByUsername(String username);
}
