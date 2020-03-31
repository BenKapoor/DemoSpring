package eu.ensup.demospringannotation.dao;

import java.util.ArrayList;

import eu.ensup.demospringannotation.domaine.Etudiant;

public class EtudiantDao {
	
	public void createEtudiant(Etudiant etudiant) {
		System.out.println("création de l'élève");
	}
	
	public Etudiant getEtudiantById(int idEleve) {
		System.out.println("Récupération de l'élève dont l'id est : " +idEleve);
		return new Etudiant("Jean","Dupont");
	}
	
	public void deleteEtudiant(Etudiant etudiant) {
		System.out.println("Suppression de l'élève");
	}
	
	public ArrayList<Etudiant> getAllEtudiant() {
		System.out.println("Récupération de tous les élèves");
		return null;
	}
}
