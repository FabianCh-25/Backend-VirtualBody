package com.g6.virtualbody.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.g6.virtualbody.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}