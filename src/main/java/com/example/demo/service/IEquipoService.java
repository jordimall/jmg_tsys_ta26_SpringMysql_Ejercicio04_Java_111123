/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Equipo;

/**
 * 
 */
public interface IEquipoService {

	/**
	 * Deveuelve todos los equipos
	 * 
	 * @return List<Equipo>
	 */
	public List<Equipo> getAll();

	/**
	 * Devuelve un equipo en especifico
	 * 
	 * @param id
	 * @return Equipo
	 */
	public Equipo getId(String id);

	/**
	 * Añade un equipo a la base de datos
	 * 
	 * @param equipo
	 * @return Equipo
	 */
	public Equipo add(Equipo equipo);

	/**
	 * Actualiza un equipo
	 * 
	 * @param equipo
	 * @return Equipo
	 */
	public Equipo update(Equipo equipo);

	/**
	 * Elimina un equipo
	 * 
	 * @param id
	 */
	public void delete(String id);
}
