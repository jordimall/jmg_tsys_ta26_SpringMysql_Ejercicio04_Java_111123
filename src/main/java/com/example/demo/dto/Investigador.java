/**
 * 
 */
package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "investigadores")
public class Investigador {

	@Id
	@Column(name = "DNI")
	private String dni;

	@Column(name = "Nom_apels")
	private String nomApels;

	@ManyToOne
	@JoinColumn(name = "Facultad")
	private Facultad facultad;

	@OneToMany
	@JoinColumn(name = "DNI")
	private List<Reserva> reserva;

	/**
	 * 
	 */
	public Investigador() {
	}

	/**
	 * @param dni
	 * @param nomApels
	 * @param facultad
	 */
	public Investigador(String dni, String nomApels, Facultad facultad) {
		this.dni = dni;
		this.nomApels = nomApels;
		this.facultad = facultad;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @return the nomApels
	 */
	public String getNomApels() {
		return nomApels;
	}

	/**
	 * @return the facultad
	 */
	public Facultad getFacultad() {
		return facultad;
	}

	/**
	 * @return the reserva
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "DNI")
	public List<Reserva> getReserva() {
		return reserva;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @param nomApels the nomApels to set
	 */
	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}

	/**
	 * @param facultad the facultad to set
	 */
	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}

	/**
	 * @param reserva the reserva to set
	 */
	public void setReserva(List<Reserva> reserva) {
		this.reserva = reserva;
	}

}
