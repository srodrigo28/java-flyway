create table proprietario(
    id bigint not null AUTO_INCREMENT,
    nome varchar(60) not null,
    email varchar(100) not null,
    telefone varchar(20) not null,

    primary key(id)
);