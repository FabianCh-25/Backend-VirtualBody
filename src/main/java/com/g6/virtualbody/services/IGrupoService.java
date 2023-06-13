package com.g6.virtualbody.services;

import com.g6.virtualbody.entities.Grupo;

import java.util.List;

public interface IGrupoService {
    public void insert(Grupo grupo);
    List<Grupo> list();
    public void delete(int idGrupo);
    public Grupo listId (int idGrupo);
}
