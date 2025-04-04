package fr.isep;

import java.time.LocalDate;

import fr.isep.models.Adresse;
import fr.isep.models.Aeroport;
import fr.isep.models.Passager;
import fr.isep.models.PersonnelCabine;
import fr.isep.models.Pilote;
import fr.isep.models.Vol;

public class Main {
    public static void main(String[] args) {
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

        Aeroport origine = new Aeroport("Charles de Gaulle", "Paris", "Aéroport principal");
        Aeroport destination = new Aeroport("JFK", "New York", "Aéroport international");
        Vol vol = new Vol(123, origine, destination, 
                java.time.LocalDateTime.parse("2025-04-10T10:00"), 
                java.time.LocalDateTime.parse("2025-04-10T14:00"), 
                "Planifié");

        pilote.affecterVol(vol); // Utilise la méthode héritée de la classe Employe
        pilote.obtenirVol();     // Affiche les vols affectés au pilote
    }
}