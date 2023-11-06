/**
 * 
 */
package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Empleado;
import com.example.demo.enums.TrabajosEnum;
import com.example.demo.services.EmpleadoServiceImpl;

/**
 * 
 */
@RestController
@RequestMapping("/empleado")
public class EmpleadoController {

	@Autowired
	EmpleadoServiceImpl serviceEmpleado;

	/**
	 * Devuelve una lista de todos los empleados
	 * 
	 * @return List<Empleado>
	 */
	@GetMapping("/all")
	public List<Empleado> getAllEmpleado() {
		return serviceEmpleado.getAllEmpleado();
	}

	/**
	 * Devuelve un empleado filtrando por su id
	 * 
	 * @param id
	 * @return Empleado
	 */
	@GetMapping("/{id}")
	public Empleado getIdEmpleado(@PathVariable(name = "id") int id) {
		return serviceEmpleado.getIdEmpleado(id);
	};

	/**
	 * Añade un empleado a la base de datos
	 * 
	 * @param empleado
	 * @return Empleado
	 */
	@PostMapping("/new")
	public Empleado addEmpleado(@RequestBody Empleado empleado) {
		Empleado empleado_xid = new Empleado();
		empleado.setTrabajo(TrabajosEnum.valueOf(String.valueOf(empleado.getTrabajo()).toUpperCase()));
		empleado.setSalario(empleado.getTrabajo().getSueldo());

		empleado_xid = serviceEmpleado.addEmpleado(empleado);
		return empleado_xid;
	};

	/**
	 * Actualiza un empleado
	 * 
	 * @param id
	 * @param empleado
	 * @return Empleado
	 */
	@PutMapping("/{id}")
	public Empleado updateEmpleado(@PathVariable(name = "id") int id, @RequestBody Empleado empleado) {
		Empleado empleado_seleccionado = new Empleado();
		Empleado empleado_actualizado = new Empleado();
		System.out.println(id);
		System.out.println(empleado);
		empleado_seleccionado = serviceEmpleado.getIdEmpleado(id);

		empleado_seleccionado.setNombre(empleado.getNombre());
		empleado_seleccionado.setTrabajo(empleado.getTrabajo());
		empleado_seleccionado.setSalario(empleado.getSalario());

		empleado_actualizado = serviceEmpleado.updateEmpleado(empleado_seleccionado);
		return empleado_actualizado;
	};

	/**
	 * Elimina un empleado
	 * 
	 * @param id
	 */
	@DeleteMapping("/{id}")
	public void deleteEmpleado(@PathVariable(name = "id") int id) {
		serviceEmpleado.deleteEmpleado(id);
	};

}
