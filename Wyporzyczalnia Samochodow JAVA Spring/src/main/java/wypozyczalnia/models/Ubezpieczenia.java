package wypozyczalnia.models;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;

@Entity
public class Ubezpieczenia {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_ubezpieczenia;
	
	@NotNull
	private String nazwa;
	
	@NotNull
	private Date data_wygasniecia;
	
	@OneToMany(mappedBy="id_ubezpieczenia")
	private List<Ubezpieczenia> ubezpieczenia;

	public Ubezpieczenia() {
		super();
	}

	public Long getId_ubezpieczenia() {
		return id_ubezpieczenia;
	}

	public void setId_ubezpieczenia(Long id_ubezpieczenia) {
		this.id_ubezpieczenia = id_ubezpieczenia;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public Date getData_wygasniecia() {
		return data_wygasniecia;
	}

	public void setData_wygasniecia(Date data_wygasniecia) {
		this.data_wygasniecia = data_wygasniecia;
	}

	public List<Ubezpieczenia> getUbezpieczenia() {
		return ubezpieczenia;
	}

	public void setUbezpieczenia(List<Ubezpieczenia> ubezpieczenia) {
		this.ubezpieczenia = ubezpieczenia;
	}
	
}
