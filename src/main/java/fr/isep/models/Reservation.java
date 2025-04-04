package fr.isep.models;

public class Reservation {
    private int numeroReservation;
    private String dateReservation;
    private String statut;

    public Reservation(int numeroReservation, String dateReservation, String statut) {
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

    // Getters and Setters
}