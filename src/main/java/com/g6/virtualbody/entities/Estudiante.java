package com.g6.virtualbody.entities;

import javax.persistence.*;


@Entity
@Table(name = "estudiantes")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idEstudiante;
    @Column(name= "titulo",length = 35,nullable = false)
    private String titulo;

    public Estudiante() {
    }

    public Estudiante(int idEstudiante, String titulo) {
        this.idEstudiante = idEstudiante;
        this.titulo = titulo;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
