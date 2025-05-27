CREATE DATABASE DirectoresDespachos;
USE DirectoresDespachos;

CREATE TABLE Despachos (
    numero INT PRIMARY KEY,
    capacidad INT NOT NULL
);

CREATE TABLE Directores (
    dni CHAR(9) PRIMARY KEY,
    nombre_completo VARCHAR(100) NOT NULL,
    dni_jefe CHAR(9),
    despacho INT,
    FOREIGN KEY (dni_jefe) REFERENCES Directores(dni),
    FOREIGN KEY (despacho) REFERENCES Despachos(numero)
);