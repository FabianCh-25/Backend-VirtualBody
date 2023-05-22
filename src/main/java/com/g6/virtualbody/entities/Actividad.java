package com.g6.virtualbody.entities;

import javax.persistence.*;

@Entity
@Table(name = "actividades")
public class Actividad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idActividad;
    @Column(name= "titulo",length = 35,nullable = false)
    private String titulo;

    public Actividad() {
    }

    public Actividad(int idActividad, String titulo) {
        this.idActividad = idActividad;
        this.titulo = titulo;
    }

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
