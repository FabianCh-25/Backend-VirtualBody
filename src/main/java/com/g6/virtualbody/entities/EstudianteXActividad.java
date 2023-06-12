package com.g6.virtualbody.entities;

import javax.persistence.*;

@Entity
@Table(name = "EstudiantesXActividad")
public class EstudianteXActividad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idExA;
    @ManyToOne
    @JoinColumn(name = "idActividad")
    private Actividad act;
    @ManyToOne
    @JoinColumn(name = "idEstudiante")
    private Estudiante estudiante;
    @Column(name = "calificacion",nullable = false)
    private  int calificacion;

    public EstudianteXActividad() {
    }

    public EstudianteXActividad(int idExA, Actividad act, Estudiante estudiante, int calificacion) {
        this.idExA = idExA;
        this.act = act;
        this.estudiante = estudiante;
        this.calificacion = calificacion;
    }

    public int getIdExA() {
        return idExA;
    }

    public void setIdExA(int idExA) {
        this.idExA = idExA;
    }

    public Actividad getAct() {
        return act;
    }

    public void setAct(Actividad act) {
        this.act = act;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
