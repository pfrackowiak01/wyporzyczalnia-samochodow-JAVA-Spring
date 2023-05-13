package wypozyczalnia.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wypozyczalnia.models.Samochody;
import wypozyczalnia.repositories.SamochodyRepository;

@Service
public class SamochodyService {
	
	@Autowired
	private SamochodyRepository repository;
	
	public SamochodyService() {
	super();
	}

	public <S extends Samochody> S save(S entity) {
		return repository.save(entity);
	}

	public List<Samochody> findAll() {
		return repository.findAll();
	}

	public Optional<Samochody> findById(Long id) {
		return repository.findById(id);
	}

	public void deleteById(Long id) {
		repository.deleteById(id);
	}
	
}
