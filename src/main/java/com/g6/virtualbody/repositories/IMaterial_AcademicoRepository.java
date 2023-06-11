package com.g6.virtualbody.repositories;

import com.g6.virtualbody.entities.Material_Academico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMaterial_AcademicoRepository extends JpaRepository<Material_Academico,Integer> {
// crear una consulta que devuelva todos los materiales académicos cuyo título contenga una determinada cadena
    @Query("SELECT m FROM Material_Academico m WHERE m.titulomaterial LIKE %:term%")
    List<Material_Academico> buscarTitulomaterial(@Param("term") String term);

    //obtener todos los materiales académicos para un curso específico
    @Query("SELECT ma FROM Material_Academico ma JOIN ma.curso c WHERE c.idCurso = :curso_id")
    List<Material_Academico> findByCursoId(@Param("curso_id") int curso_id);
}
