package com.g6.virtualbody.repositories;

import com.g6.virtualbody.entities.Actividad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IActividadRepository extends JpaRepository<Actividad,Integer> {
}
