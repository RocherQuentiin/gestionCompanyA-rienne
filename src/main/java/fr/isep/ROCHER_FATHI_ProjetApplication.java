package fr.isep;

import jakarta.annotation.PreDestroy;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.isep.file.ReadFile;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class ROCHER_FATHI_ProjetApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ROCHER_FATHI_ProjetApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Application démarrée avec Spring Boot.");

        ReadFile readFile = new ReadFile();
        readFile.lireCSV("Vol.csv");
        readFile.lireCSV("Passager.csv");
        readFile.lireCSV("Vol.csv");
        readFile.lireCSV("Adresse.csv");
        readFile.lireCSV("Aeroport.csv");
        readFile.lireCSV("Reservation.csv");
        readFile.lireCSV("Pilote.csv");
        readFile.lireCSV("Avion.csv");
        readFile.lireCSV("Employe.csv");


    }

    @PreDestroy
    public void onExit() {
        System.out.println("Application en cours de fermeture...");

        // Mettre à jour les fichiers CSV avant de fermer
        ReadFile readFile = new ReadFile();
        readFile.updateCSV("Vol.csv");
        readFile.updateCSV("Passager.csv");
        readFile.updateCSV("Vol.csv");
        readFile.updateCSV("Adresse.csv");
        readFile.updateCSV("Aeroport.csv");
        readFile.updateCSV("Reservation.csv");
        readFile.updateCSV("Pilote.csv");
        readFile.updateCSV("Avion.csv");
        readFile.updateCSV("Employe.csv");

        System.out.println("Fichiers CSV mis à jour.");
    }
}

