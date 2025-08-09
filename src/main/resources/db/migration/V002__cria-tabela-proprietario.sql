alter table proprietario
add constraint uk_proprietario unique(email, telefone);