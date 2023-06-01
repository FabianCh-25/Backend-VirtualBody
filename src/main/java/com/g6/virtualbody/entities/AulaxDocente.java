package com.g6.virtualbody.entities;

import javax.persistence.*;

@Entity
@Table(name="AulaxDocente")
public class AulaxDocente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAulaxDocente;
    @Column(name="nameDocente", length = 40, nullable = false)
    private String nameDocente;
    @Column(name="nameDocente", length = 45, nullable = false)
    private String correoDocente;

    public AulaxDocente() {

    }

    public AulaxDocente(int idAulaxDocente, String nameDocente, String correoDocente) {
        this.idAulaxDocente = idAulaxDocente;
        this.nameDocente = nameDocente;
        this.correoDocente = correoDocente;
    }

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
}
