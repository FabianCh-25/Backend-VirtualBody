package com.g6.virtualbody.repositories;

import com.g6.virtualbody.entities.Aula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAulaRepository extends JpaRepository<Aula,Integer> {
}
