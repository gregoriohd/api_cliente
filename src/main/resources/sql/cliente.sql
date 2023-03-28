create database sudoeste_informatica;

create table prv_cliente(
id serial primary key,
nome varchar(80) not null,
data_nasc date not null,
rg varchar(14) not null,
cpf varchar(14) not null,
celular varchar(14) not null,
email varchar(60),
nome_mae varchar(80) not null,
nome_pai varchar(80) not null,
data_cadastro timestamp not null default current_timestamp
);

select * from prv_cliente ;

drop table prv_cliente ;