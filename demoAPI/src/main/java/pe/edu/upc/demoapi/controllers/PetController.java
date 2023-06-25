package pe.edu.upc.demoapi.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demoapi.dtos.PetDTO;
import pe.edu.upc.demoapi.entities.Pet;
import pe.edu.upc.demoapi.services.IPetService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pets")
public class PetController {
    @Autowired
    private IPetService pS;

    @PostMapping
    public void registrar(@RequestBody PetDTO pDTO) {
        ModelMapper m = new ModelMapper();
        Pet p = m.map(pDTO, Pet.class);
        pS.insert(p);
    }

    @GetMapping
    public List<PetDTO> listar() {
        return pS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PetDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void update(@RequestBody PetDTO dto) {
        ModelMapper m = new ModelMapper();
        Pet p = m.map(dto, Pet.class);
        pS.insert(p);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        pS.delete(id);
    }

    @GetMapping("/{id}")
    public PetDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        PetDTO dto = m.map(pS.listId(id), PetDTO.class);
        return dto;
    }

}
