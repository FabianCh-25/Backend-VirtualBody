package com.g6.virtualbody.entities;

import javax.persistence.*;


@Entity
@Table(name = "estudiantes")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstudiante;
    @Column(name = "NombreEstudiante", length = 20, nullable = false)
    private String NombreEstudiante;
    @Column(name = "ApellidoEstudiante", length = 20, nullable = false)
    private String ApellidoEstudiante;
    @Column(name = "CorreoEstudiante", length = 35, nullable = false)
    private String CorreoEstudiante;
    @Column(name = "ClaveEstudiante", length = 15, nullable = false)
    private String ClaveEstudiante;
    @Column(name = "TelefonoEstudiante", length = 15, nullable = false)
    private String TelefonoEstudiante;


    public Estudiante() {
    }

    public Estudiante(int idEstudiante, String nombreEstudiante, String apellidoEstudiante, String correoEstudiante, String claveEstudiante, String telefonoEstudiante) {
        this.idEstudiante = idEstudiante;
        NombreEstudiante = nombreEstudiante;
        ApellidoEstudiante = apellidoEstudiante;
        CorreoEstudiante = correoEstudiante;
        ClaveEstudiante = claveEstudiante;
        TelefonoEstudiante = telefonoEstudiante;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombreEstudiante() {
        return NombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        NombreEstudiante = nombreEstudiante;
    }

    public String getApellidoEstudiante() {
        return ApellidoEstudiante;
    }

    public void setApellidoEstudiante(String apellidoEstudiante) {
        ApellidoEstudiante = apellidoEstudiante;
    }

    public String getCorreoEstudiante() {
        return CorreoEstudiante;
    }

    public void setCorreoEstudiante(String correoEstudiante) {
        CorreoEstudiante = correoEstudiante;
    }

    public String getClaveEstudiante() {
        return ClaveEstudiante;
    }

    public void setClaveEstudiante(String claveEstudiante) {
        ClaveEstudiante = claveEstudiante;
    }

    public String getTelefonoEstudiante() {
        return TelefonoEstudiante;
    }

    public void setTelefonoEstudiante(String telefonoEstudiante) {
        TelefonoEstudiante = telefonoEstudiante;
    }
}
