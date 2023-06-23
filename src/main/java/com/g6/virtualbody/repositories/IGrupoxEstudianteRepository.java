package com.g6.virtualbody.repositories;

import com.g6.virtualbody.entities.GrupoxEstudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
@Repository
public interface IGrupoxEstudianteRepository extends JpaRepository<GrupoxEstudiante, Integer> {
    @Query("from GrupoxEstudiante g where g.fechaacceso =:fecha")
    List<GrupoxEstudiante> findByfechaaceso(@Param("fecha") LocalDate fecha);

    @Query(value = "SELECT g.id_grupo, g.nombre_grupo, COUNT(e.id_estudiante) AS cantidad_estudiantes\n \n" +
            "FROM grupo g \n" +
            "JOIN gruposx_estudiantes ge ON g.id_grupo = ge.grupo \n " +
            "JOIN estudiante e ON ge.estudiante = e.id_estudiante \n" +
            "GROUP BY g.id_grupo, g.nombre_grupo \n" +
            "ORDER BY g.id_grupo ASC \n", nativeQuery = true)
    List<String[]> getStudentCountByGroup();

/* CANTIDAD DE ETUDIANTES QUE HAY POR GRUPO

SELECT g.id_grupo, g.nombre_grupo, COUNT(e.id_estudiante) AS cantidad_estudiantes
FROM grupo g
JOIN gruposx_estudiantes ge ON g.id_grupo = ge.grupo
JOIN estudiante e ON ge.estudiante = e.id_estudiante
GROUP BY g.id_grupo, g.nombre_grupo
ORDER BY g.id_grupo ASC
*/

/* CANTIDAD DE GRUPOS POR ESTUDIANTE

SELECT e.id_estudiante, e.nombre_estudiante, COUNT(g.id_grupo) AS cantidad_grupos
FROM estudiante e
JOIN gruposx_estudiantes ge ON e.id_estudiante = ge.estudiante
JOIN grupo g ON ge.grupo = g.id_grupo
GROUP BY e.id_estudiante, e.nombre_estudiante
ORDER BY e.id_estudiante ASC
*/

/* PARA MOSTRAR EL MENOR O EL MAYOR

ORDER BY cantidad_grupos ASC
LIMIT 1;
*/

}
