package com.treina.treinamento.controllers;

import java.util.Arrays;
import java.util.List;

import com.treina.treinamento.models.Proprietario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ProprietarioController {
    
    @GetMapping("proprietario")
    
    public List<Proprietario> listar(){
        var p1 = new Proprietario();
        p1.setId(1L);
        p1.setNome("maria");
        p1.setTelefone("62 9985790088");
        p1.setEmail("maria@gmail.com");

        var p2 = new Proprietario();
        p2.setId(2L);
        p2.setNome("maria");
        p2.setTelefone("62 9985790088");
        p2.setEmail("maria@gmail.com");

        return Arrays.asList(p1, p2);
    }
}