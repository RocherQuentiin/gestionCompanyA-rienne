package fr.isep.models;

public class Avion {
    private String immatriculation;
    private String modele;
    private int capacite;
    private Vol vol;

    public Avion(String immatriculation, String modele, int capacite) {
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.capacite = capacite;
    }

    public void affecterVol() {
        System.out.println("Vol affecté à l'avion.");
    }

    public boolean verifierDisponibilite() {
        System.out.println("Disponibilité vérifiée.");
        return true;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public Vol getVol() {
        return vol;
    }
    public void setVol(Vol vol) {
        this.vol = vol;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "immatriculation='" + immatriculation + '\'' +
                ", modele='" + modele + '\'' +
                ", capacite=" + capacite +
                '}';
    }

}