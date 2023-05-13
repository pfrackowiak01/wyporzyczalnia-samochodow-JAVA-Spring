package wypozyczalnia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import wypozyczalnia.models.Wypozyczenia;

@Repository
public interface WypozyczeniaRepository extends JpaRepository<Wypozyczenia, Long> {

}
