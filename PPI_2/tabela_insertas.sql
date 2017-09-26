drop database projetopizza;

create database projetopizza
default character set utf8
default collate utf8_general_ci;

CREATE TABLE clientes (
id_cliente integer auto_increment,
nm_cliente varchar(60) not null,
endereco varchar(40),
bairro varchar(40),
cep varchar(9),
telefone varchar(12),
celular varchar(15) not null,
obs_cliente varchar(100),
constraint clientes_id_cliente_pk primary key (id_cliente)
);

select * from  clientes;


CREATE TABLE usuario (
id_usuario	smallint auto_increment,
nm_usuario varchar(60) not null,
login varchar(30) not null,
senha varchar(30) not null,
constraint usuario_id_usuario_pk primary key (id_usuario)
);
select * from usuario;
CREATE TABLE grupo_produto (
id_grupo_produto smallint,
nm_grupo_produto varchar(40) not null,
constraint grupo_produto_id_grupo_produto_pk primary key (id_grupo_produto)
);

CREATE TABLE produtos (
id_produto integer auto_increment,
nm_produto varchar(60) not null,
descricao_produto varchar(60),
valor_pequena numeric(9,2),
valor_media numeric(9,2),
valor_grande numeric(9,2),
valor_meia numeric(9,2),
id_grupo_produto smallint,
foto varchar(150),
obs_produto varchar(100),
constraint produtos_id_produto_pk primary key (id_produto),
constraint produtos_id_grupo_produto_fk foreign key (id_grupo_produto)
references grupo_produto(id_grupo_produto)
);
delete from produtos where id_grupo_produto = 1;

CREATE TABLE status_venda (
id_status_venda smallint auto_increment,
descricao_status_venda varchar(60) not null,
constraint status_venda_id_status_venda_pk primary key (id_status_venda)
);

CREATE TABLE c_venda (
id_c_venda integer auto_increment ,
id_usuario smallint,
id_cliente integer,
data_c_venda varchar(12) not null,
hora varchar(12),
id_status_venda smallint,
subtotal numeric(9,2),
desconto numeric(9,2),
total_geral numeric(9,2) not null,
obs_c_venda varchar(100),
constraint c_venda_id_c_venda_pk primary key (id_c_venda),
constraint c_venda_id_usuario_fk foreign key (id_usuario)
references usuario(id_usuario),
constraint c_venda_id_cliente_fk foreign key (id_cliente)
references clientes(id_cliente),
constraint c_venda_id_status_venda_fk foreign key (id_status_venda)
references status_venda(id_status_venda)
);
insert into c_venda values (default,1,1,'04/07/2016','20:13:22',1,20.0,0.0,20.0,'cliente intolerante a lactose');

CREATE TABLE d_venda (
id_venda integer auto_increment,
id_produto integer,
tamanho varchar(5),
quantidade integer,
valor_d_venda numeric(9,2) not null,
constraint d_venda_id_venda_pk primary key (id_venda),
constraint d_venda_id_produto_fk foreign key (id_produto)
references produtos(id_produto)
);

CREATE TABLE operacao (
id_operacao integer auto_increment,
descricao_operacao varchar(60) not null,
constraint operacao_id_operacao_pk primary key (id_operacao)
);

CREATE TABLE formas_pgto (
id_formas_pgto integer auto_increment,
nm_formas_pgto varchar(40) not null,
constraint formas_pgto_id_formas_pgto_pk primary key (id_formas_pgto)
);

CREATE TABLE movimento_caixa (
id_movimento integer auto_increment,
data_movimento timestamp not null,
id_operacao integer,
id_c_venda integer,
id_formas_pgto integer,
tipo_operacao char(1),
valor_movimento_caixa numeric(9,2) not null,
constraint movimento_caixa_id_movimento_pk primary key (id_movimento),
constraint movimento_caixa_id_operacao_fk foreign key (id_operacao)
references operacao(id_operacao),
constraint movimento_caixa_id_c_venda_fk foreign key (id_c_venda)
references c_venda(id_c_venda),
constraint movimento_caixa_id_formas_pgto_fk foreign key (id_formas_pgto)
references formas_pgto(id_formas_pgto)
);
insert into grupo_produto values (1,'pizzas');
insert into grupo_produto values (2,'bebidas');
insert into clientes values (1,'balcao','balcao','balcao','00000-000','00-0000-0000','00-0000-0000','balcao');
insert into status_venda values
(1,'Pedido efetuado'),
(2,'Saiu para entrega'),
(3,'Concluido');
insert into usuario values(default, 'administrador','admin','123456');
insert into usuario values (default, 'teste', 'teste','teste');


select * from usuario;
select * from clientes;
select * from produtos;




insert into c_venda values (default,1,1,'04/07/2016','20:13:22',1,20.0,0.0,20.0,'cliente intolerante a lactose');

insert into produtos values
(1,'P.Calabresa','Calabresa e Cebola',10.5,25.0,35.0,13.5,1,null,' contem cebola'),
(2,'P.Queijo','Queijo e Tomate',10.5,25.0,35.0,13.5,1,null,' c. Tomate'),
(3,'P.Frango','Frango  e Catupiri',10.5,25.0,35.0,13.5,1,null,' c. catupiri'),
(4,'P.Carne','Carne, cebola e Azeitona',10.5,25.0,35.0,13.5,1,null,' c. cebola'),
(5,'P.Portuguesa','Ovo, Queijo, Presunto e Palmito',11.5,30.0,37.0,14.5,1,null,' c. cebola'),
(6,'P.Baiana','Ovo,calabresa, Mussarela,pimenta e Oregano',10.5,25.0,35.0,13.5,1,null,' c. Pimenta'),
(7,'P.Napolitana','Ovo,Presunto, Mussarela,Tomate e Oregano',10.5,25.0,35.0,13.5,1,null,' c. Ovo'),
(8,'Coca Cola',null,2.5,7.0,12.0,4.5,2,'Coca cola',null),
(9,'Guarana',null,2.0,6.0,11.0,4.0,2,'guarana',null); 

delete from produtos where id_grupo_produto = 2;
delete from c_venda where id_usuario = 1;
delete from clientes where id_cliente = 2;
delete from d_venda where id_produto =8;

select * from  d_venda;
select * from usuario;
select * from clientes;
select * from  c_venda;
select * from status_venda;

