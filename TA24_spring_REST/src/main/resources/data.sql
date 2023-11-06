DROP table IF EXISTS empleado;

CREATE TABLE IF NOT EXISTS empleado (
    id INT AUTO_INCREMENT,
    nombre VARCHAR(250) NOT NULL,
    trabajo INT NOT NULL,
    salario DOUBLE NOT NULL,
    PRIMARY KEY (id)
);