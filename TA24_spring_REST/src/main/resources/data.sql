DROP table IF EXISTS empleado;

CREATE TABLE IF NOT EXISTS empleado (
    id INT AUTO_INCREMENT,
    nombre VARCHAR(250) NOT NULL,
    trabajo INT NOT NULL,
    salario DOUBLE NOT NULL,
    PRIMARY KEY (id)
);

insert into empleado (nombre, trabajo,salario)values('Jordi',1,100000.0);
insert into empleado (nombre, trabajo,salario)values('Juan',2,40000.0);
insert into empleado (nombre, trabajo,salario)values('Pedro',3, 10000.0);
insert into empleado (nombre, trabajo,salario)values('Anna',2,5000.0);
insert into empleado (nombre, trabajo,salario)values('Jonatan',3,10000.0);