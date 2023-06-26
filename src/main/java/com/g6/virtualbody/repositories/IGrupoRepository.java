package com.g6.virtualbody.repositories;

import com.g6.virtualbody.entities.Grupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IGrupoRepository extends JpaRepository<Grupo,Integer> {
    @Query(value = "SELECT g.id_grupo, g.nombre_grupo, COUNT(e.id_estudiante) AS cantidad_estudiantes \n" +
            "FROM grupo g \n" +
            "JOIN gruposx_estudiantes ge ON g.id_grupo = ge.grupo \n " +
            "JOIN estudiante e ON ge.estudiante = e.id_estudiante \n" +
            "GROUP BY g.id_grupo, g.nombre_grupo \n" +
            "ORDER BY g.id_grupo ASC ", nativeQuery = true)
    List<String[]> getStudentCountByGroup();
}
