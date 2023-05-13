package wypozyczalnia.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wypozyczalnia.models.Wypozyczenia;
import wypozyczalnia.repositories.WypozyczeniaRepository;

@Service
public class WypozyczeniaService {
	
	@Autowired
	private WypozyczeniaRepository repository;
	
	public WypozyczeniaService() {
	super();
	}

	public <S extends Wypozyczenia> S save(S entity) {
		return repository.save(entity);
	}

	public List<Wypozyczenia> findAll() {
		return repository.findAll();
	}

	public Optional<Wypozyczenia> findById(Long id) {
		return repository.findById(id);
	}

	public void deleteById(Long id) {
		repository.deleteById(id);
	}
	
}