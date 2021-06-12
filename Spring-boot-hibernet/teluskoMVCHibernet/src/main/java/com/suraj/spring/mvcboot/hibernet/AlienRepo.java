package com.suraj.spring.mvcboot.hibernet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.suraj.springmvcboot.model.Alien;

@Component
public interface AlienRepo extends JpaRepository<Alien	, Integer>{
	

}
