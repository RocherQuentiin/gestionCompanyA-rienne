package fr.isep.models;

public class Pilote extends Employe {
    private String licence;
    private int heuresDeVol;

    public Pilote(int identifiant, String nom, String adresse, String contact, int numeroEmploye, String dateEmbauche, String licence, int heuresDeVol) {
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

    // Getters and Setters
}