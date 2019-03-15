package com.udemy.uml.cursomc2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.uml.cursomc2.domain.Pagamento;

@Repository
public interface PagamentoRepository extends JpaRepository <Pagamento, Integer> {
	

}
