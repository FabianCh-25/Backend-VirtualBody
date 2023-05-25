package com.g6.virtualbody.entities;

import javax.persistence.*;

@Entity
@Table(name = "Docentes")
public class Docente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDocente;
    @Column(name="nombre", length = 50, nullable = false)
    private String nombre;

    public Docente() {
    }

    public Docente(int idDocente, String nombre) {
        this.idDocente = idDocente;
        this.nombre = nombre;
    }

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
