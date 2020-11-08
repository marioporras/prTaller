create table if not exists cliente(
idCliente int auto_increment unique not null primary key,
nombre varchar(30),
apellidos varchar(30),
telefono varchar(30),
dni varchar (10) unique not null,
fechaAlta date
);

create table if not exists usuario(
idUsuario int auto_increment unique not null primary key,
seudonimo varchar (30) not null,
contrasena varchar(30) not null,
clase varchar(30),
nombre varchar(30),
apellidos varchar(30),
telefono varchar(30),
dni varchar (10) unique not null,
fechaAlta date
);

create table if not exists vehiculo(
idVehiculo int auto_increment primary key,
idCliente int,
idUsuario int,
idConcesionario int,
matricula varchar(20) unique not null,
marca varchar(30),
modelo varchar(30),
color varchar(30),
precio float,
fechaAlta date,
tipo varchar(30)
);

create table if not exists concesionario(
idConcesionario int auto_increment primary key,
nombre varchar(30)
);

create table if not exists venta(
idVendedor int auto_increment unique not null primary key,
idCliente int,
idEmpleado int,
idVehiculo int,
fechaSalida date,
precio float
);


create table if not exists reparacion(
idReparacion int auto_increment unique not null primary key,
idCliente int,
idJefeMecanico int,
idMecanico int,
idVehiculo int,
fechaReparacion date,
tiempo float,
fechaInicio date,
fechaFinalizacion date
);

create table if not exists pieza(
idPieza int auto_increment unique not null primary key,
info  varchar(200),
precio float,
fechaAlta date
);