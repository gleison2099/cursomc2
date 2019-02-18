package com.udemy.uml.cursomc2.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.uml.cursomc2.domain.Cliente;
import com.udemy.uml.cursomc2.repositories.ClienteRepository;
import com.udemy.uml.cursomc2.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = clienteRepository.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado ID:" + id + 
				", tipo: " + Cliente.class.getName()));
	}

}
