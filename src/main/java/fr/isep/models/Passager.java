package fr.isep.models;

import java.util.ArrayList;
import java.util.List;

import fr.isep.enums.Role;

public class Passager extends Personne {
    private String passeport;
    private List<Reservation> reservations;

        public Passager(String nom, Adresse adresse, String contact, String passeport) {
        super(Role.PASSAGER.getId(), nom, adresse, contact); // Identifiant pour Passager
        this.passeport = passeport;
        this.reservations = new ArrayList<>();
    }

    @Override
    public String obtenirRole() {
        return Role.PASSAGER.name();
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