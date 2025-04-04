package fr.isep;

import fr.isep.models.*;

import java.time.LocalDate;

import java.time.LocalDate;

import fr.isep.models.Adresse;
import fr.isep.models.Passager;
import fr.isep.models.PersonnelCabine;
import fr.isep.models.Pilote;

public class Main {
    public static void main(String[] args) {

        Adresse adresse = new Adresse(10, "Rue de Paris", 75000, "Paris");
        Passager passager = new Passager(12, "fathi", adresse, "contact", "EU");

        Aeroport origine = new Aeroport("Charles de Gaulle", "Paris", "Aéroport international");
        Aeroport destination = new Aeroport("JFK", "New York", "Aéroport américain");


        Avion avion1 = new Avion("Airbus A350", "280", 25);

        Employe e1 = new Employe(1, "Alice Dupont", adresse, "alice@aeroport.fr", 1001, LocalDate.of(2020, 5, 10));
        Employe e2 = new Employe(2, "Bob Martin", adresse, "bob@aeroport.fr", 1002, LocalDate.of(2021, 3, 15));

        Vol vol = new Vol(787,origine,destination, "2024-05-05", "2025-04-04", "dispo" );
        Reservation res = new Reservation(123,  LocalDate.parse("2025-04-04"), "dispo", vol, passager);
        Reservation res2 = new Reservation(123,  LocalDate.parse("2025-04-04"), "confirmé", vol, passager);

        res.confirmerReservation();
        res2.annulerReservation();
        System.out.println(passager.getReservations());


        Adresse adresse = new Adresse(10, "Rue de Paris", 75000, "Paris");

        // Création d'un pilote
        Pilote pilote = new Pilote("Jean Dupont", adresse, "0123456789", 101, LocalDate.of(2020, 1, 15), "Captain", 4.5f);
        pilote.obtenirInfos(); // Affichera : Métier: Pilote

        // Création d'un personnel cabine
        PersonnelCabine personnelCabine = new PersonnelCabine("Marie Curie", adresse, "0987654321", 102, LocalDate.of(2021, 5, 10), "Cabin Crew");
        personnelCabine.obtenirInfos(); // Affichera : Métier: Personnel Cabine

        // Création d'un passager
        Passager passager = new Passager("John Doe", adresse, "0765432109", "AB123456");
        passager.obtenirInfos(); // Affichera : Métier: Passager
    }
}