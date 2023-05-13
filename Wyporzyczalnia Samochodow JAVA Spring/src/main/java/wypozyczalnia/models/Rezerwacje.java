package wypozyczalnia.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedNativeQuery;
import jakarta.validation.constraints.NotNull;

import java.lang.Long;
import java.sql.Date;

@Entity
@NamedNativeQuery(name = "Klienci.findAllByTitleNativeSQL",query = "SELECT * FROM wypozyczalniapaw.klienci ORDER BY title ",resultClass = Klienci.class)
public class Rezerwacje {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_rezerwacji;
	
	@NotNull
	//@ManyToOne
	private Long id_klienta;
	
	@NotNull
	//@ManyToOne
	private Long id_samochodu;
	
	@NotNull
	private Date data_pocz;
	
	@NotNull
	private Date data_kon;
	
	@NotNull
	private String ochrona;
	
	@NotNull
	private String pakiet;
	
	public Rezerwacje() {
		super();
	}

	public Long getId_rezerwacji() {
		return id_rezerwacji;
	}

	public void setId_rezerwacji(Long id_rezerwacji) {
		this.id_rezerwacji = id_rezerwacji;
	}

	public Long getId_klienta() {
		return id_klienta;
	}

	public void setId_klienta(Long id_klienta) {
		this.id_klienta = id_klienta;
	}

	public Long getId_samochodu() {
		return id_samochodu;
	}

	public void setId_samochodu(Long id_samochodu) {
		this.id_samochodu = id_samochodu;
	}

	public Date getData_pocz() {
		return data_pocz;
	}

	public void setData_pocz(Date data_pocz) {
		this.data_pocz = data_pocz;
	}

	public Date getData_kon() {
		return data_kon;
	}

	public void setData_kon(Date data_kon) {
		this.data_kon = data_kon;
	}

	public String getOchrona() {
		return ochrona;
	}

	public void setOchrona(String ochrona) {
		this.ochrona = ochrona;
	}

	public String getPakiet() {
		return pakiet;
	}

	public void setPakiet(String pakiet) {
		this.pakiet = pakiet;
	}
	
}
