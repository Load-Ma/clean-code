package ex3;

public class Animal {
    private final String nom;
    private final String type;
    private final String comportement;

    public Animal(String nom, String type, String comportement) {
        this.nom = nom;
        this.type = type;
        this.comportement = comportement;
    }

    public String getNom() {
        return nom;
    }

    public String getType() {
        return type;
    }

    public String getComportement() {
        return comportement;
    }

    @Override
    public String toString() {
        return nom + " " + type + " " + comportement;
    }
}