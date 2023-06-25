package pe.edu.upc.demoapi.services;

import pe.edu.upc.demoapi.dtos.PetVaccineDTO;
import pe.edu.upc.demoapi.entities.Vaccine;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;


public interface IVaccineService {
    public void insert(Vaccine vaccine);
    List<Vaccine> list();
    List<Vaccine> buscarFecha(LocalDate fecha);
    public List<PetVaccineDTO> reporte01();


}
