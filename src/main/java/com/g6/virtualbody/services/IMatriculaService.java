package com.g6.virtualbody.services;

import com.g6.virtualbody.entities.Matricula;

import java.util.List;

public interface IMatriculaService {
    public void insert(Matricula matricula);
    List<Matricula> list();
    public void delete(int idMatricula);
    public Matricula listId(int idMatricula);
}
