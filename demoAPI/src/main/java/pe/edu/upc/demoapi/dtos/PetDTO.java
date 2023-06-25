package pe.edu.upc.demoapi.dtos;

import java.time.LocalDate;

public class PetDTO {
    private int idPet;
    private String namePet;
    private String genderPet;
    private LocalDate birthDatePet;

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
