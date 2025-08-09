package com.treina.treinamento.controllers;

import java.util.List;
import com.treina.treinamento.models.Fabricante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FabricanteController {

    @PersistenceContext
    private EntityManager manager;

    @GetMapping("fabricante")
    public List<Fabricante> listar() {
        return manager.createQuery("from Fabricante", 
        Fabricante.class).getResultList();
    }
}
