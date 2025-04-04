package fr.isep.models;

import java.time.LocalDate;

import fr.isep.enums.Role;

public class PersonnelCabine extends Employe {
    private String qualification;

    public PersonnelCabine(String nom, Adresse adresse, String contact, int numeroEmploye, LocalDate dateEmbauche, String qualification) {
        super(Role.PERSONNEL_CABINE.getId(), nom, adresse, contact, numeroEmploye, dateEmbauche); // Identifiant pour Personnel Cabine
        this.qualification = qualification; // Valeur par défaut
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