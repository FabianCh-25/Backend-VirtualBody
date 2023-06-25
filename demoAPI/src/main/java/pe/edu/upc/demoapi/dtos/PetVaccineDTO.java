package pe.edu.upc.demoapi.dtos;

public class PetVaccineDTO {
        private String vaccineName;
        private int dogCount;

        // Constructor, getters y setters

    public PetVaccineDTO(String vaccineName, int dogCount) {
        this.vaccineName = vaccineName;
        this.dogCount = dogCount;
    }

    public PetVaccineDTO() {
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public int getDogCount() {
        return dogCount;
    }

    public void setDogCount(int dogCount) {
        this.dogCount = dogCount;
    }
}
