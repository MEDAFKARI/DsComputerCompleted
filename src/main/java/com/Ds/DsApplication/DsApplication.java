package com.Ds.DsApplication;

import com.Ds.DsApplication.dao.entity.Computer;
import com.Ds.DsApplication.dao.repository.ComputerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ComputerRepository computerRepository){
		return args -> {
			List<Computer> computers = List.of(
					Computer.builder().ram(8).proce("I7").price(10000.0).hardDrive(256).macAddress("12931231").build(),
					Computer.builder().ram(8).proce("I7").price(10000.0).hardDrive(256).macAddress("12931231").build(),
					Computer.builder().ram(8).proce("I6").price(10000.0).hardDrive(256).macAddress("12931231").build()
			);
			computerRepository.saveAll(computers);
		};
	}

}
