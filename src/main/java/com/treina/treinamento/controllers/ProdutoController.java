package com.treina.treinamento.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.treina.treinamento.Dtos.ProdutoInputDTO;
import com.treina.treinamento.models.Categoria;
import com.treina.treinamento.models.Produto;
import com.treina.treinamento.repository.CategoriaRepository;
import com.treina.treinamento.repository.ProdutoRepository;

import jakarta.persistence.EntityNotFoundException;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class ProdutoController {

    private final ProdutoRepository produtoRepository;
    private final CategoriaRepository categoriaRepository;

    @GetMapping("produto") // LISTA OS PRODUTOS
    public List<Produto> listar(){
        return produtoRepository.findAll();
    }

    // Injeção de dependências via construtor (boa prática)
    // * http://localhost:8080/produtos
    /* Json
        {
            "nome": "Teclado Mecânico Gamer",
            "quantidade": 50,
            "preco": 350.50,
            "categoriaId": 1
        }
     */
    public ProdutoController(ProdutoRepository produtoRepository, 
        CategoriaRepository categoriaRepository) {
            this.produtoRepository = produtoRepository;
            this.categoriaRepository = categoriaRepository;
    }

    @PostMapping // CRIA UM PRODUTO
    public ResponseEntity<Produto> criarProduto(@RequestBody ProdutoInputDTO produtoDTO) {
        // 1. Busca a categoria pelo ID fornecido no DTO
        Categoria categoria = categoriaRepository.findById(produtoDTO.categoriaId())
                .orElseThrow(() -> new EntityNotFoundException(
                    "Categoria não encontrada com o ID: " + produtoDTO.categoriaId())
        );

        // 2. Cria uma nova entidade Produto
        Produto novoProduto = new Produto();
        novoProduto.setNome(produtoDTO.nome());
        novoProduto.setQuantidade(produtoDTO.quantidade());
        novoProduto.setPreco(produtoDTO.preco());
        
        // 3. Associa a categoria encontrada ao novo produto
        novoProduto.setCategoria(categoria);

        // 4. Salva o novo produto no banco de dados
        Produto produtoSalvo = produtoRepository.save(novoProduto);

        return ResponseEntity.status(HttpStatus.CREATED).body(produtoSalvo);
    }

    // Outros métodos (GET, PUT, DELETE)...
    // http://localhost:8080/produtos/por-categoria/1
    @GetMapping("/por-categoria/{categoriaId}")
    public ResponseEntity<List<Produto>> buscarPorCategoria(@PathVariable Long categoriaId) {
        // Usando o novo método que criamos no repository!
        List<Produto> produtos = produtoRepository.findByCategoriaId(categoriaId);
        return ResponseEntity.ok(produtos);
    }
}