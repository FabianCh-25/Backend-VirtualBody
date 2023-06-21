package com.g6.virtualbody.services;

import com.g6.virtualbody.dtos.EstudianteDTO;
import com.g6.virtualbody.dtos.StudentCourseDTO;
import com.g6.virtualbody.entities.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICursoService  {
    public void insert(Curso curso);
    List <Curso> LIST();

    public void delete(int idCurso);

    public Curso listId(int idCurso);

    public List<StudentCourseDTO> report01();
}
