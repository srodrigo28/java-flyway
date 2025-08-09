package com.treina.treinamento.repository;

import org.springframework.stereotype.Repository;
import com.treina.treinamento.models.Proprietario;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProprietarioRepository extends JpaRepository<Proprietario, Long>{}
