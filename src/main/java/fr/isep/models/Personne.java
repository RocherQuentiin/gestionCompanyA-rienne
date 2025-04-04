package fr.isep.models;

public class Personne {
    private int identifiant;
    private String nom;
    private Adresse adresse;
    private String contact;

    public Personne(int identifiant, String nom, Adresse adresse, String contact) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;
    }

    public void obtenirInfos() {
        System.out.println("ID: " + identifiant + ", Nom: " + nom + ", Adresse: " + adresse + ", Contact: " + contact);
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

}