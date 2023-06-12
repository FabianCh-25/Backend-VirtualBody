package com.g6.virtualbody.dtos;

import com.g6.virtualbody.entities.Aula;
import com.g6.virtualbody.entities.Curso;
import com.g6.virtualbody.entities.Docente;


import java.time.LocalDate;

public class DetalleMatriculaDTO {
    private int idDetalleMatricula;
    private LocalDate fechaInscripcion;
    private Docente docente;
    private Aula aula;
    private Curso curso;

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

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
