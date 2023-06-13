package com.g6.virtualbody.repositories;

import com.g6.virtualbody.entities.GrupoxEstudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface IGrupoxEstudianteRepository extends JpaRepository<GrupoxEstudiante, Integer> {
    @Query("from GrupoxEstudiante g where g.fechaacceso =:fecha")
    List<GrupoxEstudiante> findByfechaaceso(@Param("fecha") LocalDate fecha);}
