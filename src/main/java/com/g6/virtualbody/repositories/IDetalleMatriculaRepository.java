package com.g6.virtualbody.repositories;

import com.g6.virtualbody.entities.DetalleMatricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IDetalleMatriculaRepository extends JpaRepository<DetalleMatricula, Integer> {
    @Query("from DetalleMatricula dm where dm.fechaInscripcion between :fechaInicio and :fechaFin")
    List<DetalleMatricula> detalleFecha(@Param("fechaInicio")LocalDate fechaInicio,
                                        @Param("fechaFin")LocalDate fechaFin);
}