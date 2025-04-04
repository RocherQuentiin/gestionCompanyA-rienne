package fr.isep.models;

import java.util.ArrayList;
import java.util.List;

public class Passager extends Personne {
    private String passeport;
    private List<Reservation> reservations;

    public Passager(int identifiant, String nom, String adresse, String contact, String passeport) {
        super(identifiant, nom, adresse, contact);
        this.passeport = passeport;
        this.reservations = new ArrayList<>();
    }

    public void reserverVol(Reservation reservation) {
        reservations.add(reservation);
        System.out.println("Réservation ajoutée.");
    }

    public void annulerReservation(int numeroReservation) {
        reservations.removeIf(r -> r.getNumeroReservation() == numeroReservation);
        System.out.println("Réservation annulée.");
    }

    public void obtenirReservations() {
        reservations.forEach(System.out::println);
    }

    // Getters and Setters
}