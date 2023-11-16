CREATE TABLE usuario(
                        id_usuario NUMERIC(5),
                        tarjeta CHAR(8),
                        nombre VARCHAR(50),
                        telefono NUMERIC(9),
                        direccion VARCHAR(100),
                        PRIMARY KEY(id_usuario)
);

CREATE TABLE producto(
                         id_producto NUMERIC(5),
                         id_vendedor NUMERIC(5),
                         nombre VARCHAR(50),
                         descripcion VARCHAR(100),
                         stock NUMERIC(5),
                         precio NUMERIC(5),
                         PRIMARY KEY(id_producto),
                         FOREIGN KEY(id_vendedor) REFERENCES usuario(id_usuario)
);

CREATE TABLE pedido(
                       id_pedido NUMERIC(5),
                       id_usuario NUMERIC(5),
                       id_producto NUMERIC(5),
                       fecha VARCHAR(10),
                       estado VARCHAR(10),
                       PRIMARY KEY(id_pedido),
                       FOREIGN KEY(id_usuario) REFERENCES usuario(id_usuario),
                       FOREIGN KEY(id_producto) REFERENCES producto(id_producto)
);

CREATE TABLE informe(
                        id_informe NUMERIC(5),
                        id_usuario NUMERIC(5),
                        tipo VARCHAR(10),
                        asunto VARCHAR(30),
                        descripcion VARCHAR(150),
                        estado VARCHAR(10),
                        PRIMARY KEY(id_informe),
                        FOREIGN KEY(id_usuario) REFERENCES usuario(id_usuario)
);

INSERT INTO usuario VALUES(00002, '73859473', 'Juan Lopez', 0, 938274910, 'Av. Ejemplo');
INSERT INTO usuario VALUES(00003, '75943956', 'tino', 0, 938274646, 'Av. Ejemplo');
INSERT INTO usuario VALUES(00004, '95435485', 'ronald', 0, 934565765, 'Av. Ejemplo');

INSERT INTO producto VALUES(00001, 00002, 'Laptop', 'Asus 8GB RAM 256GB SSD Intel Core i5', 5, 2000);
INSERT INTO producto VALUES(00002, 00003, 'Celular', 'Samsung S21', 6, 1200);
INSERT INTO producto VALUES(00003, 00004, 'Tablet', 'Apple iPad 10', 4, 1300);

INSERT INTO pedido VALUES(00001, 00002, 00001, '24/10/2023', 'En espera');
INSERT INTO pedido VALUES(00002, 00003, 00002, '24/10/2023', 'En espera');
INSERT INTO pedido VALUES(00003, 00004, 00003, '24/10/2023', 'En espera');

SELECT * FROM producto;
DELETE FROM producto WHERE id_producto=4;

UPDATE pro
SET pro.precio = 1100
FROM producto AS pro
INNER JOIN usuario AS us ON pro.id_vendedor = us.id_usuario
WHERE pro.nombre LIKE 'Smart%';
