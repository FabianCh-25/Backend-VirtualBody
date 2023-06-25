package com.g6.virtualbody.services;

import com.g6.virtualbody.dtos.ClassroomTeacherDTO;
import com.g6.virtualbody.entities.Docente;

import java.util.List;

public interface IDocenteService {
    public void insert(Docente docente);
    List<Docente> list();
    public void delete(int idDocente);
    public Docente ListId(int idDocente);
    public Docente listbyUser(String username);

    List<Docente> find(String nombre);
    public List<ClassroomTeacherDTO> report02(); //aquí
}
