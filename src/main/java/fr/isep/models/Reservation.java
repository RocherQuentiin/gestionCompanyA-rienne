package fr.isep.models;

import java.time.LocalDate;

public class Reservation {
    private int numeroReservation;
    private LocalDate dateReservation;
    private String statut;
    private Vol vol;
    private Passager passager;

    public Reservation(int numeroReservation, LocalDate dateReservation, String statut) {
        this.numeroReservation = numeroReservation;
        this.dateReservation = dateReservation;
        this.statut = statut;
    }

    public void confirmerReservation() {
        System.out.println("Réservation confirmée.");
    }

    public void annulerReservation() {
        System.out.println("Réservation annulée.");
    }

    public void modifierReservation() {
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