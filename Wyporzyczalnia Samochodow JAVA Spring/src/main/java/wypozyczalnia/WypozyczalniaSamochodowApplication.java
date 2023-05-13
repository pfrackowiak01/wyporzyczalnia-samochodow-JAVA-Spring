package wypozyczalnia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//(exclude = {DataSourceAutoConfiguration.class})
public class WypozyczalniaSamochodowApplication {

	public static void main(String[] args) {
		SpringApplication.run(WypozyczalniaSamochodowApplication.class, args);
	}

}
