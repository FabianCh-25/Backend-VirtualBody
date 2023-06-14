package com.g6.virtualbody.controllers;

import com.g6.virtualbody.dtos.GrupoxEstudianteDTO;
import com.g6.virtualbody.entities.GrupoxEstudiante;
import com.g6.virtualbody.services.IGrupoxEstudianteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/gruposxestudiante")
public class GrupoxEstudianteController {
@Autowired
    private IGrupoxEstudianteService gxeS;
    @PostMapping
    public void registrar(@RequestBody GrupoxEstudianteDTO gxeDTO) {
        ModelMapper m = new ModelMapper();
        GrupoxEstudiante gxe = m.map(gxeDTO, GrupoxEstudiante.class);
        gxeS.insert(gxe);
    }

    @GetMapping
    public List<GrupoxEstudianteDTO> listar() {
        return gxeS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, GrupoxEstudianteDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/buscar")
    public List<GrupoxEstudianteDTO> buscar(@RequestBody LocalDate fecha) {
        return gxeS.buscarFecha(fecha).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, GrupoxEstudianteDTO.class);
        }).collect(Collectors.toList());

    }

}
