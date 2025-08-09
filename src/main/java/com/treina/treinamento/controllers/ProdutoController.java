package com.treina.treinamento.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.treina.treinamento.models.Produto;
import com.treina.treinamento.repository.ProdutoRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ProdutoController {
    
    @Autowired
    private ProdutoRepository prodRepository;

    @GetMapping("produto")
    public List<Produto> listar(){
        return prodRepository.findAll();

    }
}