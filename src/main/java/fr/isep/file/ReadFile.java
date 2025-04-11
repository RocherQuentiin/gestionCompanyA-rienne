package fr.isep.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import fr.isep.models.Adresse;
import fr.isep.models.Aeroport;
import fr.isep.models.Passager;
import fr.isep.models.Pilote;
import fr.isep.models.Vol;

public class ReadFile {

    private static final String BASE_PATH = Paths.get("src", "main", "java", "fr", "isep", "bdd").toString();

    private List<String[]> readCsvFile(String fileName) {
        List<String[]> data = new ArrayList<>();
        String filePath = Paths.get(BASE_PATH, fileName).toString();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            reader.readLine(); // Skip header
            while ((line = reader.readLine()) != null) {
                data.add(line.split(",")); // Split CSV line into an array
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier " + fileName + " : " + e.getMessage());
        }
        return data;
    }

    // Charger les vols
    public List<Vol> loadVols() {
        List<Vol> vols = new ArrayList<>();
        List<String[]> data = readCsvFile("Vol.csv");
        for (String[] parts : data) {
            int numeroVol = Integer.parseInt(parts[0].trim());
            Aeroport origine = new Aeroport(parts[1].trim(), parts[1].trim(), parts[1].trim());
            Aeroport destination = new Aeroport(parts[2].trim(), parts[2].trim(), parts[2].trim());
            LocalDateTime dateHeureDepart = LocalDateTime.parse(parts[3].trim());
            LocalDateTime dateHeureArrivee = LocalDateTime.parse(parts[4].trim());
            String etat = parts[5].trim();
            Vol vol = new Vol(numeroVol, origine, destination, dateHeureDepart, dateHeureArrivee, etat);
            vols.add(vol);
        }
        return vols;
    }

    // Charger les passagers
    public List<Passager> loadPassagers() {
        List<Passager> passagers = new ArrayList<>();
        List<String[]> data = readCsvFile("Passager.csv");
        for (String[] parts : data) {
            String nom = parts[0].trim();
            Adresse adresse = new Adresse(Integer.parseInt(parts[1].trim().split(" ", 2)[0]), parts[1].trim().split(" ", 2)[1], 0, "");
            String contact = parts[2].trim();
            String passeport = parts[3].trim();
            Passager passager = new Passager(nom, adresse, contact, passeport);
            passagers.add(passager);
        }
        return passagers;
    }

    // Charger les pilotes
    public List<Pilote> loadPilotes() {
        List<Pilote> pilotes = new ArrayList<>();
        List<String[]> data = readCsvFile("Pilote.csv");
        for (String[] parts : data) {
            String nom = parts[0].trim();
            Adresse adresse = new Adresse(Integer.parseInt(parts[1].trim().split(" ", 2)[0]), parts[1].trim().split(" ", 2)[1], 0, "");
            String contact = parts[2].trim();
            String licence = parts[5].trim();
            LocalDate dateEmbauche = LocalDate.parse(parts[4].trim());
            float heuresDeVol = Float.parseFloat(parts[6].trim());
            Pilote pilote = new Pilote(nom, adresse, contact, Integer.parseInt(parts[3].trim()), dateEmbauche, licence, heuresDeVol);
            pilotes.add(pilote);
        }
        return pilotes;
    }

    // Ajoutez des méthodes similaires pour d'autres fichiers (PersonnelCabine, Reservation, etc.)
}