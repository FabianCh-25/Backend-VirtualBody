package com.g6.virtualbody.repositories;

import com.g6.virtualbody.entities.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDocenteRepository extends JpaRepository<Docente, Integer> {
}
