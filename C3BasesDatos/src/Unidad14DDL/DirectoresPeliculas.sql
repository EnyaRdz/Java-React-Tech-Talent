CREATE DATABASE DirectoresPeliculas;
USE DirectoresPeliculas;

CREATE TABLE Directores (
    id_director INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    nacionalidad VARCHAR(50),
    fecha_nacimiento DATE
);

CREATE TABLE Peliculas (
    id_pelicula INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    año INT,
    genero VARCHAR(50),
    id_director INT,
    FOREIGN KEY (id_director) REFERENCES Directores(id_director)
);
