package com.g6.virtualbody.services;

import com.g6.virtualbody.dtos.ActivityStudentDTO;
import com.g6.virtualbody.entities.Actividad;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IActividadService {
    public void insert(Actividad actividad);
    List<Actividad>list();
    public void delete(int idActividad);
    Actividad ListId(int idActividad);
    public List<ActivityStudentDTO> reporte05();
}
