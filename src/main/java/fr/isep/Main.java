package fr.isep;

import fr.isep.models.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

import java.time.LocalDate;

import fr.isep.models.Adresse;
import fr.isep.models.Passager;
import fr.isep.models.PersonnelCabine;
import fr.isep.models.Pilote;

public class Main {
    public static void main(String[] args) {

        Adresse adresse = new Adresse(10, "Rue de Paris", 75000, "Paris");
        Passager passager = new Passager( "fathi", adresse, "contact", "EU");

        Aeroport origine = new Aeroport("Charles de Gaulle", "Paris", "Aéroport international");
        Aeroport destination = new Aeroport("JFK", "New York", "Aéroport américain");


        Employe e1 = new Employe(1, "Alice Dupont", adresse, "alice@aeroport.fr", 1001, LocalDate.of(2020, 5, 10));
        Employe e2 = new Employe(2, "Bob Martin", adresse, "bob@aeroport.fr", 1002, LocalDate.of(2021, 3, 15));

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
        Passager passager1 = new Passager("John Doe", adresse2, "0765432109", "AB123456");
        passager1.obtenirInfos(); // Affichera : Métier: Passager
    }
}