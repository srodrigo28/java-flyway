
#### Conexão com o banco
```
spring.application.name=treinamento

spring.datasource.url=jdbc:mysql://localhost:3306/test2?createDatabaseIfNotExist=true&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=123456
```

#### SQL CRIADO
```
create table proprietario(
    id bigint not null AUTO_INCREMENT,
    nome varchar(60) not null,
    email varchar(100) not null,
    telefone varchar(20) not null,

    primary key(id)
);

alter table proprietario
add constraint uk_proprietario unique(email, telefone);

desc proprietario;
```