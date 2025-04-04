package fr.isep.models;

import java.time.LocalDate;
import java.util.Date;

public class PersonnelCabine extends Employe {
    private String qualification;

    public PersonnelCabine(int identifiant, String nom, Adresse adresse, String contact, int numeroEmploye, LocalDate dateEmbauche, String qualification) {
        super(identifiant, nom, adresse, contact, numeroEmploye, dateEmbauche);
        this.qualification = qualification;
    }

    @Override
    public String obtenirRole() {
        return "Personnel Cabine";
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