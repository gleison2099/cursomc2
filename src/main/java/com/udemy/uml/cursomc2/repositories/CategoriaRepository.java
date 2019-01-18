package com.udemy.uml.cursomc2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.uml.cursomc2.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository <Categoria, Integer> {
	

}
