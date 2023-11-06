DROP table IF EXISTS empleado;

CREATE TABLE IF NOT EXISTS empleado (
    id INT AUTO_INCREMENT,
    nombre VARCHAR(250) not null,
    trabajo VARCHAR(250) not null,
    salario DOUBLE not null,
    PRIMARY KEY (id)
);