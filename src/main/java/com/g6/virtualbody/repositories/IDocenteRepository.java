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
    @Query("from Docente v where v.users.username =:username")
    Docente listbyUser(String username);
    @Query(value = "SELECT d.nombre, COUNT(a.id_aula) from docentes d \n" +
                "JOIN detalles_matriculas dm ON d.id_docente = dm.id_docente \n" +
                "JOIN aulas a ON dm.id_aula = a.id_aula \n" +
                "GROUP BY d.nombre ORDER BY COUNT(d.nombre) DESC", nativeQuery = true)
    List<String[]> getClassroomByTeacher(); //Andreé
}