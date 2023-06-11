package com.g6.virtualbody.servicesimplement;

import com.g6.virtualbody.entities.Grupo;
import com.g6.virtualbody.repositories.IGrupoRepository;
import com.g6.virtualbody.services.IGrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


}
