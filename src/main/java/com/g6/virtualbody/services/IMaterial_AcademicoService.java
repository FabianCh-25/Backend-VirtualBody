package com.g6.virtualbody.services;

import com.g6.virtualbody.entities.Material_Academico;

import java.util.List;

public interface IMaterial_AcademicoService {

    public void insert(Material_Academico material_academico);

    List<Material_Academico> list();

    public void delete(int idMaterialacademico);

    public Material_Academico listId(int idMaterialacademico);

    List<Material_Academico> findbytitulo(String titulomaterial);

    List<Material_Academico> findByCursoId(int curso_id);
}
