package com.tresct.demospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/computadora")// End Point
@SpringBootApplication
public class DemoSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootApplication.class, args);
	}

	@GetMapping
	public List<ComputadoraRecord> procesar(){

		// Genero instancias de los discos
		DiscoRecord discoWestern = new DiscoRecord("Western Digital",1,64);
		DiscoRecord discoSeagate = new DiscoRecord("Seagate",8,256);

		// Ahora agrego los discos a las computadoras
		return Arrays.asList(new ComputadoraRecord("Lenovo",16, discoWestern),
				new ComputadoraRecord("HP",32,discoSeagate));
	}
}
