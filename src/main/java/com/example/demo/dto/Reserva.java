/**
 * 
 */
package com.example.demo.dto;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "reservas")
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "Comienza")
	private Date comienta;

	@Column(name = "Fin")
	private Date fin;

	@ManyToOne
	@JoinColumn(name = "DNI")
	private Investigador investigador;

	@ManyToOne
	@JoinColumn(name = "Num_serie")
	private Equipo equipo;

	/**
	 * 
	 */
	public Reserva() {
	}

	/**
	 * @param comienta
	 * @param fin
	 * @param investigador
	 * @param equipo
	 */
	public Reserva(Date comienta, Date fin, Investigador investigador, Equipo equipo) {
		this.comienta = comienta;
		this.fin = fin;
		this.investigador = investigador;
		this.equipo = equipo;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the comienta
	 */
	public Date getComienta() {
		return comienta;
	}

	/**
	 * @return the fin
	 */
	public Date getFin() {
		return fin;
	}

	/**
	 * @return the investigador
	 */
	public Investigador getInvestigador() {
		return investigador;
	}

	/**
	 * @return the equipo
	 */
	public Equipo getEquipo() {
		return equipo;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param comienta the comienta to set
	 */
	public void setComienta(Date comienta) {
		this.comienta = comienta;
	}

	/**
	 * @param fin the fin to set
	 */
	public void setFin(Date fin) {
		this.fin = fin;
	}

	/**
	 * @param investigador the investigador to set
	 */
	public void setInvestigador(Investigador investigador) {
		this.investigador = investigador;
	}

	/**
	 * @param equipo the equipo to set
	 */
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

}
