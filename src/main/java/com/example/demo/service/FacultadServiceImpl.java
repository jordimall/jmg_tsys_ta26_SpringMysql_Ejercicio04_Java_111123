/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IFacultadDAO;
import com.example.demo.dto.Facultad;

/**
 * 
 */
@Service
public class FacultadServiceImpl implements IFacultadService {

	@Autowired
	IFacultadDAO daoFacultad;

	/**
	 * Deveuelve todas las facultades
	 * 
	 * @return List<Facultad>
	 */
	public List<Facultad> getAll() {
		return daoFacultad.findAll();
	}

	/**
	 * Devuelve una facultad en especifico
	 * 
	 * @param id
	 * @return Facultad
	 */
	public Facultad getId(Long id) {
		return daoFacultad.findById(id).get();
	}

	/**
	 * Añade una facultad a la base de datos
	 * 
	 * @param facultad
	 * @return Facultad
	 */
	public Facultad add(Facultad facultad) {
		return daoFacultad.save(facultad);
	}

	/**
	 * Actualiza una facultad
	 * 
	 * @param facultad
	 * @return Facultad
	 */
	public Facultad update(Facultad facultad) {
		return daoFacultad.save(facultad);
	}

	/**
	 * Elimina un facultad
	 * 
	 * @param id
	 */
	public void delete(Long id) {
		daoFacultad.deleteById(id);
	}
}
