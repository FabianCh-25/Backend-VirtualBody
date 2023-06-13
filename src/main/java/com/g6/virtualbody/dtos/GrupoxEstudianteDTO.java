package com.g6.virtualbody.dtos;

import com.g6.virtualbody.entities.Estudiante;
import com.g6.virtualbody.entities.Grupo;

import java.time.LocalDate;

public class GrupoxEstudianteDTO {
    private int idGrupoxEstudiante;
    private Grupo grupo;
    private Estudiante estudiante;
    private LocalDate fechaacceso;

    public int getIdGrupoxEstudiante() {
        return idGrupoxEstudiante;
    }

    public void setIdGrupoxEstudiante(int idGrupoxEstudiante) {
        this.idGrupoxEstudiante = idGrupoxEstudiante;
    }


    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public LocalDate getFechaacceso() {
        return fechaacceso;
    }

    public void setFechaacceso(LocalDate fechaacceso) {
        this.fechaacceso = fechaacceso;
    }
}
