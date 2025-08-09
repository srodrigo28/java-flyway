package com.treina.treinamento.controllers;

import java.util.List;

import com.treina.treinamento.models.Categoria;
import com.treina.treinamento.repository.CategoriaRepository;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CategoriaController {

    @Autowired
    private CategoriaRepository cRepository;

    @GetMapping("/categoria")
    public List<Categoria> listar(){
        return cRepository.findAll();
        
    }   
}