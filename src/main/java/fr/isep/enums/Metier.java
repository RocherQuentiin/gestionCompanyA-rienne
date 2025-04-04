package fr.isep.enums;

/**
 * L'énumération Metier représente différents types de métiers associés à un identifiant unique.
 * Elle fournit des méthodes pour accéder à l'identifiant d'un métier et pour récupérer un métier
 * à partir de son identifiant.
 * 
 *   - PILOTE : Représente un pilote avec l'identifiant 1.
 *   - PERSONNEL_CABINE : Représente le personnel de cabine avec l'identifiant 2.
 *   - PASSAGER : Représente un passager avec l'identifiant 3.
 *   - AUTRE : Représente un métier non spécifié ou autre avec l'identifiant 4.
 * 
 * Méthodes principales :
 *   - {@link #getId()} : Retourne l'identifiant associé au métier.
 *   - {@link #fromId(int)} : Retourne le métier correspondant à un identifiant donné,
 *       ou AUTRE si aucun métier ne correspond.
 */
public enum Metier {
    PILOTE(1),
    PERSONNEL_CABINE(2),
    PASSAGER(3),
    AUTRE(4);

    private final int id;

    Metier(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static Metier fromId(int id) {
        for (Metier metier : values()) {
            if (metier.getId() == id) {
                return metier;
            }
        }
        return AUTRE;
    }
}
