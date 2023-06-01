package com.g6.virtualbody.repositories;

import com.g6.virtualbody.entities.AulaxDocente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AxDRepository extends JpaRepository<AulaxDocente, Integer> {
}
