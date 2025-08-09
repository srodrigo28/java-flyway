package com.treina.treinamento.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.treina.treinamento.models.Produto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ProdutoController {
    
    @PersistenceContext
    private EntityManager manager;

    @GetMapping("produto")
    public List<Produto> liste(){
        return manager.createQuery("from Produto", 
        Produto.class).getResultList();

    }
}