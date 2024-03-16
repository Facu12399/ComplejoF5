package org.ComplejoF5.entidad;

import java.io.Serializable;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class GenerarTurno{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id_turno")
	private Long id_turno;
	private String dia;
	@Column
    private LocalTime hora;
    
    @OneToOne
    @JoinColumn (name="idPersona", referencedColumnName = "id_persona")
    private Persona persona;
    

    public GenerarTurno() {
    }


	public GenerarTurno(Long id_turno, String dia, LocalTime hora, Persona persona) {
		super();
		this.id_turno = id_turno;
		this.dia = dia;
		this.hora = hora;
		this.persona = persona;
	}


	public Long getId_turno() {
		return id_turno;
	}


	public void setId_turno(Long id_turno) {
		this.id_turno = id_turno;
	}


	public String getDia() {
		return dia;
	}


	public void setDia(String dia) {
		this.dia = dia;
	}


	public LocalTime getHora() {
		return hora;
	}


	public void setHora(LocalTime hora) {
		this.hora = hora;
	}


	public Persona getPersona() {
		return persona;
	}


	public void setPersona(Persona persona) {
		this.persona = persona;
	}

    
	

}