package com.treina.treinamento.Dtos;

// Usando 'record' do Java 16+ para simplicidade, mas pode ser uma classe normal.
public record ProdutoInputDTO(
    String nome,
    int quantidade,
    Float preco,
    Long categoriaId // <-- AQUI ESTÁ A MUDANÇA!
) {}