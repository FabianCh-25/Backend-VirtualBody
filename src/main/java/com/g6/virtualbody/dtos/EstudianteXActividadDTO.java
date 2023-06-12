package com.g6.virtualbody.dtos;

import com.g6.virtualbody.entities.Actividad;
import com.g6.virtualbody.entities.Estudiante;


public class EstudianteXActividadDTO {
    private int idExA;

    private Actividad act;

    private Estudiante estudiante;
    private  int calificacion;


    public int getIdExA() {
        return idExA;
    }

    public void setIdExA(int idExA) {
        this.idExA = idExA;
    }

    public Actividad getAct() {
        return act;
    }

    public void setAct(Actividad act) {
        this.act = act;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
