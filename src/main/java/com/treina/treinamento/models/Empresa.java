package com.treina.treinamento.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@EqualsAndHashCode
public class Empresa {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long Id;
    private String nome;
    private String cnpj;
    
}
