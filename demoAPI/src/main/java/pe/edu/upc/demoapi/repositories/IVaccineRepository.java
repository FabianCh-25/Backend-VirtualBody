package pe.edu.upc.demoapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demoapi.entities.Vaccine;


import java.time.LocalDate;
import java.util.List;

@Repository
public interface IVaccineRepository extends JpaRepository<Vaccine, Integer> {
    @Query("from Vaccine v where v.dateVaccine =:fecha")
    List<Vaccine> findBydateVaccine(@Param("fecha") LocalDate fecha);
  /*  @Query(value = "SELECT v.name_vaccine,count(p.id_pet) from public.Vaccine v "
            + "join Pet p  on  v.id_pet = p.id_pet join"
            + "group by v.name_vaccine ORDER BY COUNT(v.name_vaccine) DESC limit 1", nativeQuery = true)
    public List<String[]> vaccinePet();*/
  @Query(value = "SELECT v.name_vaccine,count(p.id_pet) from vaccines v \n" +
          "join pets p on  v.id_pet = p.id_pet \n" +
          "group by v.name_vaccine ORDER BY COUNT(v.name_vaccine) DESC", nativeQuery = true)
  List<String[]> getPetCountByVaccine();

}
