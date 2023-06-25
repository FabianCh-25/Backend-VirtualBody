package com.g6.virtualbody.entities;

import javax.persistence.*;

@Entity
@Table(name = "Docentes")
public class Docente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDocente;
    @Column(name="nombre", length = 50, nullable = false)
    private String nombre;
    @Column(name="apellidoDocente", length = 50, nullable = false)
    private String apellidoDocente;
    @Column(name = "correoDocente", length = 60, nullable = false)
    private String correoDocente;
    @Column(name = "claveDocente", length = 40, nullable = false)
    private String claveDocente;
    @Column(name = "telefonoDocente", length = 9, nullable = false)
    private int telefonoDocente;

    @ManyToOne
    @JoinColumn(name = "idUser", nullable = false)
    private Users users;

    public Docente() {
    }

    public Docente(int idDocente, String nombre, String apellidoDocente, String correoDocente, String claveDocente, int telefonoDocente, Users users) {
        this.idDocente = idDocente;
        this.nombre = nombre;
        this.apellidoDocente = apellidoDocente;
        this.correoDocente = correoDocente;
        this.claveDocente = claveDocente;
        this.telefonoDocente = telefonoDocente;
        this.users = users;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

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
}
