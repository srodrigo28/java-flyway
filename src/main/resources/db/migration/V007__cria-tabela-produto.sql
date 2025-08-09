create table produto(
    id bigint not null AUTO_INCREMENT,
    nome varchar(60) not null,
    quantidade int not null,
    preco decimal(10, 2) not null,
    primary key(id)
);