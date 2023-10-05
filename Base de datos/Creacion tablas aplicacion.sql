--create database Apliacion_Localizacion;

create table Tbl_Empresa (
Id_Empresa varchar(30) PRIMARY KEY,
Nombre_Empresa varchar(30) not null,
Password varchar(30)not null
)

create table Tbl_Piloto (
DPI_Piloto varchar(13) PRIMARY KEY,
Licencia_Conducir varchar(20) not null unique,
Nombres varchar(100) not null,
Apellidos varchar(100) not null,
Direccion varchar(100) not null,
Id_Empresa varchar(30) not null,
FOREIGN KEY (Id_Empresa) REFERENCES Tbl_Empresa(Id_Empresa)
);

create table Tbl_Camion (
Placa_camion varchar(15) PRIMARY KEY,
No_Chasis varchar(30) not null unique,
Marca varchar(20) not null,
Id_Empresa varchar(30) not null,
FOREIGN KEY (Id_Empresa) REFERENCES Tbl_Empresa(Id_Empresa)
);

create table Tbl_Viaje (
Id_Viaje integer PRIMARY KEY,
Placa_camion varchar(15) not null,
DPI_Piloto varchar(13) not null,
Id_Empresa varchar(30) not null,
Punto_Partida varchar(100) not null,
Punto_Llegada varchar(100) not null,
Descripcion varchar(225) not null,
Fecha_Partida datetime not null,
Fecha_Llegada datetime,
Estado varchar(30) not null,
FOREIGN KEY (Id_Empresa) REFERENCES Tbl_Empresa(Id_Empresa),
FOREIGN KEY (DPI_Piloto) REFERENCES Tbl_Piloto(DPI_piloto),
FOREIGN KEY (Placa_camion) REFERENCES Tbl_Camion(Placa_camion)
);

create table Tbl_Historial_Ubicaciones (
Id_RegistroUbicacion integer PRIMARY KEY,
Id_Viaje integer not null,
Placa_camion varchar(15) not null,
DPI_Piloto varchar(13) not null,
Id_Empresa varchar(30) not null,
Latitud varchar(30) not null,
Longitud varchar(30) not null,
Fecha_Emision date not null,
Hora_emision time not null
FOREIGN KEY (Id_Viaje) REFERENCES Tbl_Viaje(Id_Viaje),
FOREIGN KEY (Id_Empresa) REFERENCES Tbl_Empresa(Id_Empresa),
FOREIGN KEY (DPI_Piloto) REFERENCES Tbl_Piloto(DPI_piloto),
FOREIGN KEY (Placa_camion) REFERENCES Tbl_Camion(Placa_camion)
);