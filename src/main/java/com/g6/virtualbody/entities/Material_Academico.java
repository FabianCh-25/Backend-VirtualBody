package com.g6.virtualbody.entities;

import javax.persistence.*;

@Entity
@Table(name = "materialAcademico")
public class Material_Academico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMaterialacademico;
    @Column(name = "titulomaterial", length = 30, nullable = false)
    private String titulomaterial;
    @Column(name = "descripcion", length = 400, nullable = false)
    private String descripcion;
    @Column(name = "urlarchivo", length = 100, nullable = false)
    private String urlarchivo;
    @ManyToOne
    @JoinColumn(name = "IdCurso")
    private Curso curso;

    public Material_Academico(int idMaterialacademico, String titulomaterial, String descripcion, String urlarchivo, Curso curso) {
        this.idMaterialacademico = idMaterialacademico;
        this.titulomaterial = titulomaterial;
        this.descripcion = descripcion;
        this.urlarchivo = urlarchivo;
        this.curso = curso;
    }

    public Material_Academico(){}

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
