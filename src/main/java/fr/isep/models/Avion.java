package fr.isep.models;

public class Avion {
    private String immatriculation;
    private String modele;
    private int capacite;

    public Avion(String immatriculation, String modele, int capacite) {
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.capacite = capacite;
    }

    public void affecterVol() {
        System.out.println("Vol affecté à l'avion.");
    }

    public boolean verifierDisponibilite() {
        System.out.println("Disponibilité vérifiée.");
        return true;
    }

    // Getters and Setters
}