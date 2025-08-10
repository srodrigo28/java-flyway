package com.treina.treinamento.models;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@EqualsAndHashCode
public class Categoria {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    private String nome;

     // mappedBy indica que o relacionamento já foi mapeado pelo campo "categoria" na classe Produto
    @OneToMany(mappedBy = "categoria") 
    private Set<Produto> produtos = new HashSet<>(); // Use Set para garantir que não haverá produtos duplicados
}