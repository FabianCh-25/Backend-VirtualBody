package com.g6.virtualbody.repositories;

import com.g6.virtualbody.entities.DetalleMatricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetalleMatriculaRepository extends JpaRepository<DetalleMatricula, Integer> {
}
