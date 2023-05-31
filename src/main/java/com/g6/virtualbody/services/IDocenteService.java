package com.g6.virtualbody.services;

import com.g6.virtualbody.entities.Docente;

import java.util.List;

public interface IDocenteService {
    public void insert(Docente docente);
    List<Docente> list();
    public void delete(int idDocente);
    Docente ListId(int idDocente);
}