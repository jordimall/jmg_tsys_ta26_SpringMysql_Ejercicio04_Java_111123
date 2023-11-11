/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Facultad;

/**
 * 
 */
public interface IFacultadService {
	
	/**
	 * Deveuelve todas las facultades
	 * 
	 * @return List<Facultad>
	 */
	public List<Facultad> getAll();

	/**
	 * Devuelve una facultad en especifico
	 * 
	 * @param id
	 * @return Facultad
	 */
	public Facultad getId(Long id);

	/**
	 * Añade una facultad a la base de datos
	 * 
	 * @param facultad
	 * @return Facultad
	 */
	public Facultad add(Facultad facultad);

	/**
	 * Actualiza una facultad
	 * 
	 * @param facultad
	 * @return Facultad
	 */
	public Facultad update(Facultad facultad);

	/**
	 * Elimina una facultad
	 * 
	 * @param id
	 */
	public void delete(Long id);
}
