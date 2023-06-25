package pe.edu.upc.demoapi.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="vaccines")
public class Vaccine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVaccine;
    @Column(name = "nameVaccine",length = 40,nullable = false)
    private String nameVaccine;
    @Column(name = "dateVaccine",nullable = false)
    //@JsonSerialize(using = ToStringSerializer.class)
    private LocalDate dateVaccine;
    @Column(name = "ObservationVaccine",nullable = false,length = 300)
    private String ObservationVaccine;
    @ManyToOne
    @JoinColumn(name = "idPet",nullable = false)
    private Pet pet;

    public Vaccine() {
    }
    public Vaccine(int idVaccine, String nameVaccine, LocalDate dateVaccine, String observationVaccine, Pet pet) {
        this.idVaccine = idVaccine;
        this.nameVaccine = nameVaccine;
        this.dateVaccine = dateVaccine;
        ObservationVaccine = observationVaccine;
        this.pet = pet;
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

    public String getObservationVaccine() {
        return ObservationVaccine;
    }

    public void setObservationVaccine(String observationVaccine) {
        ObservationVaccine = observationVaccine;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
