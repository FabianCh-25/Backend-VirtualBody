package com.g6.virtualbody.repositories;

import com.g6.virtualbody.entities.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDocenteRepository extends JpaRepository<Docente, Integer> {
    @Query("from Docente d where d.nombre=:nombre")
    List<Docente> buscarNombre(@Param("nombre")String nombre);
}