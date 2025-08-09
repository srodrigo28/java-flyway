package com.treina.treinamento.controllers;

import java.util.List;
import com.treina.treinamento.models.Perfil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class PerfilController {

    @PersistenceContext
    private EntityManager manager;

    @GetMapping("perfil") 
    public List<Perfil> listar() {
        return manager.createQuery("from Perfil", 
        Perfil.class).getResultList();
    }
    
}
