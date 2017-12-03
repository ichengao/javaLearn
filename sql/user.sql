create table Users(
	id integer not null auto_increment,
	name varchar(50) not null unique,
	pwd varchar(100),
	phone varchar(15),
	primary key (id)
);
insert into Users values(null,"tom1","123","123");
insert into Users values(null,"tom2","123","123");
insert into Users values(null,"tom3","123","123");
insert into Users values(null,"tom4","123","123");