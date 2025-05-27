-- 1.1. Obtener los nombres de los productos de la tienda.
SELECT Nombre FROM ARTICULOS;

-- 1.2. Obtener los nombres y los precios de los productos de la tienda.
SELECT Nombre, Precio FROM ARTICULOS;

-- 1.3. Obtener el nombre de los productos cuyo precio sea mayor a 200€.
SELECT Nombre FROM ARTICULOS WHERE Precio > 200;

-- 1.4. Obtener todos los datos de los artículos cuyo precio esté entre 60€ y 120€ (ambos incluidos).
-- Versión con AND
SELECT * FROM ARTICULOS WHERE Precio >= 60 AND Precio <= 120;

-- Versión con BETWEEN
SELECT * FROM ARTICULOS WHERE Precio BETWEEN 60 AND 120;

-- 1.5. Obtener el nombre y el precio en pesetas (precio en euros multiplicado por 166,386)
-- Sin alias
SELECT Nombre, Precio * 166.386 FROM ARTICULOS;

-- Con alias
SELECT Nombre, Precio * 166.386 AS PrecioPtas FROM ARTICULOS;