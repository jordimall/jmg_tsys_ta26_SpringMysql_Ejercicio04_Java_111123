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

import com.example.demo.dto.Equipo;
import com.example.demo.service.EquipoServiceImpl;

/**
 * 
 */
@RestController
@RequestMapping("/api/equipos")
public class EquipoController {

	@Autowired
	EquipoServiceImpl equipoServiceImpl;

	/**
	 * Deveuelve todos los equipos
	 * 
	 * @return List<Equipo>
	 */
	@GetMapping("/all")
	public List<Equipo> all() {
		return equipoServiceImpl.getAll();
	}

	/**
	 * Devuelve un equipo en especifico
	 * 
	 * @param id
	 * @return Equipo
	 */
	@GetMapping("/show/{id}")
	public Equipo show(@PathVariable(name = "id") String id) {

		Equipo equipo_xid = new Equipo();

		equipo_xid = equipoServiceImpl.getId(id);

		return equipo_xid;
	}

	/**
	 * Añade un equipo a la base de datos
	 * 
	 * @param equipo
	 * @return Equipo
	 */
	@PostMapping("/new")
	public Equipo create(@RequestBody Equipo equipo) {

		return equipoServiceImpl.add(equipo);
	}

	/**
	 * Actualiza un equipo
	 * 
	 * @param equipo
	 * @return Equipo
	 */
	@PutMapping("/update/{id}")
	public Equipo edit(@PathVariable(name = "id") String id, @RequestBody Equipo equipo) {

		Equipo equipoSeleccionado = new Equipo();
		Equipo equipoActualizado = new Equipo();

		equipoSeleccionado = equipoServiceImpl.getId(id);

		equipoSeleccionado.setNombre(equipo.getNombre());
		equipoSeleccionado.setFacultad(equipo.getFacultad());

		equipoActualizado = equipoServiceImpl.update(equipoSeleccionado);

		return equipoActualizado;
	}

	/**
	 * Elimina un equipo
	 * 
	 * @param id
	 */
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(name = "id") String id) {
		equipoServiceImpl.delete(id);
	}

}
