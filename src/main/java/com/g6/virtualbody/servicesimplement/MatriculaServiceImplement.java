package com.g6.virtualbody.servicesimplement;

import com.g6.virtualbody.entities.Matricula;
import com.g6.virtualbody.repositories.IMatriculaRepository;
import com.g6.virtualbody.services.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
