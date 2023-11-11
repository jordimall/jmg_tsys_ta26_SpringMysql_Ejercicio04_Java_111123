/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Investigador;

/**
 * 
 */
public interface IInvestigadorService {
	
	/**
	 * Deveuelve todos los investigadores
	 * 
	 * @return List<Investigador>
	 */
	public List<Investigador> getAll();

	/**
	 * Devuelve un investigador en especifico
	 * 
	 * @param id
	 * @return Investigador
	 */
	public Investigador getId(String id);

	/**
	 * Añade un investigador a la base de datos
	 * 
	 * @param investigador
	 * @return Investigador
	 */
	public Investigador add(Investigador investigador);

	/**
	 * Actualiza un investigador
	 * 
	 * @param investigador
	 * @return Investigador
	 */
	public Investigador update(Investigador investigador);

	/**
	 * Elimina un investigador
	 * 
	 * @param id
	 */
	public void delete(String id);
}
