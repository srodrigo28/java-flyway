package com.treina.treinamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treina.treinamento.models.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {}
