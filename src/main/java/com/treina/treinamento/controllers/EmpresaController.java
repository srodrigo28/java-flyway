package com.treina.treinamento.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.treina.treinamento.models.Empresa;
import com.treina.treinamento.repository.EmpresaRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class EmpresaController {

    @Autowired
    private EmpresaRepository empRepository;

    @GetMapping("empresa")
    public List<Empresa> listar(){
        return empRepository.findAll();
    }   
}
