package com.g6.virtualbody.servicesimplement;

import com.g6.virtualbody.dtos.EstudianteXActividadDTO;
import com.g6.virtualbody.entities.EstudianteXActividad;
import com.g6.virtualbody.repositories.IExARepository;
import com.g6.virtualbody.services.IExAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExAServiceImplement implements IExAService {
    @Autowired
    private IExARepository exaR;

    @Override
    public void insert(EstudianteXActividad exa) {
        exaR.save(exa);   }

    @Override
    public List<EstudianteXActividad> list() {
        return exaR.findAll();
    }

    @Override
    public void delete(int idexa) {
        exaR.deleteById(idexa);
    }

    @Override
    public EstudianteXActividad ListID(int idexa) {
        return exaR.findById(idexa).orElse(new EstudianteXActividad());
    }

    @Override
    public List<EstudianteXActividad> report04() {
        return exaR.report04();
    }


}
