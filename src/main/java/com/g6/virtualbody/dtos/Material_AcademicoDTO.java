package com.g6.virtualbody.dtos;

import com.g6.virtualbody.entities.Curso;



public class Material_AcademicoDTO {

    private int idMaterialacademico;

    private String titulomaterial;

    private String descripcion;

    private String urlarchivo;

    private Curso curso;

    public int getIdmaterialacademico() {
        return idMaterialacademico;
    }

    public void setIdmaterialacademico(int idMaterialacademico) {
        this.idMaterialacademico = idMaterialacademico;
    }

    public String getTitulomaterial() {
        return titulomaterial;
    }

    public void setTitulomaterial(String titulomaterial) {
        this.titulomaterial = titulomaterial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrlarchivo() {
        return urlarchivo;
    }

    public void setUrlarchivo(String urlarchivo) {
        this.urlarchivo = urlarchivo;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
