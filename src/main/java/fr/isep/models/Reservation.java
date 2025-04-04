package fr.isep.models;

import java.time.LocalDate;

public class Reservation {
    private int numeroReservation;
    private LocalDate dateReservation;
    private String statut;
    private Vol vol;
    private Passager passager;

    public Reservation(int numeroReservation, LocalDate dateReservation, String statut, Vol vol, Passager passager) {
        this.numeroReservation = numeroReservation;
        this.dateReservation = dateReservation;
        this.statut = statut;
        this.vol = vol;
        this.passager = passager;
    }

    public void confirmerReservation() {
        if(this.statut != "confirmer") {
            this.statut = "Confirmer";
            this.vol.getReservations().add(this);
            System.out.println("La reservation est confirmé");
        }
        else {
            System.out.println("La reservation n'est plus disponible");
        }
    }

    public void annulerReservation() {
        if(this.statut == "confirmé") {
            this.statut = "annuler";
            this.vol.getReservations().remove(this);
            this.passager.getReservations().remove(this);
            System.out.println("Votre réservation a bien ete annuler");
        }
    }

    public void modifierReservation(LocalDate dateReservation) {
        this.dateReservation = dateReservation;
        System.out.println("Réservation modifiée.");
    }

    public int getNumeroReservation() {
        return numeroReservation;
    }

    public void setNumeroReservation(int numeroReservation) {
        this.numeroReservation = numeroReservation;
    }

    public LocalDate getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(LocalDate dateReservation) {
        this.dateReservation = dateReservation;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Vol getVol() {
        return vol;
    }
    public void setVol(Vol vol) {
        this.vol = vol;
    }
    public Passager getPassager() {
        return passager;
    }
    public void setPassager(Passager passager) {
        this.passager = passager;
    }
}