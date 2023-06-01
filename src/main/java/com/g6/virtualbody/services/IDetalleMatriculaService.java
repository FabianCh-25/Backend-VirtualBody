package com.g6.virtualbody.services;

import com.g6.virtualbody.entities.DetalleMatricula;

import java.util.List;

public interface IDetalleMatriculaService {
    public void insert(DetalleMatricula detalleMatricula);
    List<DetalleMatricula> list();
    public void delete(int idDetalleMatricula);
    public DetalleMatricula listId(int idDetalleMatricula);
}
