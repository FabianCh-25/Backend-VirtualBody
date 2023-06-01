package com.g6.virtualbody.entities;

import javax.persistence.*;


@Entity
@Table(name = "estudiantes")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstudiante;
    @Column(name = "nombreEstudiante", length = 20, nullable = false)
    private String nombreEstudiante;
    @Column(name = "apellidoEstudiante", length = 20, nullable = false)
    private String apellidoEstudiante;
    @Column(name = "correoEstudiante", length = 35, nullable = false)
    private String correoEstudiante;
    @Column(name = "claveEstudiante", length = 15, nullable = false)
    private String claveEstudiante;
    @Column(name = "String", length = 15, nullable = false)
    private String telefonoEstudiante;


    public Estudiante() {
    }

    public Estudiante(int idEstudiante, String nombreEstudiante, String apellidoEstudiante,
                      String correoEstudiante, String claveEstudiante, String telefonoEstudiante) {
        this.idEstudiante = idEstudiante;
        this.nombreEstudiante = nombreEstudiante;
        this.apellidoEstudiante = apellidoEstudiante;
        this.correoEstudiante = correoEstudiante;
        this.claveEstudiante = claveEstudiante;
        this.telefonoEstudiante = telefonoEstudiante;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getApellidoEstudiante() {
        return apellidoEstudiante;
    }

    public void setApellidoEstudiante(String apellidoEstudiante) {
        this.apellidoEstudiante = apellidoEstudiante;
    }

    public String getCorreoEstudiante() {
        return correoEstudiante;
    }

    public void setCorreoEstudiante(String correoEstudiante) {
        this.correoEstudiante = correoEstudiante;
    }

    public String getClaveEstudiante() {
        return claveEstudiante;
    }

    public void setClaveEstudiante(String claveEstudiante) {
        this.claveEstudiante = claveEstudiante;
    }

    public String getTelefonoEstudiante() {
        return telefonoEstudiante;
    }

    public void setTelefonoEstudiante(String telefonoEstudiante) {
        this.telefonoEstudiante = telefonoEstudiante;
    }
}
