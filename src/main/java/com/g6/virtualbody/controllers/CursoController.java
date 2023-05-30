package com.g6.virtualbody.controllers;

import com.g6.virtualbody.dtos.CursoDTO;
import com.g6.virtualbody.entities.Curso;
import com.g6.virtualbody.services.ICursoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private ICursoService cs;
    @PostMapping
    public void insert(@RequestBody CursoDTO dto){
        ModelMapper m=new ModelMapper();
        Curso c=m.map(dto, Curso.class);
        cs.insert(c);
    }
    @GetMapping

    public List<CursoDTO> list(){
        return cs.LIST().stream().map(x -> {
            ModelMapper m=new ModelMapper();
            return m.map(x,CursoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        cs.delete(id);
    }
    @GetMapping("/{id}")
    public CursoDTO listId(@PathVariable("id")Integer id){
        ModelMapper m= new ModelMapper();
        CursoDTO dto=m.map(cs.listId(id),CursoDTO.class);
        return dto;
    }
    @PutMapping
    public void update(@RequestBody CursoDTO dto){
        ModelMapper m= new ModelMapper();
        Curso c=m.map(dto,Curso.class);
        cs.insert(c);
    }


}