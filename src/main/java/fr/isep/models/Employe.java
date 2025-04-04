package fr.isep.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employe extends Personne {
    private int numeroEmploye;
    private LocalDate dateEmbauche;
    protected List<Vol> volsAffectes = new ArrayList<>(); // Liste des vols affectés


    public Employe(int identifiant, String nom, Adresse adresse, String contact, int numeroEmploye, LocalDate dateEmbauche, List<Vol> volsAffectes) {
        super(identifiant, nom, adresse, contact);
        this.numeroEmploye = numeroEmploye;
        this.dateEmbauche = dateEmbauche;
        this.volsAffectes = volsAffectes;
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

    public List<Vol> getVolsAffectes() {
        return volsAffectes;
    }

    public void ajouterVol(Vol vol) {
        if (vol != null) {
            volsAffectes.add(vol);
        } else {
            System.out.println("Le vol ne peut pas être null.");
        }
    }
    
    public void supprimerVol(Vol vol) {
        volsAffectes.remove(vol);
    }
    public void afficherVolsAffectes() {
        System.out.println("Vols affectés à l'employé :");
        for (Vol vol : volsAffectes) {
            System.out.println(vol);
        }
    }


    @Override
    public String toString() {
        return "Employe{" +
                "numeroEmploye=" + numeroEmploye +
                ", dateEmbauche=" + dateEmbauche +
                '}';
    }


}