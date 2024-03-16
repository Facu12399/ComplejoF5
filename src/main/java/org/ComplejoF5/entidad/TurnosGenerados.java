package org.ComplejoF5.entidad;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


public class TurnosGenerados {

    private List<GenerarTurno> listaTurnos;
   
    public TurnosGenerados(){}
    
    public TurnosGenerados(List<GenerarTurno> listaTurnos) {
    	this.listaTurnos = listaTurnos;
    }

    public List<GenerarTurno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<GenerarTurno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }
}
