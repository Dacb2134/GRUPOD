Create database Proyecto;
Use Proyecto;
CREATE TABLE usuarios (
    usuario_id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role_id INT NOT NULL,
    estado TINYINT(1) DEFAULT 1, -- 1: Activo, 0: Inactivo
    fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    FOREIGN KEY (role_id) REFERENCES roles(role_id)
);
CREATE TABLE roles (
    role_id INT AUTO_INCREMENT PRIMARY KEY,
    nombre_rol VARCHAR(20) NOT NULL UNIQUE
);

INSERT INTO roles (nombre_rol) VALUES ('recluso');
INSERT INTO roles (nombre_rol) VALUES ('alcaide');

-- Inserción de un usuario con rol de recluso
INSERT INTO usuarios (nombre, apellido, username, password, role_id, estado) 
VALUES ('Emerson', 'Chancay', 'wicked29', '29060404', 1, 1);

-- Inserción de un usuario con rol de alcaide
INSERT INTO usuarios (nombre, apellido, username, password, role_id, estado) 
VALUES ('Carlos', 'Gómez', 'carlosgomez', 'admin123', 2, 1);

-- Inserción de un usuario con rol de recluso
INSERT INTO usuarios (nombre, apellido, username, password, role_id, estado) 
VALUES ('Ana', 'Rodríguez', 'anarodriguez', 'reclusa456', 1, 1);


-- Usar la base de datos
USE Proyecto;

-- Tabla para reclusos
CREATE TABLE reclusos (
    recluso_id INT AUTO_INCREMENT PRIMARY KEY,
    numero_cedula VARCHAR(15) NOT NULL UNIQUE,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    edad INT NOT NULL,
    genero ENUM('Masculino', 'Femenino') NOT NULL,
    estado TINYINT(1) DEFAULT 1, -- 1: Activo, 0: Inactivo
    FOREIGN KEY (numero_cedula) REFERENCES usuarios(username) -- Relación con la tabla usuarios para validar al recluso registrado
);
ALTER TABLE reclusos DROP COLUMN fecha_ingreso;


-- Tabla para las condenas
CREATE TABLE condenas (
    condena_id INT AUTO_INCREMENT PRIMARY KEY,
    recluso_id INT NOT NULL, -- Relación con el recluso
    descripcion TEXT NOT NULL, -- Descripción de los delitos y cargos
    delitos TEXT NOT NULL, -- Lista de delitos
    cargos TEXT NOT NULL, -- Lista de cargos
    condena_dias INT NOT NULL, -- Duración de la condena en días
    fecha_inicio_condena DATE NOT NULL,
    fecha_estimacion_liberacion DATE NOT NULL,
    FOREIGN KEY (recluso_id) REFERENCES reclusos(recluso_id) ON DELETE CASCADE
);
ALTER TABLE condenas CHANGE COLUMN descripcion fecha_ingreso Date not null;

ALTER TABLE reclusos DROP FOREIGN KEY reclusos_ibfk_1;

-- Inserción de un recluso
INSERT INTO reclusos (numero_cedula, nombre, apellido, edad, genero, estado, fecha_ingreso) 
VALUES ('1234567890', 'Ana', 'Rodriguez', 30, 'Femenino', 1, '2024-01-10');

-- Inserción de otra reclusa
INSERT INTO reclusos (numero_cedula, nombre, apellido, edad, genero, estado, fecha_ingreso) 
VALUES ('0987654321', 'Emerson', 'Chancay', 35, 'Masculino', 1, '2024-02-15');

-- Inserciones para las condenas
INSERT INTO condenas (recluso_id, descripcion, delitos, cargos, condena_dias, fecha_inicio_condena, fecha_estimacion_liberacion) 
VALUES (1, 'Robo a mano armada con violencia', 'Robo, Violencia', 'Robo, Asalto', 1825, '2024-02-16', '2029-02-16');
INSERT INTO condenas (recluso_id, descripcion, delitos, cargos, condena_dias, fecha_inicio_condena, fecha_estimacion_liberacion) 
values(2, 'Fraude bancario y falsificación', 'Fraude, Falsificación', 'Fraude', 1095, '2024-03-01', '2027-03-01');

UPDATE condenas
SET descripcion = '2024-11-22'
WHERE condena_id > 0;

DELETE FROM reclusos WHERE recluso_id > 2;
ALTER TABLE condenas AUTO_INCREMENT = 1;
Select * from reclusos;
Select * from condenas
