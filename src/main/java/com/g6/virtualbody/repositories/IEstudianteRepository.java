package com.g6.virtualbody.repositories;

import com.g6.virtualbody.entities.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface IEstudianteRepository extends JpaRepository<Estudiante,Integer> {
}
