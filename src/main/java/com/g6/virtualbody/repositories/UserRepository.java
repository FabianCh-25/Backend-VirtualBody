package com.g6.virtualbody.repositories;

import com.g6.virtualbody.entities.Role;
import com.g6.virtualbody.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    public Users findByUsername(String username);

    //BUSCAR POR NOMBRE
    @Query("select count(u.username) from Users u where u.username =:username")
    public int buscarUsername(@Param("username") String nombre);


    //INSERTAR ROLES
    @Transactional
    @Modifying
    @Query(value = "UPDATE Users u SET u.role = :role WHERE u.id = :userId")
    public void insRol(@Param("role") Role role, @Param("userId") Long userId);

    @Query(value = "SELECT * FROM users ORDER BY id DESC LIMIT 1", nativeQuery = true)
    public Users findFirstByOrderByIdDesc();

}