package com.g6.virtualbody.services;

import com.g6.virtualbody.entities.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IEstudianteService {
    public void insert(Estudiante estudiante);
    List<Estudiante> list();
    public void delete(int idEstudiante);
    public Estudiante listId (int idEstudiante);
}
