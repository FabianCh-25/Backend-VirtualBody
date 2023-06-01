package com.g6.virtualbody.dtos;

import com.g6.virtualbody.entities.AulaxDocente;

public class AxDDTO {
    private int idAulaxDocente;
    private String nameDocente;
    private String correoDocente;
    private AulaxDocente AxD;

    public int getIdAulaxDocente() {
        return idAulaxDocente;
    }

    public void setIdAulaxDocente(int idAulaxDocente) {
        this.idAulaxDocente = idAulaxDocente;
    }

    public String getNameDocente() {
        return nameDocente;
    }

    public void setNameDocente(String nameDocente) {
        this.nameDocente = nameDocente;
    }

    public String getCorreoDocente() {
        return correoDocente;
    }

    public void setCorreoDocente(String correoDocente) {
        this.correoDocente = correoDocente;
    }

    public AulaxDocente getAxD() {
        return AxD;
    }

    public void setAxD(AulaxDocente axD) {
        AxD = axD;
    }
}
