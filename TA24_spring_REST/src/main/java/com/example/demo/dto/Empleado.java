/**
 * 
 */
package com.example.demo.dto;

import com.example.demo.enums.TrabajosEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "Empleado")
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	@Enumerated(EnumType.STRING)
	private TrabajosEnum trabajo;
	private double salario;

	/**
	 * 
	 */
	public Empleado() {
	}

	/**
	 * @param id
	 * @param nombre
	 * @param trabajo
	 * @param salario
	 */
	public Empleado(int id, String nombre, TrabajosEnum trabajo, double salario) {
		this.id = id;
		this.nombre = nombre;
		this.trabajo = trabajo;
		this.salario = salario;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the trabajo
	 */
	public TrabajosEnum getTrabajo() {
		return trabajo;
	}

	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param trabajo the trabajo to set
	 */
	public void setTrabajo(TrabajosEnum trabajo) {
		this.trabajo = trabajo;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", trabajo=" + trabajo + ", salario=" + salario + "]";
	}
}
