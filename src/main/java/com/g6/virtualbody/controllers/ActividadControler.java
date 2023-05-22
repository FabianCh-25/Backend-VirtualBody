package com.g6.virtualbody.controllers;

import com.g6.virtualbody.dtos.ActividadDTO;
import com.g6.virtualbody.entities.Actividad;
import com.g6.virtualbody.services.IActividadService;
import io.swagger.models.Model;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Actividades")
public class ActividadControler {
    @Autowired
    private IActividadService atS;

    @PostMapping
    public void insert(@RequestBody ActividadDTO atdto){
        ModelMapper m= new ModelMapper();
        Actividad at= m.map(atdto,Actividad.class);
        atS.insert(at);
    }
    @GetMapping
    public List<ActividadDTO> list(){
        return atS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,ActividadDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        atS.delete(id);
    }
    @GetMapping("/{id}")
    public ActividadDTO listId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        ActividadDTO atdto= m.map(atS.ListId(id),ActividadDTO.class);
        return  atdto;
    }
    @PutMapping
    public void update(@RequestBody ActividadDTO atdto){
        ModelMapper m = new ModelMapper();
        Actividad at= m.map(atdto,Actividad.class);
        atS.insert(at);
    }
}
