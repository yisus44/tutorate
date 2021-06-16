/*
//////////////////////////////////
crear base de datos
//////////////////////////////////
*/
CREATE DATABASE tutorate;
USE TUTORATE;

CREATE TABLE Usuarios
(
    IDUsuario INT NOT NULL,
    Nombre VARCHAR(50),
    Email VARCHAR(30),
    Edad INT,
    Contraseña VARCHAR(50),
    PRIMARY KEY(IDUsuario)
);

CREATE TABLE Maestros
(
IDUsuario INT NOT NULL,
IDMaestro INT NOT NULL,
Especialidad VARCHAR(50),
PRIMARY KEY(IDMaestro),
FOREIGN KEY(IDUsuario) REFERENCES Usuarios(IDUsuario)
);
/*La foreign key es para saber que tutor esta ayudando al alumno*/
CREATE TABLE Alumnos
(
IDAlumno INT NOT NULL,
IDUsuario INT NOT NULL,
PRIMARY KEY(IDAlumno),
FOREIGN KEY(IDUsuario) REFERENCES Usuarios(IDUsuario)
);

CREATE TABLE Tutorias
(
    IDTutoria INT NOT NULL,
    IDMaestro INT NOT NULL,
    IDAlumno INT NOT NULL,
    PRIMARY KEY (IDTutoria),
    FOREIGN KEY(IDMaestro) REFERENCES Maestros(IDMaestro),
    FOREIGN KEY(IDAlumno) REFERENCES Alumnos(IDAlumno)
);
/*
//////////////////////////////////
Consultas
//////////////////////////////////
*/
SELECT * FROM Alumnos WHERE Contraseña='?' AND Email='?'
SELECT * FROM Maestros WHERE Contraseña='?' AND Email='?'
SELECT * FROM Maestros WHERE IDMaestro='?'
SELECT * FROM Alumnos WHERE IDAlumno='?'
/*
//////////////////////////////////
Actualizaciones
//////////////////////////////////
*/
UPDATE Alumnos SET tutor='?' WHERE IDAlumno='?';
    /*cambiar campos a necesidad*/
UPDATE Maestros SET Nombre='?' WHERE IDMaestro='?';
UPDATE Alumnos SET Nombre='?' WHERE IDAlumno='?';;
/*
//////////////////////////////////
Darse de baja
//////////////////////////////////
*/

DELETE FROM Alumnos WHERE IDAlumno='?';
DELETE FROM Maestros WHERE MaestrosID='?';