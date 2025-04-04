package fr.isep.models;

import java.time.LocalDate;

public class Employe extends Personne {
    private int numeroEmploye;
    private LocalDate dateEmbauche;

    public Employe(int identifiant, String nom, Adresse adresse, String contact, int numeroEmploye, LocalDate dateEmbauche) {
        super(identifiant, nom, adresse, contact);
        this.numeroEmploye = numeroEmploye;
        this.dateEmbauche = dateEmbauche;
    }


    public int getNumeroEmploye() {
        return numeroEmploye;
    }

    public void setNumeroEmploye(int numeroEmploye) {
        this.numeroEmploye = numeroEmploye;
    }

    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(LocalDate dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "numeroEmploye=" + numeroEmploye +
                ", dateEmbauche=" + dateEmbauche +
                '}';
    }


}