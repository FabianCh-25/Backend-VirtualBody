package com.g6.virtualbody.repositories;

import com.g6.virtualbody.entities.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstudianteRepository extends JpaRepository<Estudiante,Integer> {
    @Query("from Estudiante v where v.users.username =:username")
    Estudiante listbyUser(String username);
}
