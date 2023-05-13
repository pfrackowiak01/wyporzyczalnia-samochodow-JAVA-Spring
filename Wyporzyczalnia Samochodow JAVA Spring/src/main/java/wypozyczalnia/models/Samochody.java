package wypozyczalnia.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;

@Entity
public class Samochody {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_samochodu;
	
	@NotNull
	private String nazwa;
	
	@NotNull
	private String skrzynia_bieg;
	
	@NotNull
	private String klasa;
	
	@NotNull
	private Integer miejsca;
	
	@NotNull
	private Integer bagaz;
	
	@NotNull
	private Integer stawka_dzienna;
	
	@NotNull
	private Integer kaucja;
	
	@NotNull
	//@ManyToOne
	private Integer id_ubezpieczenia;
	
	@NotNull
	private String silnik;
	
	@NotNull
	private Double spalanie;
	
	@NotNull
	private String obrazek;
	
	@OneToMany(mappedBy="id_samochodu")
	private List<Samochody> samochody;

	public Long getId_samochodu() {
		return id_samochodu;
	}

	public void setId_samochodu(Long id_samochodu) {
		this.id_samochodu = id_samochodu;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getSkrzynia_bieg() {
		return skrzynia_bieg;
	}

	public void setSkrzynia_bieg(String skrzynia_bieg) {
		this.skrzynia_bieg = skrzynia_bieg;
	}

	public String getKlasa() {
		return klasa;
	}

	public void setKlasa(String klasa) {
		this.klasa = klasa;
	}

	public Integer getMiejsca() {
		return miejsca;
	}

	public void setMiejsca(Integer miejsca) {
		this.miejsca = miejsca;
	}

	public Integer getBagaz() {
		return bagaz;
	}

	public void setBagaz(Integer bagaz) {
		this.bagaz = bagaz;
	}

	public Integer getStawka_dzienna() {
		return stawka_dzienna;
	}

	public void setStawka_dzienna(Integer stawka_dzienna) {
		this.stawka_dzienna = stawka_dzienna;
	}

	public Integer getKaucja() {
		return kaucja;
	}

	public void setKaucja(Integer kaucja) {
		this.kaucja = kaucja;
	}

	public Integer getId_ubezpieczenia() {
		return id_ubezpieczenia;
	}

	public void setId_ubezpieczenia(Integer id_ubezpieczenia) {
		this.id_ubezpieczenia = id_ubezpieczenia;
	}

	public String getSilnik() {
		return silnik;
	}

	public void setSilnik(String silnik) {
		this.silnik = silnik;
	}

	public Double getSpalanie() {
		return spalanie;
	}

	public void setSpalanie(Double spalanie) {
		this.spalanie = spalanie;
	}

	public String getObrazek() {
		return obrazek;
	}

	public void setObrazek(String obrazek) {
		this.obrazek = obrazek;
	}

	public List<Samochody> getSamochody() {
		return samochody;
	}

	public void setSamochody(List<Samochody> samochody) {
		this.samochody = samochody;
	}
	
}
