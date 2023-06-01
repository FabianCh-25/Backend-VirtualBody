package com.g6.virtualbody.services;

import com.g6.virtualbody.entities.AulaxDocente;

import java.util.List;

public interface IAxDService {
    public void insert(AulaxDocente AxD);
    List<AulaxDocente> list();
    List<AulaxDocente> find(String nombre);
}
