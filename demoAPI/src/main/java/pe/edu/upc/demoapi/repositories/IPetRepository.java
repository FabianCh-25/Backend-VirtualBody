package pe.edu.upc.demoapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demoapi.entities.Pet;

@Repository
public interface IPetRepository extends JpaRepository <Pet,Integer>{

}
