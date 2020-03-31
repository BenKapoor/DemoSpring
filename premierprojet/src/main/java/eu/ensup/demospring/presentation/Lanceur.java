package eu.ensup.demospring.presentation;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import eu.ensup.demospring.domaine.Etudiant;
import eu.ensup.demospring.service.EtudiantService;


public class Lanceur {

	public static void main(String[] args) {
		//1. Chargement du conteneur en 4.0.0
		ApplicationContext appContext = (ApplicationContext) new ClassPathXmlApplicationContext("demo-spring-injection.xml");
				
		//2. Récupération du bean 
		EtudiantService service = (EtudiantService) appContext.getBean("serviceEtudiant");
		
		//3. Manipulation du bean
		System.out.println(service.lireEtudiant(1));

	}

}
