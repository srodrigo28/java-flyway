package com.treina.treinamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.treina.treinamento.models.Fabricante;

@Repository
public interface FabricanteRepository extends JpaRepository<Fabricante, Long> {}
