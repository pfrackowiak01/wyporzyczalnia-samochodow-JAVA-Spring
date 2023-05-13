package wypozyczalnia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import wypozyczalnia.models.Ubezpieczenia;

@Repository
public interface UbezpieczeniaRepository extends JpaRepository<Ubezpieczenia, Long> {

}
