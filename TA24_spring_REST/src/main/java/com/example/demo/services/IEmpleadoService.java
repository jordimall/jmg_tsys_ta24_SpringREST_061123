/**
 * 
 */
package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Empleado;

/**
 * 
 */
public interface IEmpleadoService {
	
	
	/**
	 * Deveuelve todos los empleados
	 * @return List<Empleado>
	 */
	public List<Empleado> getAllEmpleado();
	
	/**
	 * Devuelve un empleado en especifico
	 * @param id
	 * @return Empleado
	 */
	public Empleado getIdEmpleado(int id);

	/**
	 * A�ade un empleado a la base de datos
	 * @param empleado
	 * @return Empleado
	 */
	public Empleado addEmpleado(Empleado empleado);

	/**
	 * Actualiza un empleado
	 * @param empleado
	 * @return Empleado
	 */
	public Empleado updateEmpleado(Empleado empleado);

	/**
	 * Elimina un empleado
	 * @param id
	 */
	public void deleteEmpleado(int id);
	

}
