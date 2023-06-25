package pe.edu.upc.demoapi.dtos;

import pe.edu.upc.demoapi.entities.Pet;

import java.time.LocalDate;

public class VaccineDTO {
    private int idVaccine;
    private String nameVaccine;
    private LocalDate dateVaccine;
    private String ObservationVaccine;
    private Pet pet;

    public String getObservationVaccine() {
        return ObservationVaccine;
    }

    public void setObservationVaccine(String observationVaccine) {
        ObservationVaccine = observationVaccine;
    }

    public int getIdVaccine() {
        return idVaccine;
    }

    public void setIdVaccine(int idVaccine) {
        this.idVaccine = idVaccine;
    }

    public String getNameVaccine() {
        return nameVaccine;
    }

    public void setNameVaccine(String nameVaccine) {
        this.nameVaccine = nameVaccine;
    }

    public LocalDate getDateVaccine() {
        return dateVaccine;
    }

    public void setDateVaccine(LocalDate dateVaccine) {
        this.dateVaccine = dateVaccine;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
