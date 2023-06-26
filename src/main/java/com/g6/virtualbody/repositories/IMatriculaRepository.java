package com.g6.virtualbody.repositories;

import com.g6.virtualbody.entities.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMatriculaRepository extends JpaRepository<Matricula, Integer> {

    @Query(value = "    SELECT e.nombre_estudiante, e.apellido_estudiante\n \n" +
            "    FROM estudiante e\n \n" +
            "    JOIN matriculas m ON e.id_estudiante = m.id_estudiante\n \n " +
            "    WHERE m.costo_matricula < 1000\n", nativeQuery = true)
    List<String[]> getCostbyCount();


}
