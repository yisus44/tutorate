/*
//////////////////////////////////
crear base de datos
//////////////////////////////////
*/
CREATE DATABASE tutorate;
USE TUTORATE;
CREATE TABLE Maestros
(
MaestroID INT NOT NULL,
Nombre VARCHAR(50),
Email VARCHAR(30),
Edad INT,
Especialidad VARCHAR(50),
Contraseña VARCHAR(50),
PRIMARY KEY(MaestroID)
);
/*La foreign key es para saber que tutor esta ayudando al alumno*/
CREATE TABLE Alumnos
(
AlumnoID INT NOT NULL,
Nombre VARCHAR(50),
Email VARCHAR(30),
Edad INT,
Contraseña VARCHAR(50),
Tutor INT,
PRIMARY KEY(AlumnoID),
FOREIGN KEY(Tutor) REFERENCES Maestros(MaestroID)
);
/*
//////////////////////////////////
Consultas
//////////////////////////////////
*/
SELECT * FROM Alumnos WHERE Contraseña='?' AND Email='?'
SELECT * FROM Maestros WHERE Contraseña='?' AND Email='?'
SELECT * FROM Maestros WHERE MaestroID='?'
SELECT * FROM Alumnos WHERE AlumnoID='?'
/*
//////////////////////////////////
Actualizaciones
//////////////////////////////////
*/
UPDATE Alumnos SET tutor='?' WHERE AlumnoID='?';
    /*cambiar campos a necesidad*/
UPDATE Maestros SET Nombre='?' WHERE MaestroID='?';
UPDATE Alumnos SET Nombre='?' WHERE AlumnoID='?';;
/*
//////////////////////////////////
Darse de baja
//////////////////////////////////
*/

DELETE FROM Alumnos WHERE AlumnoID='?';
DELETE FROM Maestros WHERE MaestrosID='?';
