package com.g6.virtualbody.repositories;

import com.g6.virtualbody.entities.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursoRepository extends JpaRepository<Curso,Integer> {
}
