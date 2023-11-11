/**
 * 
 */
package com.example.demo.controller;

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

import com.example.demo.dto.Reserva;
import com.example.demo.service.ReservaServiceImpl;

/**
 * 
 */
@RestController
@RequestMapping("/api/reservas")
public class ReservaController {

	@Autowired
	ReservaServiceImpl reservaServiceImpl;

	/**
	 * Deveuelve todas los reservas
	 * 
	 * @return List<Reserva>
	 */
	@GetMapping("/all")
	public List<Reserva> all() {
		return reservaServiceImpl.getAll();
	}

	/**
	 * Devuelve una reserva en especifico
	 * 
	 * @param id
	 * @return Reserva
	 */
	@GetMapping("/show/{id}")
	public Reserva show(@PathVariable(name = "id") Long id) {

		Reserva reserva_xid = new Reserva();

		reserva_xid = reservaServiceImpl.getId(id);

		return reserva_xid;
	}

	/**
	 * Añade una reserva a la base de datos
	 * 
	 * @param reserva
	 * @return Reserva
	 */
	@PostMapping("/new")
	public Reserva create(@RequestBody Reserva reserva) {

		return reservaServiceImpl.add(reserva);
	}

	/**
	 * Actualiza una reserva
	 * 
	 * @param reserva
	 * @return Reserva
	 */
	@PutMapping("/update/{id}")
	public Reserva edit(@PathVariable(name = "id") Long id, @RequestBody Reserva reserva) {

		Reserva reservaSeleccionado = new Reserva();
		Reserva reservaActualizado = new Reserva();

		reservaSeleccionado = reservaServiceImpl.getId(id);

		reservaSeleccionado.setComienta(reserva.getComienta());
		reservaSeleccionado.setFin(reserva.getFin());

		reservaActualizado = reservaServiceImpl.update(reservaSeleccionado);

		return reservaActualizado;
	}

	/**
	 * Elimina una reserva
	 * 
	 * @param id
	 */
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(name = "id") Long id) {
		reservaServiceImpl.delete(id);
	}

}
