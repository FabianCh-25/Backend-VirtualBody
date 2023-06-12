package com.g6.virtualbody.controllers;

import com.g6.virtualbody.dtos.DetalleMatriculaDTO;
import com.g6.virtualbody.entities.DetalleMatricula;
import com.g6.virtualbody.services.IDetalleMatriculaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/detallesMatriculas")
public class DetalleMatriculaController {
    @Autowired
    private IDetalleMatriculaService mS;
    @PostMapping
    public void insert(@RequestBody DetalleMatriculaDTO dto){
        ModelMapper m = new ModelMapper();
        DetalleMatricula dm = m.map(dto, DetalleMatricula.class);
        mS.insert(dm);
    }
    @GetMapping
    public List<DetalleMatriculaDTO> list(){
        return mS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x,DetalleMatriculaDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id) { mS.delete(id);}
    @GetMapping("/{id}")
    public DetalleMatriculaDTO listId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        DetalleMatriculaDTO dto = m.map(mS.listId(id), DetalleMatriculaDTO.class);
        return dto;
    }
    @PutMapping("/{id}")
    public void update(@RequestBody DetalleMatriculaDTO dto){
        ModelMapper m = new ModelMapper();
        DetalleMatricula dm = m.map(dto, DetalleMatricula.class);
        mS.insert(dm);
    }
    @PostMapping("/buscarEntreFechas")
    public List<DetalleMatriculaDTO> searchDate(@RequestBody Map<String, LocalDate> fechas){
        LocalDate fechaInicio = fechas.get("fechaInicio");
        LocalDate fechaFin = fechas.get("fechaFin");
        return mS.findDate(fechaInicio,fechaFin).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, DetalleMatriculaDTO.class);
        }).collect(Collectors.toList());
    }
}
