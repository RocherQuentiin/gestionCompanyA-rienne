package fr.isep.models;

import java.time.LocalDate;
import java.util.List;

import fr.isep.enums.Role;

public class PersonnelCabine extends Employe {
    private String qualification;

    public PersonnelCabine(String nom, Adresse adresse, String contact, int numeroEmploye, LocalDate dateEmbauche, String qualification) {
        super(Role.PERSONNEL_CABINE.getId(), nom, adresse, contact, numeroEmploye, dateEmbauche, null); // Identifiant pour Personnel Cabine
        this.qualification = qualification; // Valeur par défaut
    }

    public PersonnelCabine(String nom, Adresse adresse, String contact, int numeroEmploye, LocalDate dateEmbauche, String qualification, List<Vol> vols) {
        super(Role.PERSONNEL_CABINE.getId(), nom, adresse, contact, numeroEmploye, dateEmbauche, vols); // Identifiant pour Personnel Cabine
        this.qualification = qualification; // Valeur par défaut
    }

    public void affecterVol(Vol vol) {
        super.ajouterVol(vol);
        System.out.println("Vol affecté au personnel cabine.");
    }

    @Override
    public String obtenirRole() {
        return Role.PERSONNEL_CABINE.name();
    }

    public void affecterVol() {
        System.out.println("Vol affecté au personnel cabine.");
    }

    public void obtenirVol() {
        System.out.println("Liste des vols du personnel cabine.");
    }


    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}