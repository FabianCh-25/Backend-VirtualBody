package com.g6.virtualbody.servicesimplement;

import com.g6.virtualbody.entities.DetalleMatricula;
import com.g6.virtualbody.repositories.IDetalleMatriculaRepository;
import com.g6.virtualbody.services.IDetalleMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class DetalleMatriculaServiceImplement implements IDetalleMatriculaService {
    @Autowired
    private IDetalleMatriculaRepository mR;

    @Override
    public void insert(DetalleMatricula detalleMatricula) {
        mR.save(detalleMatricula);
    }

    @Override
    public List<DetalleMatricula> list() {
        return mR.findAll();
    }

    @Override
    public void delete(int idDetalleMatricula) {
        mR.deleteById(idDetalleMatricula);
    }

    @Override
    public DetalleMatricula listId(int idDetalleMatricula) {
        return mR.findById(idDetalleMatricula).orElse(new DetalleMatricula());
    }

    @Override
    public List<DetalleMatricula> findDate(LocalDate fechaInicio, LocalDate fechaFin) {
        return mR.detalleFecha(fechaInicio,fechaFin);
    }
}
