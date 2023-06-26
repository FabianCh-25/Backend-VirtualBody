package com.g6.virtualbody.servicesimplement;

import com.g6.virtualbody.dtos.CostDTO;
import com.g6.virtualbody.dtos.GroupStudentDTO;
import com.g6.virtualbody.entities.Matricula;
import com.g6.virtualbody.repositories.IMatriculaRepository;
import com.g6.virtualbody.services.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MatriculaServiceImplement implements IMatriculaService {
    @Autowired
    private IMatriculaRepository maR;

    @Override
    public void insert(Matricula matricula) {
        maR.save(matricula);
    }

    @Override
    public List<Matricula> list() {
        return maR.findAll();
    }

    @Override
    public void delete(int idMatricula) {
        maR.deleteById(idMatricula);
    }

    @Override
    public Matricula listId(int idMatricula) {
        return maR.findById(idMatricula).orElse(new Matricula());
    }


    @Override
    public List<CostDTO> report04() {

        List<String[]> costbyCount = maR.getCostbyCount();
        List<CostDTO> costDTOs = new ArrayList<>();

        for (String[] data : costbyCount) {
            CostDTO dto = new CostDTO();
            dto.setName(data[0]); // Nombre del estudiante
            dto.setLastname(data[1]); // Apellido del estudiante
            costDTOs.add(dto);
        }
        return costDTOs;
    }

}
