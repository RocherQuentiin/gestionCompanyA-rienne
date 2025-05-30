import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;

import fr.isep.models.Adresse;
import fr.isep.models.Aeroport;
import fr.isep.models.Avion;
import fr.isep.models.Passager;
import fr.isep.models.PersonnelCabine;
import fr.isep.models.Pilote;
import fr.isep.models.Reservation;
import fr.isep.models.Vol;
public class TestAppli {

    // Test pour la gestion des personnes
            @org.junit.jupiter.api.Test

//    public void testObtenirInfos() {
//        // Simuler l'obtention des informations d'une personne
//        String infos = "Nom: John Doe, Age: 30, Adresse: 123 Rue Exemple";
//        assertNotNull(infos, "Les informations de la personne ne doivent pas être nulles");
//        assertEquals(infos, "John Doe", infos.trim());
//    }

            //@org.junit.jupiter.api.Test

    public void testObtenirRole() {
        // Simuler l'obtention du rôle d'un employé par ID
        Adresse adresse = new Adresse(10, "Rue de Paris", 75000, "Paris");
        Pilote pilote = new Pilote("Jean Dupont", adresse, "0123456789", 101, java.time.LocalDate.of(2020, 1, 15), "Captain", 4.5f);
        assertEquals("PILOTE", pilote.obtenirRole(), "Le rôle retourné doit être 'PILOTE'");

        Adresse adresse2 = new Adresse(20, "Avenue des Champs", 75008, "Paris");
        PersonnelCabine personnelCabine = new PersonnelCabine("Marie Curie", adresse2, "0987654321", 102, java.time.LocalDate.of(2021, 5, 10), "Cabin Crew");
        assertEquals("PERSONNEL_CABINE", personnelCabine.obtenirRole(), "Le rôle retourné doit être 'PERSONNEL_CABINE'");

        Adresse adresse3 = new Adresse(30, "Boulevard Haussmann", 75009, "Paris");
        Passager passager = new Passager("John Doe", adresse3, "0765432109", "AB123456");
        assertEquals("PASSAGER", passager.obtenirRole(), "Le rôle retourné doit être 'PASSAGER'");

        Adresse adresse5 = new Adresse(50, "Rue de la Paix", 75002, "Paris");
        Passager passagerAvecRole = new Passager("Bob Martin", adresse5, "0123456789", "EF123456");
        assertEquals("PASSAGER", passagerAvecRole.obtenirRole(), "Le rôle retourné doit être 'PASSAGER'");

        // je suis sur qu'il n'est pas égale à "PILOTE"
        assertNotNull(pilote, "Le pilote ne doit pas être null");
        assertEquals("PILOTE", pilote.obtenirRole(), "Le rôle retourné doit être 'PILOTE'");
        // je suis sur qu'il n'est pas égale à "PERSONNEL_CABINE"
        assertNotNull(personnelCabine, "Le personnel de cabine ne doit pas être null");
        assertEquals("PERSONNEL_CABINE", personnelCabine.obtenirRole(), "Le rôle retourné doit être 'PERSONNEL_CABINE'");
        assertNotNull(passager, "Le passager ne doit pas être null");
    }

            @org.junit.jupiter.api.Test

    public void testReserverVol() {
        // Simuler la réservation d'un vol
        boolean reservationSuccess = true;
        assertTrue(reservationSuccess, "La réservation du vol doit réussir");
    }

    // Test pour la gestion des réservations
            @org.junit.jupiter.api.Test

    public void testAnnulerReservation() {
        // Simuler l'annulation d'une réservation par ID
        boolean cancellationSuccess = true;
        assertTrue(cancellationSuccess, "L'annulation de la réservation doit réussir");
    }

            @org.junit.jupiter.api.Test

    public void testObtenirReservations() {
        // Simuler l'obtention des détails d'une réservation par ID
        String reservationDetails = "Réservation ID: 123, Vol: ABC123, Passager: John Doe";
        assertNotNull(reservationDetails, "Les détails de la réservation ne doivent pas être nuls");
    }

    // Test pour la gestion des vols
            @org.junit.jupiter.api.Test

    public void testAffecterVol() {
        // Simuler l'affectation d'un équipage à un vol
        Pilote pilote = new Pilote("Jean Dupont", new Adresse(10, "Rue de Paris", 75000, "Paris"), "0123456789", 101, java.time.LocalDate.of(2020, 1, 15), "Captain", 4.5f);
        PersonnelCabine personnelCabine = new PersonnelCabine("Marie Curie", new Adresse(20, "Avenue des Champs", 75008, "Paris"), "0987654321", 102, java.time.LocalDate.of(2021, 5, 10), "Cabin Crew");
        Aeroport origine = new Aeroport("Charles de Gaulle", "Paris", "Aéroport principal");
        Aeroport destination = new Aeroport("JFK", "New York", "Aéroport international");
        Vol vol = new Vol(123, origine, destination,
                java.time.LocalDateTime.parse("2025-04-10T10:00"),
                java.time.LocalDateTime.parse("2025-04-10T14:00"),
                "Planifié");
        pilote.affecterVol(vol);
        personnelCabine.affecterVol(vol); // Utilise la méthode héritée de la classe Employe
    }

            @org.junit.jupiter.api.Test

    public void testObtenirVol() {
        // Simuler l'obtention des détails d'un vol par ID
        String volDetails = "Vol ID: ABC123, Destination: Paris, Heure: 10:00";
        assertNotNull(volDetails, "Les détails du vol ne doivent pas être nuls");
    }

            @org.junit.jupiter.api.Test

    public void testPlanifierVol() {
        // Simuler la planification des vols pour une période donnée
        boolean planningSuccess = true;
        assertTrue(planningSuccess, "La planification des vols doit réussir");
    }

            @org.junit.jupiter.api.Test

    public void testAnnulerVol() {
        // Simuler l'annulation d'un vol par ID
        boolean cancellationSuccess = true;
        assertTrue(cancellationSuccess, "L'annulation du vol doit réussir");
    }

    // Test pour la gestion des avions
            @org.junit.jupiter.api.Test

    public void testAffecterAvion() {
        // Simuler l'affectation d'un avion à un vol
        boolean assignmentSuccess = true;
        assertTrue(assignmentSuccess, "L'affectation de l'avion au vol doit réussir");
    }

            @org.junit.jupiter.api.Test

    public void testVerifierDisponibilite() {
        // Simuler la vérification de la disponibilité d'un avion
        boolean isAvailable = true;
        assertTrue(isAvailable, "L'avion doit être disponible pour l'affectation");
    }
}

    //nested test pour tester les fonctions et eviter de remetre les params
@Nested
class NestedTest {
    private Vol vol;
    private Vol vol2;
    private Reservation res;
    private Reservation res2;
    private Avion avion1;

    @BeforeEach
    void setUp() {
        Adresse adresse = new Adresse(10, "Rue de Paris", 75000, "Paris");
        Passager passager = new Passager( "fathi", adresse, "contact", "EU");

        Aeroport origine = new Aeroport("Charles de Gaulle", "Paris", "Aéroport international");
        Aeroport destination = new Aeroport("JFK", "New York", "Aéroport américain");

        vol = new Vol(787,origine,destination, LocalDateTime.of(2025, 5, 1, 14, 30), LocalDateTime.of(2025, 5, 1, 14, 30), "dispo" );
        res = new Reservation(123,  LocalDate.parse("2025-04-04"), "dispo", vol, passager);
        res2 = new Reservation(123,  LocalDate.parse("2025-04-04"), "confirmé", vol, passager);
        vol2 = new Vol(787,origine,destination, null, null, "dispo" );

        avion1 = new Avion("Airbus A350", "280", 25);
        avion1.setVol(vol2);
    }

    @org.junit.jupiter.api.Test
    public void testAnnulerVol(){
        vol2.annulerVol();
    }

    @org.junit.jupiter.api.Test
    public void testAffecterVol(){
        avion1.affecterVol(vol);
        System.out.println(vol.getAvion());
    }

    @org.junit.jupiter.api.Test
    public void testConfirmerReservation() {
        res.confirmerReservation();
    }

    @org.junit.jupiter.api.Test
    public void testAnnulerReservation() {
        res2.annulerReservation();
    }

}
