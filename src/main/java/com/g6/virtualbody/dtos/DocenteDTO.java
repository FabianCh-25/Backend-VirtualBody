package com.g6.virtualbody.dtos;

import com.g6.virtualbody.entities.Users;

import javax.persistence.Column;

public class DocenteDTO {
    private int idDocente;
    private String nombre;
    private String apellidoDocente;
    private String correoDocente;
    private String claveDocente;
    private int telefonoDocente;
    private Users users;

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidoDocente() {
        return apellidoDocente;
    }

    public void setApellidoDocente(String apellidoDocente) {
        this.apellidoDocente = apellidoDocente;
    }

    public String getCorreoDocente() {
        return correoDocente;
    }

    public void setCorreoDocente(String correoDocente) {
        this.correoDocente = correoDocente;
    }

    public String getClaveDocente() {
        return claveDocente;
    }

    public void setClaveDocente(String claveDocente) {
        this.claveDocente = claveDocente;
    }

    public int getTelefonoDocente() {
        return telefonoDocente;
    }

    public void setTelefonoDocente(int telefonoDocente) {
        this.telefonoDocente = telefonoDocente;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
