package com.g6.virtualbody.servicesimplement;

import com.g6.virtualbody.entities.Curso;
import com.g6.virtualbody.repositories.ICursoRepository;
import com.g6.virtualbody.services.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImplement implements ICursoService {

    @Autowired

    private ICursoRepository cR;

    @Override
    public void insert(Curso curso){
        cR.save(curso);
    }

    @Override
    public List<Curso> LIST() {
        return cR.findAll();
    }

    @Override
    public void delete(int idCurso){
        cR.deleteById(idCurso);
    }
    @Override
    public Curso listId(int idCurso){
        return cR.findById(idCurso).orElse(new Curso());

    }
}
