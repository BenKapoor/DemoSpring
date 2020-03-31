package eu.ensup.demospringannotation.service;

import java.util.ArrayList;

import eu.ensup.demospringannotation.dao.EtudiantDao;
import eu.ensup.demospringannotation.domaine.Etudiant;

public class EtudiantService {

	//injection de la propertie dao dans le service
	//besoin des getter et setter
	private EtudiantDao daoEtudiant;

	public EtudiantService(EtudiantDao daoEtudiant) {
		super();
		this.daoEtudiant = daoEtudiant;
	}

	public EtudiantDao getDaoEtudiant() {
		return daoEtudiant;
	}

	public void setDaoEtudiant(EtudiantDao daoEtudiant) {
		this.daoEtudiant = daoEtudiant;
	}
	
	public void creerEtudiant() {
		daoEtudiant.createEtudiant(new Etudiant("", ""));
	}
	
	public Etudiant lireEtudiant(int id) {
		return daoEtudiant.getEtudiantById(id);
	}
	
	public void supprimerEtudiant(Etudiant etudiant) {
		daoEtudiant.deleteEtudiant(etudiant);
	}
	
	public ArrayList<Etudiant> lireTousLesEtudiants(){
		return daoEtudiant.getAllEtudiant();
	}
}
