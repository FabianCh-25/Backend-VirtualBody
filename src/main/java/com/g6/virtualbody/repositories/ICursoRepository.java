package com.g6.virtualbody.repositories;

import com.g6.virtualbody.entities.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICursoRepository extends JpaRepository<Curso,Integer> {
    @Query(value = "SELECT c.name_Curso, COUNT(e.id_estudiante) from cursos c \n" +
            "JOIN detalles_matriculas dm ON c.id_curso = dm.id_curso \n" +
            "JOIN matriculas m ON dm.id_matricula = m.id_matricula \n" +
            "JOIN estudiante e ON m.id_estudiante = e.id_estudiante \n" +
            "GROUP BY c.name_Curso ORDER BY COUNT(c.name_Curso) DESC", nativeQuery = true)
    List<String[]> getStudentsByCourse(); //Andreé
}
