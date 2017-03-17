create table clientes(
	id integer not null auto_increment,
    nome varchar(60) not null,
    fone varchar(15) not null,
    cep varchar(15),
    endereco varchar(80),
    cidade varchar(60),
    constraint pk_clientes primary key (id)
);

create table produtos(
	id integer not null auto_increment,
    descricao varchar(60) not null,
    preco decimal(13,2) not null,
    estoque integer default 0 not null,
    constraint pk_produtos primary key (id)
);

create table pedidos(
	id integer not null auto_increment,
    emissao timestamp not null,
    cliente_id integer not null,
    observacoes varchar(255),
    constraint pk_pedidos primary key (id),
    constraint fk_pedidos_cliente_id foreign key (cliente_id) references clientes (id) on update cascade
);

create table pedido_itens(
	pedido_id integer not null,
    sequencia integer not null,
    produto_id integer not null,
    quantidade integer not null,
    unitario decimal(13,2) not null,
    constraint pk_pedido_itens primary key (pedido_id, sequencia),
    constraint fk_pedido_itens_pedido_id foreign key (pedido_id) 
		references pedidos (id) on update cascade on delete cascade,
    constraint fk_pedido_itens_produto_id foreign key (produto_id) 
		references produtos (id) on update cascade
);

select  from sys
