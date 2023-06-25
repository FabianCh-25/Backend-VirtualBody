package com.g6.virtualbody.servicesimplement;

import com.g6.virtualbody.dtos.ActivityStudentDTO;
import com.g6.virtualbody.entities.Actividad;
import com.g6.virtualbody.repositories.IActividadRepository;
import com.g6.virtualbody.services.IActividadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActividadServiceImplement implements IActividadService {
    @Autowired
    private IActividadRepository atR;
    @Override
    public void insert(Actividad actividad) {
        atR.save(actividad);
    }

    @Override
    public List<Actividad> list() {
        return atR.findAll();
    }

    @Override
    public void delete(int idActividad) {
        atR.deleteById(idActividad);
    }

    @Override
    public Actividad ListId(int idActividad) {
        return atR.findById(idActividad)
                .orElse(new Actividad());
    }

    @Override
    public List<ActivityStudentDTO> reporte03() {
        List<String[]> act_count = atR.getStudentsByActivity();
        List<ActivityStudentDTO> act_studnt = new ArrayList<>();

        for (String[] data : act_count) {
            ActivityStudentDTO dto = new ActivityStudentDTO();
            dto.setActivity(data[0]);
            dto.setStudentCount(Integer.parseInt(data[1]));
            act_studnt.add(dto);
        }
        return act_studnt; //Fabian Ch
        }
}
