package fr.isep.models;

public class PersonnelCabine extends Employe {
    private String qualification;

    public PersonnelCabine(int identifiant, String nom, String adresse, String contact, int numeroEmploye, String dateEmbauche, String qualification) {
        super(identifiant, nom, adresse, contact, numeroEmploye, dateEmbauche);
        this.qualification = qualification;
    }

    @Override
    public String obtenirRole() {
        return "Personnel Cabine";
    }

    public void affecterVol() {
        System.out.println("Vol affecté au personnel cabine.");
    }

    public void obtenirVol() {
        System.out.println("Liste des vols du personnel cabine.");
    }

    // Getters and Setters
}