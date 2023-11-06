/**
 * 
 */
package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Empleado;
import com.example.demo.enums.TrabajosEnum;

/**
 * 
 */
public interface IEmpleadoDAO extends JpaRepository<Empleado, Integer> {

	 List<Empleado> findByTrabajo(TrabajosEnum trabajo);
}
