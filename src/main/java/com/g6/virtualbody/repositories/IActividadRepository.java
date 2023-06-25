package com.g6.virtualbody.repositories;

import com.g6.virtualbody.entities.Actividad;
import com.g6.virtualbody.entities.DetalleMatricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IActividadRepository extends JpaRepository<Actividad,Integer> {
    @Query(value = "SELECT a.titulo, COUNT(e.id_estudiante) FROM actividades a " +
            "JOIN EstudiantesXActividad dm ON a.id_actividad = dm.id_actividad " +
            "JOIN estudiante e ON dm.id_estudiante = e.id_estudiante " +
            "GROUP BY a.titulo ORDER BY COUNT(a.titulo) DESC", nativeQuery = true)
    List<String[]> getStudentsByActivity(); //FabianCh

}
