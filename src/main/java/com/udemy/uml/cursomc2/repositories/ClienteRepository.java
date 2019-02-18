package com.udemy.uml.cursomc2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.uml.cursomc2.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Integer> {
	

}
