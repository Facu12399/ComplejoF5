package org.ComplejoF5.entidad;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class DiaHora {
    private String dia;
    private List<LocalTime> hora;


    public DiaHora(){}

    public DiaHora(String dia, List<LocalTime> hora){
        this.dia = dia;
        this.hora = hora;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public List<LocalTime> getHora() {
        return hora;
    }

    public void setHora(List<LocalTime> hora) {
        this.hora = hora;
    }

}
