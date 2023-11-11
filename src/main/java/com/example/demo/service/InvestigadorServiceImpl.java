/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IInvestigadorDAO;
import com.example.demo.dto.Investigador;

/**
 * 
 */
@Service
public class InvestigadorServiceImpl implements IInvestigadorService {

	@Autowired
	IInvestigadorDAO daoInvestigador;

	/**
	 * Deveuelve todos los investigadors
	 * 
	 * @return List<Investigador>
	 */
	public List<Investigador> getAll() {
		return daoInvestigador.findAll();
	}

	/**
	 * Devuelve un investigador en especifico
	 * 
	 * @param id
	 * @return Investigador
	 */
	public Investigador getId(String id) {
		return daoInvestigador.findById(id).get();
	}

	/**
	 * Añade un investigador a la base de datos
	 * 
	 * @param investigador
	 * @return Investigador
	 */
	public Investigador add(Investigador investigador) {
		return daoInvestigador.save(investigador);
	}

	/**
	 * Actualiza un investigador
	 * 
	 * @param investigador
	 * @return Investigador
	 */
	public Investigador update(Investigador investigador) {
		return daoInvestigador.save(investigador);
	}

	/**
	 * Elimina un investigador
	 * 
	 * @param id
	 */
	public void delete(String id) {
		daoInvestigador.deleteById(id);
	}
}

