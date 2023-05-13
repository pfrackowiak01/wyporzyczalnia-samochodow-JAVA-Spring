package wypozyczalnia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import wypozyczalnia.models.Rezerwacje;

@Repository
public interface RezerwacjeRepository extends JpaRepository<Rezerwacje, Long> {

}
