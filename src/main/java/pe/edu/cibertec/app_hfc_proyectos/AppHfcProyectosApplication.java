package pe.edu.cibertec.app_hfc_proyectos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class AppHfcProyectosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppHfcProyectosApplication.class, args);
	}

}
