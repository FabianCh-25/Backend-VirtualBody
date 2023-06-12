package com.g6.virtualbody.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "actividades")
public class Actividad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idActividad;
    @Column(name= "titulo",length = 35,nullable = false)
    private String titulo;
    @Column(name= "descripcion",length = 150,nullable = false)
    private String descripcion;
    @Column(name = "fechaPublicacion", nullable = false)
    private LocalDate fechaPublicacion;
    @Column(name = "fechaEntrega", nullable = false)
    private LocalDate fechaEntrega;

    public Actividad() {
    }

    public Actividad(int idActividad, String titulo, String descripcion, LocalDate fechaPublicacion, LocalDate fechaEntrega) {
        this.idActividad = idActividad;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaPublicacion = fechaPublicacion;
        this.fechaEntrega = fechaEntrega;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
}
