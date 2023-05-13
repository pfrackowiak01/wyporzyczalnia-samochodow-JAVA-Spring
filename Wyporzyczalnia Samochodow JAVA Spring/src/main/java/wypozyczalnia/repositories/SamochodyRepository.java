package wypozyczalnia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import wypozyczalnia.models.Samochody;

@Repository
public interface SamochodyRepository extends JpaRepository<Samochody, Long> {

}
