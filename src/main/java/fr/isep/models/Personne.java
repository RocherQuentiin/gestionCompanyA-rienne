package fr.isep.models;

public class Personne {
    private int identifiant;
    private String nom;
    private String adresse;
    private String contact;

    public Personne(int identifiant, String nom, String adresse, String contact) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;
    }

    public void obtenirInfos() {
        System.out.println("ID: " + identifiant + ", Nom: " + nom + ", Adresse: " + adresse + ", Contact: " + contact);
    }

    // Getters and Setters
}