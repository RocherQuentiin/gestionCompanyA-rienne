package fr.isep.models;

import java.time.LocalDate;

public class Pilote extends Employe {
    private String licence;
    private float heuresDeVol;

    public Pilote(int identifiant, String nom, Adresse adresse, String contact, int numeroEmploye, LocalDate dateEmbauche, String licence, float heuresDeVol) {
        super(identifiant, nom, adresse, contact, numeroEmploye, dateEmbauche);
        this.licence = licence;
        this.heuresDeVol = heuresDeVol;
    }

    @Override
    public String obtenirRole() {
        return "Pilote";
    }

    public void affecterVol() {
        System.out.println("Vol affecté au pilote.");
    }

    public void obtenirVol() {
        System.out.println("Liste des vols du pilote.");
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public float getHeuresDeVol() {
        return heuresDeVol;
    }

    public void setHeuresDeVol(float heuresDeVol) {
        this.heuresDeVol = heuresDeVol;
    }


}