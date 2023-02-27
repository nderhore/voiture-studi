package org.example.pojo;

public class Voiture {

    String immatriculation;

    Modele modele;

    Motorisation motorisation;

    Integer nombrePorte;

    public Voiture(String immatriculation, Modele modele, Motorisation motorisation, Integer nombrePorte) {
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.motorisation = motorisation;
        this.nombrePorte = nombrePorte;
    }
}
