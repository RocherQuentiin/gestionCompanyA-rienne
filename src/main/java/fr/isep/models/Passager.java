package fr.isep.models;

import java.util.ArrayList;
import java.util.List;

public class Passager extends Personne {
    private String passeport;
    private List<Reservation> reservations;

    public Passager(int identifiant, String nom, Adresse adresse, String contact, String passeport) {
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

    public String getPasseport() {
        return passeport;
    }

    public void setPasseport(String passeport) {
        this.passeport = passeport;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

}