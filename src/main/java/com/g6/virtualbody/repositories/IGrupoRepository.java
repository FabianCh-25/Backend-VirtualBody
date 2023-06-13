package com.g6.virtualbody.repositories;

import com.g6.virtualbody.entities.Grupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGrupoRepository extends JpaRepository<Grupo,Integer> {
}
