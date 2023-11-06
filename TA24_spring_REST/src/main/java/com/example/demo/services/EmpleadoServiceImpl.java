/**
 * 
 */
package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEmpleadoDAO;
import com.example.demo.dto.Empleado;
import com.example.demo.enums.TrabajosEnum;

/**
 * 
 */
@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	@Autowired
	IEmpleadoDAO daoEmpleado;

	/**
	 * Deveuelve todos los empleados
	 * 
	 * @return List<Empleado>
	 */
	public List<Empleado> getAllEmpleado() {
		return daoEmpleado.findAll();
	}

	/**
	 * Devuelve un empleado en especifico
	 * 
	 * @param id
	 * @return Empleado
	 */
	public Empleado getIdEmpleado(int id) {
		return daoEmpleado.findById(id).get();
	}
	
	/**
	 * Develve una lista de empleados en funciom de el trabajo pasado por parametro
	 * 
	 * @param trabajo
	 * @return List<Empleado>
	 */
	public List<Empleado> getAllEmpleadoTrabajo(TrabajosEnum trabajo){
		return daoEmpleado.findByTrabajo(trabajo);
	}

	/**
	 * Añade un empleado a la base de datos
	 * 
	 * @param empleado
	 * @return Empleado
	 */
	public Empleado addEmpleado(Empleado empleado) {
		return daoEmpleado.save(empleado);
	}

	/**
	 * Actualiza un empleado
	 * 
	 * @param empleado
	 * @return Empleado
	 */
	public Empleado updateEmpleado(Empleado empleado) {
		return daoEmpleado.save(empleado);
	}

	/**
	 * Elimina un empleado
	 * 
	 * @param id
	 */
	public void deleteEmpleado(int id) {
		daoEmpleado.deleteById(id);
	};
}
