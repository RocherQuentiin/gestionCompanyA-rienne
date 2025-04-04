package fr.isep.models;

public class Aeroport {
    private String nom;
    private String ville;
    private String description;

    public Aeroport(String nom, String ville, String description) {
        this.nom = nom;
        this.ville = ville;
        this.description = description;
    }

    public void affecterVol() {
        System.out.println("Vol affecté à l'aéroport.");
    }

    // Getters and Setters
}