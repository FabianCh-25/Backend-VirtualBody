package com.g6.virtualbody.controllers;

import com.g6.virtualbody.dtos.AulaDTO;
import com.g6.virtualbody.entities.Aula;
import com.g6.virtualbody.services.IAulaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/aula")
public class AulaController {
    @Autowired
    private IAulaService aS;
    @PostMapping
    public void insert(@RequestBody AulaDTO dto){
        ModelMapper m = new ModelMapper();
        Aula a = m.map(dto, Aula.class);
        aS.insert(a);
    }
    @GetMapping
    public List<AulaDTO> listar(){
        return aS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, AulaDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){ aS.delete(id);}
    @GetMapping("/{id}")
    public AulaDTO listId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        AulaDTO dto = m.map(aS.ListId(id), AulaDTO.class);
        return  dto;
    }
    @PutMapping("/{id}")
    public void update(@RequestBody AulaDTO dto){
        ModelMapper m = new ModelMapper();
        Aula a = m.map(dto, Aula.class);
        aS.insert(a);
    }

}
