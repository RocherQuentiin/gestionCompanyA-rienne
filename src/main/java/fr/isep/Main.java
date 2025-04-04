package fr.isep;

import java.time.LocalDate;
import java.time.LocalDateTime;

import fr.isep.models.Adresse;
import fr.isep.models.Aeroport;
import fr.isep.models.Avion;
import fr.isep.models.Passager;
import fr.isep.models.PersonnelCabine;
import fr.isep.models.Pilote;
import fr.isep.models.Reservation;
import fr.isep.models.Vol;

public class Main {
    public static void main(String[] args) {

        Adresse adresse = new Adresse(10, "Rue de Paris", 75000, "Paris");
        Passager passager = new Passager( "fathi", adresse, "contact", "EU");

        Aeroport origine = new Aeroport("Charles de Gaulle", "Paris", "Aéroport international");
        Aeroport destination = new Aeroport("JFK", "New York", "Aéroport américain");



        Vol vol = new Vol(787,origine,destination, LocalDateTime.of(2025, 5, 1, 14, 30), LocalDateTime.of(2025, 5, 1, 14, 30), "dispo" );
        Reservation res = new Reservation(123,  LocalDate.parse("2025-04-04"), "dispo", vol, passager);
        Reservation res2 = new Reservation(123,  LocalDate.parse("2025-04-04"), "confirmé", vol, passager);
        Vol vol2 = new Vol(787,origine,destination, null, null, "dispo" );

        Avion avion1 = new Avion("Airbus A350", "280", 25);
        avion1.setVol(vol2);

        res.confirmerReservation();
        res2.annulerReservation();

        avion1.affecterVol(vol);
        System.out.println(vol.getAvion());

        vol2.annulerVol();

        Adresse adresse2 = new Adresse(10, "Rue de Paris", 75000, "Paris");

        // Création d'un pilote
        Pilote pilote = new Pilote("Jean Dupont", adresse, "0123456789", 101, LocalDate.of(2020, 1, 15), "Captain", 4.5f);
        pilote.obtenirInfos(); // Affichera : Métier: Pilote

        // Création d'un personnel cabine
        PersonnelCabine personnelCabine = new PersonnelCabine("Marie Curie", adresse, "0987654321", 102, LocalDate.of(2021, 5, 10), "Cabin Crew");
        personnelCabine.obtenirInfos(); // Affichera : Métier: Personnel Cabine

        // Création d'un passager
        Passager passager2 = new Passager("John Doe", adresse, "0765432109", "AB123456");
        passager2.obtenirInfos(); // Affichera : Métier: Passager

        Aeroport origine2 = new Aeroport("Charles de Gaulle", "Paris", "Aéroport principal");
        Aeroport destination2 = new Aeroport("JFK", "New York", "Aéroport international");
        Vol vol3 = new Vol(123, origine2, destination2,
                java.time.LocalDateTime.parse("2025-04-10T10:00"),
                java.time.LocalDateTime.parse("2025-04-10T14:00"),
                "Planifié");

        pilote.affecterVol(vol3); // Utilise la méthode héritée de la classe Employe
        pilote.obtenirVol();     // Affiche les vols affectés au pilote
        Passager passager1 = new Passager("John Doe", adresse2, "0765432109", "AB123456");
        passager1.obtenirInfos(); // Affichera : Métier: Passager
    }
}