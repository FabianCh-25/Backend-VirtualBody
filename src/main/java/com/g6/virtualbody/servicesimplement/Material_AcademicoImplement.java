package com.g6.virtualbody.servicesimplement;

import com.g6.virtualbody.entities.Material_Academico;
import com.g6.virtualbody.repositories.IMaterial_AcademicoRepository;
import com.g6.virtualbody.services.IMaterial_AcademicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Material_AcademicoImplement implements IMaterial_AcademicoService {
    @Autowired
    private IMaterial_AcademicoRepository maR;

    @Override
    public void insert(Material_Academico material_academico) {
        maR.save(material_academico);
    }
    @Override
    public List<Material_Academico> list() {
        return maR.findAll();
    }

    @Override

    public List<Material_Academico> findbytitulo(String titulomaterial){
        return maR.buscarTitulomaterial(titulomaterial);
    }

    @Override
    public List<Material_Academico> findByCursoId(int curso_id) {
        return maR.findByCursoId(curso_id);
    }
}
