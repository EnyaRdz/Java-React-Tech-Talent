USE DirectoresDespachos;
-- Tabla Despachos 
INSERT INTO Despachos (numero, capacidad) VALUES
(101, 2),
(102, 3),
(103, 1),
(104, 4),
(105, 2),
(106, 3),
(107, 1),
(108, 2),
(109, 4),
(110, 3);

-- Tabla Directores 
INSERT INTO Directores (dni, nombre_completo, dni_jefe, despacho) VALUES
('12345678A', 'Laura Martínez', NULL, 101),
('23456789B', 'Carlos López', '12345678A', 102),
('34567890C', 'Elena García', '12345678A', 103),
('45678901D', 'Miguel Torres', '23456789B', 104),
('56789012E', 'Ana Ruiz', '23456789B', 105),
('67890123F', 'Lucía Fernández', '34567890C', 106),
('78901234G', 'Javier Ortega', '34567890C', 107),
('89012345H', 'Marta Sánchez', '45678901D', 108),
('90123456I', 'Pablo Moreno', '56789012E', 109),
('01234567J', 'Sofía Romero', '67890123F', 110);
