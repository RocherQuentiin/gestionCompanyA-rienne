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

    public void affecterVol(Vol vol) {
        if (verifierDisponibilite(vol)){
            vol.setAvion(this);
            System.out.println("le vol a bien ete affecter");
        }
        else {
            System.out.println("le vol n'est pas disponible");
        }
    }

    public boolean verifierDisponibilite(Vol vol) {
        if (vol.getAvion() == null) {
            return true;
        }
        else {
            return false;
        }
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