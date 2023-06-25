package com.g6.virtualbody.services;

import com.g6.virtualbody.entities.Estudiante;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IEstudianteService {
    public void insert(Estudiante estudiante);
    List<Estudiante> list();
    public void delete(int idEstudiante);
    public Estudiante listId (int idEstudiante);
    public Estudiante listbyUser(String username);

}