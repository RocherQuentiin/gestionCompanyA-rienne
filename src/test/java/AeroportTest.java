import fr.isep.file.ReadFile;
import fr.isep.models.Aeroport;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AeroportTest {
    private ReadFile readFile;

    @BeforeEach
    public void setUp() {
        // Créer une nouvelle instance de ReadFile avant chaque test
        readFile = new ReadFile();
    }

    @Test
    public void testLireCSV() {
        // Lire le fichier Aeroport.csv
        List<String[]> data = readFile.lireCSV("Aeroport.csv");

        // Vérifier que les données ont bien été lues
        assertNotNull(data, "Les données ne doivent pas être nulles");

        // Vérifier que le fichier contient au moins 3 lignes
        assertTrue(data.size() > 0, "Le fichier Aeroport.csv doit contenir des données");

        // Vérifier que la première ligne contient les informations correctes
        String[] firstLine = data.get(1);
        assertEquals("charle", firstLine[0], "Le nom de l'aéroport doit être 'charle'");
        assertEquals("grand aeroport", firstLine[1], "La ville de l'aéroport doit être 'grand aeroport'");
        assertEquals("\"Description of charle\"", firstLine[2], "La description de l'aéroport doit être 'Description of charle'");

        // Vérifier les autres lignes (exemple : deuxième ligne)
        String[] secondLine = data.get(2);
        assertEquals("ORLY", secondLine[0], "Le nom de l'aéroport doit être 'ORLY'");
        assertEquals("aeroport Parisien", secondLine[1], "La ville de l'aéroport doit être 'aeroport Parisien'");

    }
}

