package org.example.pojo;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    //attribut : propriété de l'objet
    // propriété de mon Garage

    /**
     * encapsulation
     * private : seule la classe courante à accès à l'information
     * public : tout le monde à accès à l'information
     * protected : seules les classes filles et la classe courante ont accès à l'information
     */
    private String nom;

    private String adresse;

    private Integer nombrePlaceVoiture;

    private List<Voiture> voitureList;

    //Constructeur : permet de dire : comment construire le garage ?
    public Garage(){
        //constructeur par defaut
    }

    public Garage(String nom, String adresse, Integer nombrePlaceVoiture) {
        this.nom = nom;
        this.adresse = adresse;
        this.nombrePlaceVoiture = nombrePlaceVoiture;
        voitureList = new ArrayList<>();
    }

    public String toString(){
        return "bonjour je suis le garage " + nom + ", je suis à l'adresse " + adresse +
                ", je peux stocker " + nombrePlaceVoiture + " voitures.";
    }

    //getter et setter
    // accesseur et mutateur
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Integer getNombrePlaceVoiture() {
        return nombrePlaceVoiture;
    }

    public void setNombrePlaceVoiture(Integer nombrePlaceVoiture) {
        this.nombrePlaceVoiture = nombrePlaceVoiture;
    }

    public List<Voiture> getVoitureList() {
        return voitureList;
    }

    public void setVoitureList(List<Voiture> voitureList) {
        this.voitureList = voitureList;
    }
}
