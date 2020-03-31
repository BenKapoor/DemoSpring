package eu.ensup.demospringannotation.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import eu.ensup.demospringannotation.configuration.ConfigurationBeans;
import eu.ensup.demospringannotation.dao.EtudiantDao;
import eu.ensup.demospringannotation.service.EtudiantService;

public class LanceurAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------- ---------");
		
		// load du conteneur
		ApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigurationBeans.class);
		
		// Récupération du bean service 
		EtudiantService etudiantService = (EtudiantService) appContext.getBean("etudiantService");
		
		// Manipulation du bean
		System.out.println(etudiantService.lireEtudiant(1));
	}
}
