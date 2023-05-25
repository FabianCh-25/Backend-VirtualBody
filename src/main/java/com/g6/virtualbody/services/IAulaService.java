package com.g6.virtualbody.services;

import com.g6.virtualbody.entities.Aula;

import java.util.List;

public interface IAulaService {
    public void insert(Aula aula);
    List<Aula> list();
}
