package com.g6.virtualbody.servicesimplement;

import com.g6.virtualbody.entities.Aula;
import com.g6.virtualbody.repositories.IAulaRepository;
import com.g6.virtualbody.services.IAulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AulaServiceImplement implements IAulaService {
    @Autowired
    private IAulaRepository aR;

    @Override
    public void insert(Aula aula) {
        aR.save(aula);
    }

    @Override
    public List<Aula> list() {
        return aR.findAll();
    }

    @Override
    public void delete(int idAula) {
        aR.deleteById(idAula);
    }

    @Override
    public Aula ListId(int idAula) {
        return aR.findById(idAula).orElse(new Aula());
    }


}
