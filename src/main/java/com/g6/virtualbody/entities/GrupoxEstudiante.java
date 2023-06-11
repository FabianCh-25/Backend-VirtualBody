package com.g6.virtualbody.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="GrupoxEstudiante")
public class GrupoxEstudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGrupoxEstudiante;
    @Column(name = "fechaacceso",length = 20,nullable = false)

    private LocalDate fechaacceso;

    @ManyToOne
    @JoinColumn(name = "Grupo",nullable = false)

    private Grupo grupo;
    @ManyToOne
    @JoinColumn(name = "Estudiante",nullable = false)

    private Estudiante estudiante;

    public GrupoxEstudiante(){

    }

    public GrupoxEstudiante(int idGrupoxEstudiante, LocalDate fechaacceso, Grupo grupo, Estudiante estudiante) {
        this.idGrupoxEstudiante = idGrupoxEstudiante;
        this.fechaacceso = fechaacceso;
        this.grupo = grupo;
        this.estudiante = estudiante;
    }

    public int getIdGrupoxEstudiante() {
        return idGrupoxEstudiante;
    }

    public void setIdGrupoxEstudiante(int idGrupoxEstudiante) {
        this.idGrupoxEstudiante = idGrupoxEstudiante;
    }

    public LocalDate getFechaacceso() {
        return fechaacceso;
    }

    public void setFechaacceso(LocalDate fechaacceso) {
        this.fechaacceso = fechaacceso;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
