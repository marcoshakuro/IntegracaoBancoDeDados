package com.IntegracaoBancoDeDados.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.IntegracaoBancoDeDados.model.ContatoModel;

public interface ContatoRepository extends JpaRepository<ContatoModel, Long> {
	
}