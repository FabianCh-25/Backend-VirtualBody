package com.g6.virtualbody.controllers;

import com.g6.virtualbody.dtos.GrupoDTO;
import com.g6.virtualbody.entities.Grupo;
import com.g6.virtualbody.services.IGrupoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/grupo")
public class GrupoController {

    @Autowired
    private IGrupoService gS;

    @PostMapping
    public void insert(@RequestBody GrupoDTO dto) {
        ModelMapper m = new ModelMapper();
        Grupo g = m.map(dto, Grupo.class);
        gS.insert(g);
    }

    @GetMapping
    public List<GrupoDTO> list() {
        return gS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, GrupoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        gS.delete(id);
    }


    @GetMapping("/{id}")
    public GrupoDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        GrupoDTO dto = m.map(gS.listId(id), GrupoDTO.class);
        return dto;
    }

    @PutMapping
    public void update(@RequestBody GrupoDTO dto) {
        ModelMapper m = new ModelMapper();
        Grupo g = m.map(dto, Grupo.class);
        gS.insert(g);
    }
}
