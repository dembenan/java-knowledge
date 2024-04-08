package com.sidem;

abstract class Forme {
    String coleur;
    // Méthodes abstraites
    abstract double surface();
    public abstract String toString();

    // Classe abstraite peut avoir un constructeur
    public Forme(String coleur) {
        System.out.println("Constructeur de la classe Forme est appelé");
        this.coleur = coleur;
    }
    // Méthode concrète
    public String getColeur() {
        return coleur;
    }
}

class Cercle extends Forme {
    double rayon;

    public Cercle(String coleur, double rayon) {

        // appel du constructeur de la classe Forme
        super(coleur);
        System.out.println("Constructeur de la classe Cercle est appelé");
        this.rayon = rayon;
    }

    @Override
    double surface() {
        return Math.PI * Math.pow(rayon, 2);
    }

    @Override
    public String toString() {
        return "La couleur de la cercle est " + super.coleur +
                " et la surface est : " + surface();
    }

}

class Rectangle extends Forme{

    double longueur;
    double largeur;

    public Rectangle(String coleur, double longueur, double largeur) {
        // appel du constructeur de la classe Forme
        super(coleur);
        System.out.println("Constructeur de la classe Rectangle est appelé");
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    double surface() {
        return longueur * largeur;
    }

    @Override
    public String toString() {
        return "La couleur de la rectangle est " + super.coleur +
                " et la surface est : " + surface();
    }

}
public class Abstraction {
    public static void main(String[] args)
    {
        Forme f1 = new Cercle("Bleu", 3.2);
        Forme f2 = new Rectangle("Rouge", 3, 6);

        System.out.println(f1.toString());
        System.out.println(f2.toString());
    }
}


