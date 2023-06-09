DROP TABLE IF EXISTS piezas;
DROP TABLE IF EXISTS proveedores;
DROP TABLE IF EXISTS suministra;

CREATE TABLE piezas (
codigo INT AUTO_INCREMENT,
nombre VARCHAR(100),
PRIMARY KEY (codigo)
);

CREATE TABLE proveedores (
id CHAR(4),
nombre VARCHAR(100),
PRIMARY KEY (id)
);

CREATE TABLE suministra (
id INT AUTO_INCREMENT,
id_pieza INT ,
id_proveedor CHAR(4),
precio INT,
PRIMARY KEY(id),
CONSTRAINT id_pieza 
FOREIGN KEY (id_pieza) REFERENCES piezas (codigo)
ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT id_proveedor
FOREIGN KEY (id_proveedor) REFERENCES proveedores (id)
ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO piezas(nombre) 
VALUES ('Tuerca'),
		('Tornillo'),
		('Punta'),
		('Arandela'),
		('Valvula');

INSERT INTO proveedores(id, nombre) 
VALUES ('4Tue','LasTuercas'),
		('PePe','FerreteríaPepe'),
		('GaDa','Gandalf El Blanco'),
		('S.Hw','SuperFerreteria'),
		('6Ho9','Valvula caliente');

INSERT INTO suministra(id_pieza, id_proveedor, precio) 
VALUES (1,'PePe',20),
		(2,'GaDa',20),
		(2,'S.Hw',20),
		(4,'S.Hw',20),
		(5,'6Ho9',20);