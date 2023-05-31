package com.g6.virtualbody.controllers;

import com.g6.virtualbody.dtos.EstudianteXActividadDTO;
import com.g6.virtualbody.entities.EstudianteXActividad;
import com.g6.virtualbody.services.IExAService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ExAs")
public class EstudianteXActividadController {
    @Autowired
    private IExAService exaS;
    @PostMapping
    public void insert(@RequestBody EstudianteXActividadDTO dtoExA) {


        ModelMapper m = new ModelMapper();
        EstudianteXActividad exa = m.map(dtoExA, EstudianteXActividad.class);
        exaS.insert(exa);
    }

    @GetMapping
    public List<EstudianteXActividadDTO> list() {
        return exaS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, EstudianteXActividadDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        exaS.delete(id);

    }
    @GetMapping("/{id}")
    public EstudianteXActividadDTO listID(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        EstudianteXActividadDTO exadto=m.map(exaS.ListID(id),EstudianteXActividadDTO.class);
        return exadto;
    }
    @PutMapping
    public void update(@RequestBody EstudianteXActividadDTO exadto) {


        ModelMapper m = new ModelMapper();
        EstudianteXActividad p = m.map(exadto, EstudianteXActividad.class);
        exaS.insert(p);
    }
}
