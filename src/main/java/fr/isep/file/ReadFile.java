package fr.isep.file;
import java.io.*;
import java.nio.file.Paths;
import java.util.*;

public class ReadFile {

    // Lire les données CSV et charger en mémoire
    public List<String[]> lireCSV(String file) {
        String filePath = Paths.get("src", "main", "java", "fr", "isep", "bdd", file).toString();
        List<String[]> data = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                data.add(line.split(";"));  // Sépare chaque ligne en un tableau de données
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }
        return data;
    }

    // Sauvegarder les données dans un fichier CSV
    public void ecrireCSV(String file, List<String[]> data) {
        String filePath = Paths.get("src", "main", "java", "fr", "isep", "bdd", file).toString();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String[] row : data) {
                writer.write(String.join(";", row));  // Convertit chaque ligne en une chaîne de texte
                writer.newLine();
            }
            System.out.println("Le fichier a été mis à jour avec succès.");
        } catch (IOException e) {
            System.err.println("Erreur lors de l'écriture dans le fichier : " + e.getMessage());
        }
    }

    public void updateCSV(String fichier) {
        List<String> updatedLines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String line;
            while ((line = reader.readLine()) != null) {
                updatedLines.add(line);
            }

            updatedLines.add("Nouvelle ligne ajoutée");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fichier))) {
            for (String updatedLine : updatedLines) {
                writer.write(updatedLine);
                writer.newLine();
            }
            System.out.println("Le fichier CSV a été mis à jour !");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
