package com.g6.virtualbody.dtos;

import com.g6.virtualbody.entities.Docente;


import java.time.LocalDate;

public class DetalleMatriculaDTO {
    private int idDetalleMatricula;
    private LocalDate fechaInscripcion;
    private Docente docente;

    public int getIdDetalleMatricula() {
        return idDetalleMatricula;
    }

    public void setIdDetalleMatricula(int idDetalleMatricula) {
        this.idDetalleMatricula = idDetalleMatricula;
    }

    public LocalDate getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(LocalDate fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }
}