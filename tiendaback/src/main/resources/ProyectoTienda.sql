CREATE DATABASE ProyectoTienda;

/* Se crea la base de datos ProyectoTienda */

CREATE TABLE usuario(
                        id_usuario INT IDENTITY(1,1) PRIMARY KEY,
                        nombre VARCHAR(50),
                        telefono NUMERIC(9,0),
                        direccion VARCHAR(100)
);

/* Se crea la tabla usuario en la base de datos ProyectoTienda */

CREATE TABLE producto(
                         id_producto INT PRIMARY KEY,
                         nombre VARCHAR(50),
                         descripcion VARCHAR(100),
                         stock INT,
                         precio NUMERIC(10,2)
);

/* Se crea la tabla producto en la base de datos ProyectoTienda donde se almacenará los usuarios*/

CREATE TABLE pedido(
                       id_pedido INT IDENTITY(1,1),
                       id_usuario INT,
                       id_producto INT,
                       estado VARCHAR(10),
                       PRIMARY KEY(id_pedido),
                       FOREIGN KEY(id_usuario) REFERENCES usuario(id_usuario),
                       FOREIGN KEY(id_producto) REFERENCES producto(id_producto)
);

/* Se crea la tabla pedido en la base de datos ProyectoTienda donde se almacenarán los pedidos realizados*/

CREATE TABLE informe(
                        id_informe INT IDENTITY(1,1),
                        id_usuario INT,
                        tipo VARCHAR(10),
                        asunto VARCHAR(30),
                        descripcion VARCHAR(150),
                        estado VARCHAR(10),
                        PRIMARY KEY(id_informe),
                        FOREIGN KEY(id_usuario) REFERENCES usuario(id_usuario)
);

/* Se crea la tabla informe en la base de datos ProyectoTienda los informes redactados por los usuarios */

INSERT INTO usuario VALUES('Juan Lopez', 938274910, 'Av. Ejemplo');
INSERT INTO usuario VALUES('tino', 938274646, 'Av. Ejemplo');
INSERT INTO usuario VALUES('ronald', 934565765, 'Av. Ejemplo');

DELETE FROM usuario WHERE id_usuario = 2

SELECT * FROM usuario

    INSERT INTO producto VALUES(00001, 00002, 'Laptop', 'Asus 8GB RAM 256GB SSD Intel Core i5', 5, 2000);
INSERT INTO producto VALUES(00002, 00003, 'Celular', 'Samsung S21', 6, 1200);
INSERT INTO producto VALUES(00003, 00004, 'Tablet', 'Apple iPad 10', 4, 1300);

INSERT INTO pedido VALUES(00001, 00002, 00001, '24/10/2023', 'En espera');
INSERT INTO pedido VALUES(00002, 00003, 00002, '24/10/2023', 'En espera');
INSERT INTO pedido VALUES(00003, 00004, 00003, '24/10/2023', 'En espera');

SELECT * FROM informe;
DELETE FROM usuario WHERE id_usuario=1;
DELETE FROM informe WHERE id_informe=1;

DROP TABLE usuario;

SELECT * FROM informe;
DELETE FROM informe WHERE id_informe=1;



