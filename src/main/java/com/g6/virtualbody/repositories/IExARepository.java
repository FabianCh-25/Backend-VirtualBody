package com.g6.virtualbody.repositories;

import com.g6.virtualbody.entities.EstudianteXActividad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IExARepository extends JpaRepository<EstudianteXActividad,Integer> {
    @Query("SELECT exa FROM EstudianteXActividad exa WHERE exa.calificacion > 12")
    List<EstudianteXActividad> report04();
//FabianCh
}