package com.g6.virtualbody.entities;
import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "detallesMatriculas")
public class DetalleMatricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetalleMatricula;
    @Column(name = "fechaInscripcion", nullable = false)
    private LocalDate fechaInscripcion;
    @ManyToOne
    @JoinColumn(name = "idDocente")
    private Docente docente;

    public DetalleMatricula() {
    }

    public DetalleMatricula(int idDetalleMatricula, LocalDate fechaInscripcion, Docente docente) {
        this.idDetalleMatricula = idDetalleMatricula;
        this.fechaInscripcion = fechaInscripcion;
        this.docente = docente;
    }

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
