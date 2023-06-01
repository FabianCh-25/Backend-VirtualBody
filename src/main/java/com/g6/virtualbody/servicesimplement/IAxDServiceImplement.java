package com.g6.virtualbody.servicesimplement;

import com.g6.virtualbody.entities.AulaxDocente;
import com.g6.virtualbody.repositories.AxDRepository;
import com.g6.virtualbody.services.IAxDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class IAxDServiceImplement implements IAxDService {
    @Autowired
    private AxDRepository AxDr;
    @Override
    public void insert(@RequestBody, AxD) {
        AxDr.save(AulaxDocente);
    }

    @Override
    public List<AulaxDocente> list() {
        return AxDr.findAll();
    }

    @Override
    public List<AulaxDocente> find(String nombre) {
        return AxDr;
    }
}
