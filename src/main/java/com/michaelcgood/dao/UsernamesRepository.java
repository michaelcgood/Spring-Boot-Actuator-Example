package com.michaelcgood.dao;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michaelcgood.model.Usernames;

public interface UsernamesRepository extends JpaRepository<Usernames,Long> {

	Collection<Usernames> findByAccountUsername(String username);
	
}
