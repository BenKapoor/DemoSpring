package eu.ensup.demospringannotation.dao;

import java.util.ArrayList;

import eu.ensup.demospringannotation.domaine.Etudiant;

public class EtudiantDao {
	
	public void createEtudiant(Etudiant etudiant) {
		System.out.println("cr�ation de l'�l�ve");
	}
	
	public Etudiant getEtudiantById(int idEleve) {
		System.out.println("R�cup�ration de l'�l�ve dont l'id est : " +idEleve);
		return new Etudiant("Jean","Dupont");
	}
	
	public void deleteEtudiant(Etudiant etudiant) {
		System.out.println("Suppression de l'�l�ve");
	}
	
	public ArrayList<Etudiant> getAllEtudiant() {
		System.out.println("R�cup�ration de tous les �l�ves");
		return null;
	}
}
