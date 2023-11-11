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

import com.example.demo.dto.Facultad;
import com.example.demo.service.FacultadServiceImpl;

/**
 * 
 */
@RestController
@RequestMapping("/api/facultades")
public class FacultadController {

	@Autowired
	FacultadServiceImpl facultadServiceImpl;

	/**
	 * Deveuelve todas las facultades
	 * 
	 * @return List<Facultad>
	 */
	@GetMapping("/all")
	public List<Facultad> all() {
		return facultadServiceImpl.getAll();
	}

	/**
	 * Devuelve una facultad en especifico
	 * 
	 * @param id
	 * @return Facultad
	 */
	@GetMapping("/show/{id}")
	public Facultad show(@PathVariable(name = "id") Long id) {

		Facultad facultad_xid = new Facultad();

		facultad_xid = facultadServiceImpl.getId(id);

		return facultad_xid;
	}

	/**
	 * Añade una facultad a la base de datos
	 * 
	 * @param facultad
	 * @return Facultad
	 */
	@PostMapping("/new")
	public Facultad create(@RequestBody Facultad facultad) {

		return facultadServiceImpl.add(facultad);
	}

	/**
	 * Actualiza una facultad
	 * 
	 * @param facultad
	 * @return Facultad
	 */
	@PutMapping("/update/{id}")
	public Facultad edit(@PathVariable(name = "id") Long id, @RequestBody Facultad facultad) {

		Facultad facultadSeleccionado = new Facultad();
		Facultad facultadActualizado = new Facultad();

		facultadSeleccionado = facultadServiceImpl.getId(id);

		facultadSeleccionado.setNombre(facultad.getNombre());

		facultadActualizado = facultadServiceImpl.update(facultadSeleccionado);

		return facultadActualizado;
	}

	/**
	 * Elimina una facultad
	 * 
	 * @param id
	 */
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(name = "id") Long id) {
		facultadServiceImpl.delete(id);
	}

}
