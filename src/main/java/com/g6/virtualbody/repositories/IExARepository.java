package com.g6.virtualbody.repositories;

import com.g6.virtualbody.entities.EstudianteXActividad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExARepository extends JpaRepository<EstudianteXActividad,Integer> {
}
