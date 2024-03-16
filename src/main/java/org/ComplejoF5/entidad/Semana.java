package org.ComplejoF5.entidad;

import java.util.List;

public class Semana {
    private List<DiaHora> semana;

    public Semana(){}

    public Semana(List<DiaHora> semana){
        this.semana = semana;
    }

    public List<DiaHora> getSemana() {
        return semana;
    }

    public void setSemana(List<DiaHora> semana) {
        this.semana = semana;
    }
}
