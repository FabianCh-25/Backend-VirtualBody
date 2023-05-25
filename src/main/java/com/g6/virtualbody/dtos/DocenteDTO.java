package com.g6.virtualbody.dtos;

import javax.persistence.Column;

public class DocenteDTO {
    private int idDocente;
    private String nombre;

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
