package com.g6.virtualbody.services;

import com.g6.virtualbody.entities.Actividad;

import java.util.List;


public interface IActividadService {
    public void insert(Actividad actividad);
    List<Actividad>list();
}
