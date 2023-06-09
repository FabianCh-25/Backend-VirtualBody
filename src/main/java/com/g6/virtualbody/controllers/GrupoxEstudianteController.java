package com.g6.virtualbody.controllers;

import com.g6.virtualbody.dtos.DetalleMatriculaDTO;
import com.g6.virtualbody.dtos.GroupStudentDTO;
import com.g6.virtualbody.dtos.GrupoxEstudianteDTO;
import com.g6.virtualbody.entities.DetalleMatricula;
import com.g6.virtualbody.entities.GrupoxEstudiante;
import com.g6.virtualbody.services.IGrupoxEstudianteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/gruposxEstudiantes")
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

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id) { gxeS.delete(id);}
    @GetMapping("/{id}")
    public GrupoxEstudianteDTO listId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        GrupoxEstudianteDTO dto = m.map(gxeS.listId(id), GrupoxEstudianteDTO.class);
        return dto;
    }
    @PutMapping
    public void update(@RequestBody GrupoxEstudianteDTO dto){
        ModelMapper m = new ModelMapper();
        GrupoxEstudiante gp = m.map(dto, GrupoxEstudiante.class);
        gxeS.insert(gp);
    }

    @PostMapping("/buscar")
    public List<GrupoxEstudianteDTO> buscar(@RequestBody LocalDate fecha) {
        return gxeS.buscarFecha(fecha).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, GrupoxEstudianteDTO.class);
        }).collect(Collectors.toList());

    }
    @GetMapping("/student-count")
    public List<GroupStudentDTO> getStudentCountByGroup() {
        List<GroupStudentDTO> groupStudentDTOs = gxeS.reporte01();
        return groupStudentDTOs;
    }


}
