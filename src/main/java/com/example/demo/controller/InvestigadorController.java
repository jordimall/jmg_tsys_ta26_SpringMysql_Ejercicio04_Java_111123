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

import com.example.demo.dto.Investigador;
import com.example.demo.service.InvestigadorServiceImpl;

/**
 * 
 */
@RestController
@RequestMapping("/api/investigadores")
public class InvestigadorController {

	@Autowired
	InvestigadorServiceImpl investigadorServiceImpl;

	/**
	 * Deveuelve todos los investigadors
	 * 
	 * @return List<Investigador>
	 */
	@GetMapping("/all")
	public List<Investigador> all() {
		return investigadorServiceImpl.getAll();
	}

	/**
	 * Devuelve un investigador en especifico
	 * 
	 * @param id
	 * @return Investigador
	 */
	@GetMapping("/show/{id}")
	public Investigador show(@PathVariable(name = "id") String id) {

		Investigador investigador_xid = new Investigador();

		investigador_xid = investigadorServiceImpl.getId(id);

		return investigador_xid;
	}

	/**
	 * Añade un investigador a la base de datos
	 * 
	 * @param investigador
	 * @return Investigador
	 */
	@PostMapping("/new")
	public Investigador create(@RequestBody Investigador investigador) {

		return investigadorServiceImpl.add(investigador);
	}

	/**
	 * Actualiza un investigador
	 * 
	 * @param investigador
	 * @return Investigador
	 */
	@PutMapping("/update/{id}")
	public Investigador edit(@PathVariable(name = "id") String id, @RequestBody Investigador investigador) {

		Investigador investigadorSeleccionado = new Investigador();
		Investigador investigadorActualizado = new Investigador();

		investigadorSeleccionado = investigadorServiceImpl.getId(id);

		investigadorSeleccionado.setNomApels(investigador.getNomApels());
		investigadorSeleccionado.setFacultad(investigador.getFacultad());

		investigadorActualizado = investigadorServiceImpl.update(investigadorSeleccionado);

		return investigadorActualizado;
	}

	/**
	 * Elimina un investigador
	 * 
	 * @param id
	 */
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(name = "id") String id) {
		investigadorServiceImpl.delete(id);
	}

}
