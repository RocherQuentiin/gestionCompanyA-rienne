package fr.isep.models;

import java.util.ArrayList;
import java.util.List;

public class Vol {
    private int numeroVol;
    private String origine;
    private String destination;
    private String dateHeureDepart;
    private String dateHeureArrivee;
    private String etat;
    private List<Passager> passagers;

    public Vol(int numeroVol, String origine, String destination, String dateHeureDepart, String dateHeureArrivee, String etat) {
        this.numeroVol = numeroVol;
        this.origine = origine;
        this.destination = destination;
        this.dateHeureDepart = dateHeureDepart;
        this.dateHeureArrivee = dateHeureArrivee;
        this.etat = etat;
        this.passagers = new ArrayList<>();
    }

    public void planifierVol() {
        System.out.println("Vol planifié.");
    }

    public void annulerVol() {
        System.out.println("Vol annulé.");
    }

    public void modifierVol() {
        System.out.println("Vol modifié.");
    }

    public void listingPassager() {
        passagers.forEach(System.out::println);
    }

    // Getters and Setters
}