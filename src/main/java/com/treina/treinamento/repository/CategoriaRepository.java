package com.treina.treinamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.treina.treinamento.models.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {}
