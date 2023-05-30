package com.g6.virtualbody.entities;

import javax.persistence.*;

@Entity
@Table (name = "Aulas")
public class Aula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAula;
    @Column(name = "seccionAula",length = 4, nullable = false)
    private String seccionAula;
    @Column(name = "vacanteAula",length = 3, nullable = false)
    private String vacanteAula;

    public Aula() {
    }

    public Aula(int idAula, String seccionAula, String vacanteAula) {
        this.idAula = idAula;
        this.seccionAula = seccionAula;
        this.vacanteAula = vacanteAula;
    }

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