package com.treina.treinamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.treina.treinamento.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {}
