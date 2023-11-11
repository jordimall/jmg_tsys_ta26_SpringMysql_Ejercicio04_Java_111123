/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IReservaDAO;
import com.example.demo.dto.Reserva;

/**
 * 
 */
@Service
public class ReservaServiceImpl implements IReservaService {

	@Autowired
	IReservaDAO daoReserva;

	/**
	 * Deveuelve todas las reservas
	 * 
	 * @return List<Reserva>
	 */
	public List<Reserva> getAll() {
		return daoReserva.findAll();
	}

	/**
	 * Devuelve una reserva en especifico
	 * 
	 * @param id
	 * @return Reserva
	 */
	public Reserva getId(Long id) {
		return daoReserva.findById(id).get();
	}

	/**
	 * Añade una reserva a la base de datos
	 * 
	 * @param reserva
	 * @return Reserva
	 */
	public Reserva add(Reserva reserva) {
		return daoReserva.save(reserva);
	}

	/**
	 * Actualiza una reserva
	 * 
	 * @param reserva
	 * @return Reserva
	 */
	public Reserva update(Reserva reserva) {
		return daoReserva.save(reserva);
	}

	/**
	 * Elimina una reserva
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		daoReserva.deleteById(id);
	}
}
