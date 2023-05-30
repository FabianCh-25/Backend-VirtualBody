package com.g6.virtualbody.entities;

import javax.persistence.*;

@Entity
@Table(name = "cursos")
public class Curso {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCurso;
    @Column(name = "codeCurso",length = 3,nullable = false)
    private String codeCurso;
    @Column(name = "nameCurso",length = 30,nullable = false)
    private String nameCurso;
    @Column(name ="descriptionCurso", length = 100, nullable = false)
    private String descriptionCurso;

    public Curso(){
    }

    public Curso(int idCurso, String codeCurso, String nameCurso, String descriptionCurso) {
        this.idCurso = idCurso;
        this.codeCurso = codeCurso;
        this.nameCurso = nameCurso;
        this.descriptionCurso = descriptionCurso;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getCodeCurso() {
        return codeCurso;
    }

    public void setCodeCurso(String codeCurso) {
        this.codeCurso = codeCurso;
    }

    public String getNameCurso() {
        return nameCurso;
    }

    public void setNameCurso(String nameCurso) {
        this.nameCurso = nameCurso;
    }

    public String getDescriptionCurso() {
        return descriptionCurso;
    }

    public void setDescriptionCurso(String descriptionCurso) {
        this.descriptionCurso = descriptionCurso;
    }
}
