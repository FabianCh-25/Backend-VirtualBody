package com.g6.virtualbody.services;

import com.g6.virtualbody.dtos.EstudianteXActividadDTO;
import com.g6.virtualbody.entities.EstudianteXActividad;

import java.util.List;

public interface IExAService {
    public void insert(EstudianteXActividad exa);
    List<EstudianteXActividad>list();
    public void delete (int idexa);
    public EstudianteXActividad ListID(int idexa);
    public List<EstudianteXActividad> report04();//report 04

}
