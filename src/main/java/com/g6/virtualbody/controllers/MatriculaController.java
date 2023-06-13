package com.g6.virtualbody.controllers;

import com.g6.virtualbody.dtos.MatriculaDTO;
import com.g6.virtualbody.entities.Matricula;
import com.g6.virtualbody.services.IMatriculaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Matriculas")
public class MatriculaController {
    @Autowired
    private IMatriculaService maS;
    @PostMapping
    public void insert(@RequestBody MatriculaDTO dto){
        ModelMapper m = new ModelMapper();
        Matricula ma = m.map(dto, Matricula.class);
        maS.insert(ma);
    }
    @GetMapping
    public List<MatriculaDTO> list(){
        return maS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, MatriculaDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id) { maS.delete(id); }
    @GetMapping("/{id}")
    public MatriculaDTO listId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        MatriculaDTO dto = m.map(maS.listId(id), MatriculaDTO.class);
        return dto;
    }
    @PutMapping("/{id}")
    public void update(@RequestBody MatriculaDTO dto){
        ModelMapper m = new ModelMapper();
        Matricula ma = m.map(dto, Matricula.class);
        maS.insert(ma);
    }
}
