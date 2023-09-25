DROP DATABASE IF EXISTS EL1_LP2_Patrick;
CREATE DATABASE EL1_LP2_Patrick;
USE EL1_LP2_Patrick;

CREATE TABLE Empleados (
    id_empleado  int PRIMARY KEY,
    Apellidos VARCHAR(255) NOT NULL,
    Nombres VARCHAR(255) NOT NULL,
    Edad INT CHECK (Edad >= 18),
    Sexo ENUM('M', 'F'),
    Salario DECIMAL(10, 2) CHECK (Salario BETWEEN 1500 AND 2500)
);

INSERT INTO Empleados (id_empleado , Apellidos, Nombres, Edad, Sexo, Salario) 
VALUES (1, 'TORRES', 'JOSE', 22, 'M', 1500);

INSERT INTO Empleados (id_empleado , Apellidos, Nombres, Edad, Sexo, Salario) 
VALUES (2, 'GARCIA', 'MARIA', 21, 'F', 1750);

INSERT INTO Empleados (id_empleado , Apellidos, Nombres, Edad, Sexo, Salario) 
VALUES (3, 'FLORES', 'JUAN', 22, 'M', 1850);

INSERT INTO Empleados (id_empleado , Apellidos, Nombres, Edad, Sexo, Salario) 
VALUES (4, 'CASAS', 'ANA', 23, 'F', 2000);

INSERT INTO Empleados (id_empleado , Apellidos, Nombres, Edad, Sexo, Salario) 
VALUES (5, 'MONTES', 'PATRICK', 18, 'M', 2500);

select*from Empleados
