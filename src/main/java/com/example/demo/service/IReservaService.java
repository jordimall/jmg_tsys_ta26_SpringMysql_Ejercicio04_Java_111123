/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Reserva;

/**
 * 
 */
public interface IReservaService {

	/**
	 * Deveuelve todas las reservas
	 * 
	 * @return List<Reserva>
	 */
	public List<Reserva> getAll();

	/**
	 * Devuelve una reserva en especifico
	 * 
	 * @param id
	 * @return Reserva
	 */
	public Reserva getId(Long id);

	/**
	 * Añade una reserva a la base de datos
	 * 
	 * @param reserva
	 * @return Reserva
	 */
	public Reserva add(Reserva reserva);

	/**
	 * Actualiza una reserva
	 * 
	 * @param reserva
	 * @return Reserva
	 */
	public Reserva update(Reserva reserva);

	/**
	 * Elimina una reserva
	 * 
	 * @param id
	 */
	public void delete(Long id);
}
