package pe.edu.upc.demoapi.entities;




import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "pets")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPet;
    @Column(name = "namePet",length = 35,nullable = false)
    private String namePet;
    @Column(name = "genderPet",length = 12, nullable = false)
    private String genderPet;
    @Column(name = "birthDatePet", nullable = false)
    private LocalDate birthDatePet;

    public Pet() {
    }

    public Pet(int idPet, String namePet, String genderPet, LocalDate birthDatePet) {
        this.idPet = idPet;
        this.namePet = namePet;
        this.genderPet = genderPet;
        this.birthDatePet = birthDatePet;
    }

    public int getIdPet() {
        return idPet;
    }

    public void setIdPet(int idPet) {
        this.idPet = idPet;
    }

    public String getNamePet() {
        return namePet;
    }

    public void setNamePet(String namePet) {
        this.namePet = namePet;
    }

    public String getGenderPet() {
        return genderPet;
    }

    public void setGenderPet(String genderPet) {
        this.genderPet = genderPet;
    }

    public LocalDate getBirthDatePet() {
        return birthDatePet;
    }

    public void setBirthDatePet(LocalDate birthDatePet) {
        this.birthDatePet = birthDatePet;
    }
}
