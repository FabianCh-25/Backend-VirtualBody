package com.g6.virtualbody.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Matriculas")
public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMatricula;
    @ManyToOne
    @JoinColumn(name = "idEstudiante")
    private Estudiante estudiante;
    @Column(name = "fechaPagoMatricula", nullable = false)
    private LocalDate fechaPagoMatricula;
    @Column(name = "costoMatricula", nullable = false)
    private double costoMatricula;

    public Matricula() {
    }

    public Matricula(int idMatricula, Estudiante estudiante, LocalDate fechaPagoMatricula, double costoMatricula) {
        this.idMatricula = idMatricula;
        this.estudiante = estudiante;
        this.fechaPagoMatricula = fechaPagoMatricula;
        this.costoMatricula = costoMatricula;
    }

    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public LocalDate getFechaPagoMatricula() {
        return fechaPagoMatricula;
    }

    public void setFechaPagoMatricula(LocalDate fechaPagoMatricula) {
        this.fechaPagoMatricula = fechaPagoMatricula;
    }

    public double getCostoMatricula() {
        return costoMatricula;
    }

    public void setCostoMatricula(double costoMatricula) {
        this.costoMatricula = costoMatricula;
    }
}
