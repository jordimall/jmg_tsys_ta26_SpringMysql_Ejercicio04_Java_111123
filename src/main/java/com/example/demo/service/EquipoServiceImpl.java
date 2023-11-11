/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEquipoDAO;
import com.example.demo.dto.Equipo;

/**
 * 
 */
@Service
public class EquipoServiceImpl implements IEquipoService {

	@Autowired
	IEquipoDAO daoEquipo;

	/**
	 * Deveuelve todos los equipos
	 * 
	 * @return List<Equipo>
	 */
	public List<Equipo> getAll() {
		return daoEquipo.findAll();
	}

	/**
	 * Devuelve un equipo en especifico
	 * 
	 * @param id
	 * @return Equipo
	 */
	public Equipo getId(String id) {
		return daoEquipo.findById(id).get();
	}

	/**
	 * Añade un equipo a la base de datos
	 * 
	 * @param equipo
	 * @return Equipo
	 */
	public Equipo add(Equipo equipo) {
		return daoEquipo.save(equipo);
	}

	/**
	 * Actualiza un equipo
	 * 
	 * @param equipo
	 * @return Equipo
	 */
	public Equipo update(Equipo equipo) {
		return daoEquipo.save(equipo);
	}

	/**
	 * Elimina un equipo
	 * 
	 * @param id
	 */
	public void delete(String id) {
		daoEquipo.deleteById(id);
	}
}
