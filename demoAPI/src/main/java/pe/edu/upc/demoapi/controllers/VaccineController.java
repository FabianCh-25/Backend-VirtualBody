package pe.edu.upc.demoapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demoapi.dtos.PetVaccineDTO;
import pe.edu.upc.demoapi.dtos.VaccineDTO;
import pe.edu.upc.demoapi.entities.Vaccine;
import pe.edu.upc.demoapi.services.IVaccineService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/vaccines")
public class VaccineController {
    @Autowired
    private IVaccineService vS;

    @PostMapping
    public void registrar(@RequestBody VaccineDTO vDTO) {
        ModelMapper m = new ModelMapper();
        Vaccine v = m.map(vDTO, Vaccine.class);
        vS.insert(v);
    }

    @GetMapping
    public List<VaccineDTO> listar() {
        return vS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, VaccineDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/buscar")
    public List<VaccineDTO> buscar(@RequestBody LocalDate fecha) {
        return vS.buscarFecha(fecha).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, VaccineDTO.class);
        }).collect(Collectors.toList());

    }

    @GetMapping("/vaccine-count")
    public List<PetVaccineDTO> getPetCountByVaccine() {
        List<PetVaccineDTO> petVaccineDTOs = vS.reporte01();
        return petVaccineDTOs;
    }

}







