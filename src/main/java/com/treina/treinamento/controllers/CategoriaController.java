package com.treina.treinamento.controllers;

import java.util.List;
import java.util.Arrays;

import com.treina.treinamento.models.Categoria;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CategoriaController {

    @GetMapping("/categoria")
    public List<Categoria> listar(){
        var c1 = new Categoria();

        c1.setId(1L);
        c1.setNome("carros");

        var c2 = new Categoria();
        c1.setId(2L);
        c2.setNome("casa");

        return Arrays.asList(c1, c2);
    }   
}