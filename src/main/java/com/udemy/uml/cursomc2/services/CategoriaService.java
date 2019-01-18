package com.udemy.uml.cursomc2.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.uml.cursomc2.domain.Categoria;
import com.udemy.uml.cursomc2.repositories.CategoriaRepository;
import com.udemy.uml.cursomc2.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = categoriaRepository.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado ID:" + id + 
				", tipo: " + Categoria.class.getName()));
	}

}
