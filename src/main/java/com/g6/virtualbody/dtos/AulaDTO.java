package com.g6.virtualbody.dtos;

import javax.persistence.Column;

public class AulaDTO {
    private int idAula;
    private String seccionAula;
    private String vacanteAula;

    public int getIdAula() {
        return idAula;
    }

    public void setIdAula(int idAula) {
        this.idAula = idAula;
    }

    public String getSeccionAula() {
        return seccionAula;
    }

    public void setSeccionAula(String seccionAula) {
        this.seccionAula = seccionAula;
    }

    public String getVacanteAula() {
        return vacanteAula;
    }

    public void setVacanteAula(String vacanteAula) {
        this.vacanteAula = vacanteAula;
    }
}
