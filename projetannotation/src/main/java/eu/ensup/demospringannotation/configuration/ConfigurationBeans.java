package eu.ensup.demospringannotation.configuration;

import org.springframework.context.annotation.Bean;

import eu.ensup.demospringannotation.dao.EtudiantDao;
import eu.ensup.demospringannotation.service.EtudiantService;

public class ConfigurationBeans {
	@Bean
	public EtudiantService etudiantService() {
		return new EtudiantService(etudiantDao());
	}
	
	@Bean
	public EtudiantDao etudiantDao() {
		return new EtudiantDao();
	}
}
