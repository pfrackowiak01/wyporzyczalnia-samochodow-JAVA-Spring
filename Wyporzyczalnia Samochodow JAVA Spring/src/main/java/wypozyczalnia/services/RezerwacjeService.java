package wypozyczalnia.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wypozyczalnia.models.Rezerwacje;
import wypozyczalnia.repositories.RezerwacjeRepository;

@Service
public class RezerwacjeService {
	
	@Autowired
	private RezerwacjeRepository repository;
	
	public RezerwacjeService() {
	super();
	}

	public <S extends Rezerwacje> S save(S entity) {
		return repository.save(entity);
	}

	public List<Rezerwacje> findAll() {
		return repository.findAll();
	}
	
	public Optional<Rezerwacje> findById(Long id) {
		return repository.findById(id);
	}

	public void deleteById(Long id) {
		repository.deleteById(id);
	}
	
}