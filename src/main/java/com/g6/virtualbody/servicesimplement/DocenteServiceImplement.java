package com.g6.virtualbody.servicesimplement;

import com.g6.virtualbody.dtos.ClassroomTeacherDTO;
import com.g6.virtualbody.entities.Docente;
import com.g6.virtualbody.repositories.IDocenteRepository;
import com.g6.virtualbody.services.IDocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DocenteServiceImplement implements IDocenteService {
    @Autowired
    private IDocenteRepository dR;
    @Override
    public void insert(Docente docente) {
        dR.save(docente);
    }

    @Override
    public List<Docente> list() {
        return dR.findAll();
    }

    @Override
    public void delete(int idDocente) {
        dR.deleteById(idDocente);
    }

    @Override
    public Docente ListId(int idDocente) {
        return dR.findById(idDocente).orElse(new Docente());
    }

    @Override
    public Docente listbyUser(String username) {
        return dR.listbyUser(username);
    }

    @Override
    public List<Docente> find(String nombre) {
        return dR.buscarNombre(nombre);    }

    @Override
    public List<ClassroomTeacherDTO> report02() {
        List<String[]> classCountByTeacher = dR.getClassroomByTeacher();
        List<ClassroomTeacherDTO> classroomTeacherDTOs = new ArrayList<>();

        for(String[] data: classCountByTeacher){
            ClassroomTeacherDTO dto = new ClassroomTeacherDTO();
            dto.setTeacherName(data[0]);
            dto.setClassCount(Integer.parseInt(data[1]));
            classroomTeacherDTOs.add(dto);
        }
        return classroomTeacherDTOs; //aquí
    }
}
