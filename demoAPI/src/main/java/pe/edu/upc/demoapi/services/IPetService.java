package pe.edu.upc.demoapi.services;

import pe.edu.upc.demoapi.entities.Pet;

import java.util.List;


public interface IPetService {
    public void insert(Pet pet);
    public void delete(int idPet);
    public Pet listId(int idPet);
    List<Pet> list();
}
