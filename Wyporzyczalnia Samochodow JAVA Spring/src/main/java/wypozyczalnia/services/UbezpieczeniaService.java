package wypozyczalnia.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wypozyczalnia.models.Ubezpieczenia;
import wypozyczalnia.repositories.UbezpieczeniaRepository;

@Service
public class UbezpieczeniaService {
	
	@Autowired
	private UbezpieczeniaRepository repository;
	
	public UbezpieczeniaService() {
	super();
	}

	public <S extends Ubezpieczenia> S save(S entity) {
		return repository.save(entity);
	}

	public List<Ubezpieczenia> findAll() {
		return repository.findAll();
	}

	public Optional<Ubezpieczenia> findById(Long id) {
		return repository.findById(id);
	}

	public void deleteById(Long id) {
		repository.deleteById(id);
	}
	
}
