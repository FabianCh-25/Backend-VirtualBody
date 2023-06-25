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
    public List<ActivityStudentDTO> reporte05() {
        List<String[]> getStudentsByActivity=atR.getStudentsByActivity();
        List<ActivityStudentDTO> activityStudentDTOS=new ArrayList<>();
        for (String[] data:getStudentsByActivity){
            ActivityStudentDTO asd=new ActivityStudentDTO();
            asd.setActivity(data[0]);
            asd.setStudentCount(Integer.parseInt(data[1]));
            activityStudentDTOS.add(asd);
        }
        return activityStudentDTOS;
    }


}
