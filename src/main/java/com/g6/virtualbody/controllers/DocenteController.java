package com.g6.virtualbody.controllers;

import com.g6.virtualbody.dtos.DocenteDTO;
import com.g6.virtualbody.entities.Docente;
import com.g6.virtualbody.services.IDocenteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
