package fr.isep.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Vol {
    private int numeroVol;
    private Aeroport origine;
    private Aeroport destination;
    private LocalDateTime dateHeureDepart;
    private LocalDateTime dateHeureArrivee;
    private String etat;
    private List<Personne> personnes;
    private List<Reservation> reservations;
    private Avion avion;

    public Vol(int numeroVol, Aeroport origine, Aeroport destination, LocalDateTime dateHeureDepart, LocalDateTime dateHeureArrivee, String etat) {
        this.numeroVol = numeroVol;
        this.origine = origine;
        this.destination = destination;
        this.dateHeureDepart = dateHeureDepart;
        this.dateHeureArrivee = dateHeureArrivee;
        this.etat = etat;
        this.personnes = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }

    public void planifierVol(int numeroVol, Aeroport origine, Aeroport destination, LocalDateTime dateHeureDepart, LocalDateTime dateHeureArrivee, String etat) {
        this.numeroVol = numeroVol;
        this.origine = origine;
        this.destination = destination;
        this.dateHeureDepart = dateHeureDepart;
        this.dateHeureArrivee = dateHeureArrivee;
        this.etat = etat;
    }

    public void annulerVol(int numeroVol) {
        this.etat = "annulé";
        this.reservations.clear();
        this.personnes.clear();
        System.out.println("Le vol est bien annulé");
    }

    public void modifierVol(Aeroport origine,Aeroport destination,  LocalDateTime DateHeureDepart, LocalDateTime DateHeureArrivee) {
        this.origine = origine;
        this.destination = destination;
        this.dateHeureDepart = DateHeureDepart;
        this.dateHeureArrivee = DateHeureArrivee;
    }

    public void listingPersonne() {
        for (Personne personne : personnes) {
            System.out.println(personne);
        }
    }

    public int getNumeroVol() {
        return numeroVol;
    }

    public void setNumeroVol(int numeroVol) {
        this.numeroVol = numeroVol;
    }

    public Aeroport getOrigine() {
        return origine;
    }

    public void setOrigine(Aeroport origine) {
        this.origine = origine;
    }

    public Aeroport getDestination() {
        return destination;
    }

    public void setDestination(Aeroport destination) {
        this.destination = destination;
    }

    public LocalDateTime getDateHeureDepart() {
        return dateHeureDepart;
    }

    public void setDateHeureDepart(LocalDateTime dateHeureDepart) {
        this.dateHeureDepart = dateHeureDepart;
    }

    public LocalDateTime getDateHeureArrivee() {
        return dateHeureArrivee;
    }

    public void setDateHeureArrivee(LocalDateTime dateHeureArrivee) {
        this.dateHeureArrivee = dateHeureArrivee;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public List<Personne> getPersonnes() {
        return personnes;
    }

    public void setPersonnes(List<Personne> personnes) {
        this.personnes = personnes;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }
    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public Avion getAvion() {
        return avion;
    }
    public void setAvion(Avion avion) {
        this.avion = avion;
    }
}