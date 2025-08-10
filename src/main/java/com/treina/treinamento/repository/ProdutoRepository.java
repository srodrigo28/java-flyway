package com.treina.treinamento.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.treina.treinamento.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    // Encontra todos os produtos de uma determinada categoria, passando o ID da categoria.
    // MUITO ÚTIL para a API!
    List<Produto> findByCategoriaId(Long categoriaId);

    // Encontra todos os produtos pelo nome da categoria.
    List<Produto> findByCategoriaNome(String nomeCategoria);

    // Encontra todos os produtos que tenham o nome "X" E pertençam à categoria com ID "Y".
    List<Produto> findByNomeAndCategoriaId(String nomeProduto, Long categoriaId);
}