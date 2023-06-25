package pe.edu.upc.demoapi.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demoapi.entities.Pet;
import pe.edu.upc.demoapi.repositories.IPetRepository;
import pe.edu.upc.demoapi.services.IPetService;

import java.util.List;

@Service
public class PetServiceImpl implements IPetService {
    @Autowired
    private IPetRepository pR;

    @Override
    public void insert(Pet pet) {
        pR.save(pet);
    }

    @Override
    public void delete(int idPet) {
        pR.deleteById(idPet);
    }

    @Override
    public Pet listId(int idPet) {
        return pR.findById(idPet).orElse(new Pet());
    }

    @Override
    public List<Pet> list() {
        return pR.findAll();
    }
}
