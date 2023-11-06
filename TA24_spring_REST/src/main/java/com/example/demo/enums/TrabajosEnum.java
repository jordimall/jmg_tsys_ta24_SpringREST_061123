/**
 * 
 */
package com.example.demo.enums;

/**
 * 
 */
public enum TrabajosEnum {
	PROGRAMADOR(50000), OFICINISTA(35000), ACTOR(45000), DEPENDIENTE(30000);

	private final double sueldo;

	/**
	 * Constructor privado de TrabajosEnum. Asigna el sueldo correspondiente a cada
	 * tipo de trabajo.
	 * 
	 * @param sueldo
	 */
	private TrabajosEnum(double sueldo) {
		this.sueldo = sueldo;
	}

	/**
	 * Método para obtener el sueldo asociado a un tipo de trabajo.
	 * 
	 * @return the sueldo
	 */
	public double getSueldo() {
		return sueldo;
	}

}
