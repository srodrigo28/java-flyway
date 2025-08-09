package com.treina.treinamento.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@EqualsAndHashCode
@Table( name = "tb_produto")
public class Produto {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    private String nome;
    private int quantidade;
    private Float preco;

}