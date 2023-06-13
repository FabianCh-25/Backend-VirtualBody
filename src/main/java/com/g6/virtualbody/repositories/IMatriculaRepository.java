package com.g6.virtualbody.repositories;

import com.g6.virtualbody.entities.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMatriculaRepository extends JpaRepository<Matricula, Integer> {
}
