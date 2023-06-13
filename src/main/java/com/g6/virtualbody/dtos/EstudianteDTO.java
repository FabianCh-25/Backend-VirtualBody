package com.g6.virtualbody.dtos;

public class EstudianteDTO {
    private int idEstudiante;
    private String NombreEstudiante;
    private String ApellidoEstudiante;
    private String CorreoEstudiante;
    private String ClaveEstudiante;
    private String TelefonoEstudiante;

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
