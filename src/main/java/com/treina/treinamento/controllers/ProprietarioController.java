package com.treina.treinamento.controllers;

import java.util.List;
import com.treina.treinamento.models.Proprietario;
import com.treina.treinamento.repository.ProprietarioRepository;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ProprietarioController {

    @Autowired
    private ProprietarioRepository propRepository;
    
    @GetMapping("proprietario")
    public List<Proprietario> listar() {
      return propRepository.findAll();
    }
}