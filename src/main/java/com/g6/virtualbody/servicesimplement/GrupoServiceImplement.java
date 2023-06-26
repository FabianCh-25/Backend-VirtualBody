package com.g6.virtualbody.servicesimplement;

import com.g6.virtualbody.entities.Grupo;
import com.g6.virtualbody.dtos.GroupStudentDTO;
import com.g6.virtualbody.repositories.IGrupoRepository;
import com.g6.virtualbody.services.IGrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GrupoServiceImplement implements IGrupoService {
    @Autowired
    private IGrupoRepository gR;

    @Override
    public void insert(Grupo grupo) {
        gR.save(grupo);
    }

    @Override
    public List<Grupo> list() {
        return gR.findAll();
    }

    @Override
    public void delete(int idGrupo) {
        gR.deleteById(idGrupo);
    }

    @Override
    public Grupo listId(int idGrupo) {
        return gR.findById(idGrupo).orElse(new Grupo());
    }

    @Override
    public List<GroupStudentDTO> report03() {

        List<String[]> studentCountByGroup = gR.getStudentCountByGroup();
        List<GroupStudentDTO> groupStudentDTOs = new ArrayList<>();

        for (String[] data : studentCountByGroup) {
            GroupStudentDTO dto = new GroupStudentDTO();
            //dto.setId(Integer.parseInt(data[0])); // ID del grupo
            dto.setStudentName(data[0]); // Nombre del grupo
            dto.setGxeCount(Integer.parseInt(data[1])); // Cantidad de estudiantes
            groupStudentDTOs.add(dto);
        }
return groupStudentDTOs;
    }

}
