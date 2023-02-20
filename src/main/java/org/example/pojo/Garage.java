package org.example.pojo;

public class Garage {

    //attribut : propriété de l'objet
    // propriété de mon Garage
    String nom;

    String adresse;

    Integer nombrePlaceVoiture;

    //Constructeur : permet de dire : comment construire le garage ?
    public Garage(){
        //constructeur par defaut
    }

    public Garage(String nom, String adresse, Integer nombrePlaceVoiture) {
        this.nom = nom;
        this.adresse = adresse;
        this.nombrePlaceVoiture = nombrePlaceVoiture;
    }

    public String toString(){
        return "bonjour je suis le garage " + nom + ", je suis à l'adresse " + adresse +
                ", je peux stocker " + nombrePlaceVoiture + " voitures.";
    }
}
