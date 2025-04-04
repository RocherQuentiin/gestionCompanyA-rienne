package fr.isep.models;

import java.time.LocalDate;
import java.util.List;

import fr.isep.enums.Role;

public class Pilote extends Employe {
    private String licence;
    private float heuresDeVol;

    public Pilote(String nom, Adresse adresse, String contact, int numeroEmploye, LocalDate dateEmbauche, String licence, float heuresDeVol, List<Vol> volsAffectes) {
        super(Role.PILOTE.getId(), nom, adresse, contact, numeroEmploye, dateEmbauche, volsAffectes);
        this.licence = licence;
        this.heuresDeVol = heuresDeVol;
    }

    public Pilote(String nom, Adresse adresse, String contact, int numeroEmploye, LocalDate dateEmbauche, String licence, float heuresDeVol) {
        super(Role.PILOTE.getId(), nom, adresse, contact, numeroEmploye, dateEmbauche, null);
        this.licence = licence;
        this.heuresDeVol = heuresDeVol;
    }

    @Override
    public String obtenirRole() {
        return Role.PILOTE.name();
    }

    public void affecterVol(Vol vol) {
        super.ajouterVol(vol);
        System.out.println("Vol affecté au pilote.");
    }

    public void obtenirVol() {
        if (super.volsAffectes.isEmpty()) {
            System.out.println("Aucun vol n'est affecté au pilote " + getNom() + ".");
        } else {
            System.out.println("Liste des vols affectés au pilote " + getNom() + " :");
            for (Vol v : super.volsAffectes) {
                System.out.println("- Vol numéro " + v.getNumeroVol());
            }
        }
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