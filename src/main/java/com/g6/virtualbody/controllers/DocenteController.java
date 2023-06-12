package com.g6.virtualbody.controllers;

import com.g6.virtualbody.dtos.DocenteDTO;
import com.g6.virtualbody.entities.Docente;
import com.g6.virtualbody.services.IDocenteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Docentes")
public class DocenteController {
    @Autowired
    private IDocenteService dS;
    @PostMapping
    public void insert(@RequestBody DocenteDTO dto){
        ModelMapper m=new ModelMapper();
        Docente d = m.map(dto, Docente.class);
        dS.insert(d);
    }
    @GetMapping
    public List<DocenteDTO> list(){
        return dS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,DocenteDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        dS.delete(id);
    }
    @GetMapping("/{id}")
    public DocenteDTO listId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        DocenteDTO dto = m.map(dS.ListId(id), DocenteDTO.class);
        return dto;
    }
    @PutMapping
    public void update(@RequestBody DocenteDTO dto){
        ModelMapper m = new ModelMapper();
        Docente d = m.map(dto, Docente.class);
        dS.insert(d);
    }
    @PostMapping("/buscarNombre")
    public List<DocenteDTO> searchName(@RequestBody String nombre) {
        return dS.find(nombre).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, DocenteDTO.class);
        }).collect(Collectors.toList());
    }
}