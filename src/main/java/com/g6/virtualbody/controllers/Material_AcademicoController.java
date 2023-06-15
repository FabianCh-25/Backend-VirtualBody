package com.g6.virtualbody.controllers;

import com.g6.virtualbody.dtos.Material_AcademicoDTO;
import com.g6.virtualbody.entities.Material_Academico;
import com.g6.virtualbody.services.IMaterial_AcademicoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping( "/materialAcademico")
public class Material_AcademicoController {
    @Autowired
    private IMaterial_AcademicoService maS;
    @PostMapping
    public void insert(@RequestBody Material_AcademicoDTO dto){
        ModelMapper m= new ModelMapper();
        Material_Academico ma=m.map(dto,Material_Academico.class);
        maS.insert(ma);
    }
    @GetMapping
    public List<Material_AcademicoDTO> list(){
        return maS.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return  m.map(x,Material_AcademicoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id) { maS.delete(id); }
    @GetMapping("/{id}")
    public Material_AcademicoDTO listId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        Material_AcademicoDTO dto = m.map(maS.listId(id), Material_AcademicoDTO.class);
        return dto;
    }
    @PutMapping
    public void update(@RequestBody Material_AcademicoDTO dto){
        ModelMapper m = new ModelMapper();
        Material_Academico mt = m.map(dto, Material_Academico.class);
        maS.insert(mt);
    }

    @GetMapping("/buscar")
    public List<Material_AcademicoDTO> searchByTitle(@RequestParam String titulomaterial) {
        List<Material_Academico> materialList = maS.findbytitulo(titulomaterial);
        return materialList.stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return  m.map(x,Material_AcademicoDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/cursos/{curso_id}")
    public List<Material_AcademicoDTO> listByCursoId(@PathVariable int curso_id){
        return maS.findByCursoId(curso_id).stream().map(x->{
            ModelMapper m= new ModelMapper();
            return  m.map(x,Material_AcademicoDTO.class);
        }).collect(Collectors.toList());
    }


}
