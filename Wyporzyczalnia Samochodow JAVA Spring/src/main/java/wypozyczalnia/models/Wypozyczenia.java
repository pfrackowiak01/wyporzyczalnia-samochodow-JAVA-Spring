package wypozyczalnia.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;

@Entity
public class Wypozyczenia {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_wypozyczenia;
	
	@NotNull
	//@ManyToOne
	private Integer id_rezerwacji;
	
	@NotNull
	private String stan_zwrotu;
	
	@NotNull
	private String opis;
	
	@NotNull
	private Integer koszt_uszkodzen;
	
	@NotNull
	private String czy_wszystko_oplacone;

	public Wypozyczenia() {
		super();
	}

	public Long getId_wypozyczenia() {
		return id_wypozyczenia;
	}

	public void setId_wypozyczenia(Long id_wypozyczenia) {
		this.id_wypozyczenia = id_wypozyczenia;
	}

	public Integer getId_rezerwacji() {
		return id_rezerwacji;
	}

	public void setId_rezerwacji(Integer id_rezerwacji) {
		this.id_rezerwacji = id_rezerwacji;
	}

	public String getStan_zwrotu() {
		return stan_zwrotu;
	}

	public void setStan_zwrotu(String stan_zwrotu) {
		this.stan_zwrotu = stan_zwrotu;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public Integer getKoszt_uszkodzen() {
		return koszt_uszkodzen;
	}

	public void setKoszt_uszkodzen(Integer koszt_uszkodzen) {
		this.koszt_uszkodzen = koszt_uszkodzen;
	}

	public String getCzy_wszystko_oplacone() {
		return czy_wszystko_oplacone;
	}

	public void setCzy_wszystko_oplacone(String czy_wszystko_oplacone) {
		this.czy_wszystko_oplacone = czy_wszystko_oplacone;
	}
	
}
