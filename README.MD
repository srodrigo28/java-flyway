
#### Conexão com o banco
```
spring.application.name=treinamento

spring.datasource.url=jdbc:mysql://localhost:3306/test2?createDatabaseIfNotExist=true&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=123456
```

#### End points

> * GET Retorna todos
```
http://localhost:8080/proprietario/
```

> * GET Retorna por id
```
http://localhost:8080/proprietario/2
```

> * GET Retorna por nome
```
http://localhost:8080/proprietario/buscar
```

> * DELETE Apagar
```
http://localhost:8080/proprietario/1
```

> * POST Inserir
```
http://localhost:8080/proprietario/inserir
```

``` JSON
{
    "nome": "Gabriela Nogueira",
    "email": "gaby@gmail.com",
    "telefone": "62982242091"
}
```

> * PUT Atualizar
```
http://localhost:8080/proprietario/1
```

``` JSON
{
    "nome": "Gabriela Nogueira",
    "email": "gaby@gmail.com",
    "telefone": "62982242091"
}
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
```

> * exibi os campos da tabela
```
desc proprietario;
```

> * Adiciona uma registrição para não haver chaves duplicadas
```
alter table proprietario
add constraint uk_proprietario unique(email, telefone);
```

> * Alterando uma coluna
```
alter table proprietario rename column telefone to fone;
```