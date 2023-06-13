package com.g6.virtualbody.services;

import com.g6.virtualbody.entities.GrupoxEstudiante;

import java.time.LocalDate;

import java.util.List;

public interface IGrupoxEstudianteService {
    public void insert(GrupoxEstudiante grupoxEstudiante);

    List<GrupoxEstudiante> list();

    List<GrupoxEstudiante> buscarFecha(LocalDate fecha);
}
