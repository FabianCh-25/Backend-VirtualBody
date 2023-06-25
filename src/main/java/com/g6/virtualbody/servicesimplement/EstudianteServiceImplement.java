package com.g6.virtualbody.servicesimplement;

import com.g6.virtualbody.entities.Estudiante;
import com.g6.virtualbody.repositories.IEstudianteRepository;
import com.g6.virtualbody.services.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstudianteServiceImplement implements IEstudianteService {
    @Autowired
    private IEstudianteRepository eR;

    @Override
    public void insert(Estudiante estudiante) {
        eR.save(estudiante);
    }

    @Override
    public List<Estudiante> list() {
        return eR.findAll();
    }

    @Override
    public void delete(int idEstudiante) {
        eR.deleteById(idEstudiante);
    }

    @Override
    public Estudiante listId(int idEstudiante) {
        return  eR.findById(idEstudiante).orElse(new Estudiante());
    }

    @Override
    public Estudiante listbyUser(String username) {
        return eR.listbyUser(username);
    }
}
