package com.treina.treinamento.models;

public class ProdutoTradicional {

    private Long id;
    private String nome;
    private int quantidade;
    private Float preco;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public Float getPreco() {
        return preco;
    }
    public void setPreco(Float preco) {
        this.preco = preco;
    }
}