package com.g6.virtualbody.controllers;

import com.g6.virtualbody.dtos.AxDDTO;
import com.g6.virtualbody.services.IAxDService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/AulaxDocente")
public class AxDController {
    @Autowired
    private IAxDService AxDS;
    @PostMapping
    public void insert(@RequestBody AxDDTO dto) {
        ModelMapper m = new ModelMapper();
        AxDDTO v = m.map(dto, AxDDTO.class);
        AxDS.insert(v);
    }
    @GetMapping
    public List<AxDDTO> list() {
        return AxDS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, AxDDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping("/buscar")
    public List<AxDDTO> search(@RequestBody LocalDate fecha) {
        return AxDS.find(fecha).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, AxDDTO.class);
        }).collect(Collectors.toList());
    }
}
