package fr.isep.models;

import java.util.ArrayList;
import java.util.List;

public class Aeroport {
    private String nom;
    private String ville;
    private String description;
    private List<Employe> employe;
    private Vol vol;

    public Aeroport(String nom, String ville, String description) {
        this.nom = nom;
        this.ville = ville;
        this.description = description;
    }

    public void affecterVol() {
        if (vol != null && !employe.isEmpty()) {
            this.vol.setPersonnes(vol.getPersonnes());
        }
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   public List<Employe> getEmploye() {
        return employe;
   }

   public void setEmploye(List<Employe> employee) {
        this.employe = employe;
   }

   public Vol getVol() {
        return vol;
   }
   public void setVol(Vol vol) {
        this.vol = vol;
   }

    @Override
    public String toString() {
        return "Aeroport{" +
                "nom='" + nom + '\'' +
                ", ville='" + ville + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

}