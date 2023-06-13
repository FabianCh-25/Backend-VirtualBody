package com.g6.virtualbody.dtos;

import com.g6.virtualbody.entities.Estudiante;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class MatriculaDTO {
    private int idMatricula;
    private Estudiante estudiante;
    private LocalDate fechaPagoMatricula;
    private double costoMatricula;

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
