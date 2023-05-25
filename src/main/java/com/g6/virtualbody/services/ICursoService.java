package com.g6.virtualbody.services;

import com.g6.virtualbody.entities.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICursoService  {
    public void insert(Curso curso);
    List <Curso> LIST();
}
