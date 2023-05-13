package wypozyczalnia.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Klienci {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_klienta;
	
	@NotNull
	//@Size(min=2, message="Imie musi mieć co najmniej 2 znaki!")
	private String imie;
	
	@NotNull
	//@Size(min=2, message="Nazwisko musi mieć co najmniej 2 znaki!")
	private String nazwisko;
	
	@NotNull
	//@Size(min=6, message="Email musi mieć co najmniej 6 znaków!")
	private String email;
	
	@NotNull
	//@Size(min=9, message="Nr telefonu musi mieć co najmniej 9 znaków!")
	private Integer telefon;
	
	@OneToMany(mappedBy="id_klienta")
	private List<Klienci> klienci;

	
	public Klienci() {
		super();
	}

	public Long getId_klienta() {
		return id_klienta;
	}

	public void setId_klienta(Long id_klienta) {
		this.id_klienta = id_klienta;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTelefon() {
		return telefon;
	}

	public void setTelefon(Integer telefon) {
		this.telefon = telefon;
	}

}
