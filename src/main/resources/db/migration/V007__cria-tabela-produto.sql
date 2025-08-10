create table produto(
    id bigint not null AUTO_INCREMENT,
    nome varchar(60) not null,
    quantidade int not null,
    -- Usar DECIMAL para valores monetários é uma excelente prática.
    preco decimal(10, 2) not null, 
    
    -- 1. ADIÇÃO DA COLUNA DA CHAVE ESTRANGEIRA
    -- Esta coluna irá armazenar o ID da categoria à qual este produto pertence.
    -- O tipo (bigint) deve ser o mesmo do campo 'id' na tabela 'categoria'.
    -- 'not null' garante que todo produto DEVE ter uma categoria.
    categoria_id bigint not null,

    primary key(id),

    -- 2. DEFINIÇÃO DA RESTRIÇÃO (CONSTRAINT) DE CHAVE ESTRANGEIRA
    -- Aqui criamos o vínculo lógico entre as tabelas.
    -- Damos um nome à restrição (fk_produto_categoria) para facilitar a manutenção.
    -- FOREIGN KEY (categoria_id) -> Define qual coluna nesta tabela é a chave estrangeira.
    -- REFERENCES categoria(id) -> Informa qual tabela e qual coluna ela está referenciando.
    constraint fk_produto_categoria foreign key (categoria_id) references categoria(id)
);