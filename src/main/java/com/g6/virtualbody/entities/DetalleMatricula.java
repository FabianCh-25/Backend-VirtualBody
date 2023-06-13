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
    @ManyToOne
    @JoinColumn(name = "idAula")
    private Aula aula;
    @ManyToOne
    @JoinColumn(name = "idCurso")
    private Curso curso;
    @ManyToOne
    @JoinColumn(name = "idMatricula")
    private Matricula matricula;

    public DetalleMatricula() {
    }

    public DetalleMatricula(int idDetalleMatricula, LocalDate fechaInscripcion, Docente docente, Aula aula, Curso curso, Matricula matricula) {
        this.idDetalleMatricula = idDetalleMatricula;
        this.fechaInscripcion = fechaInscripcion;
        this.docente = docente;
        this.aula = aula;
        this.curso = curso;
        this.matricula = matricula;
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

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }
}
