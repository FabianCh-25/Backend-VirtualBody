package com.g6.virtualbody.servicesimplement;

import com.g6.virtualbody.dtos.GroupStudentDTO;
import com.g6.virtualbody.entities.GrupoxEstudiante;
import com.g6.virtualbody.repositories.IGrupoxEstudianteRepository;
import com.g6.virtualbody.services.IGrupoxEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
public class GrupoxEstudianteServiceImplement implements IGrupoxEstudianteService {
    @Autowired
    private IGrupoxEstudianteRepository gxeR;
    @Override
    public void insert(GrupoxEstudiante grupoxEstudiante) {
        gxeR.save(grupoxEstudiante);
    }

    @Override
    public List<GrupoxEstudiante> list() {
        return gxeR.findAll();
    }

    @Override
    public void delete(int idGrupoxEstudiante) {
        gxeR.deleteById(idGrupoxEstudiante);
    }

    @Override
    public GrupoxEstudiante listId(int idGrupoxEstudiante) {
        return gxeR.findById(idGrupoxEstudiante).orElse(new GrupoxEstudiante());
    }

    @Override
    public List<GrupoxEstudiante> buscarFecha(LocalDate fecha) {
        return gxeR.findByfechaaceso(fecha);
    }

    @Override
    public List<GroupStudentDTO> reporte01() {
        List<String[]> studentCountByGroup = gxeR.getStudentCountByGroup();
        List<GroupStudentDTO> groupStudentDTOs = new ArrayList<>();

        for (String[] data : studentCountByGroup) {
            GroupStudentDTO dto = new GroupStudentDTO();
            dto.setStudentName(data[0]);
            dto.setGxeCount(Integer.parseInt(data[1]));
            groupStudentDTOs.add(dto);
        }

        return groupStudentDTOs;
    }


}
