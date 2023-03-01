package org.example;


import org.example.dao.MotorisationDao;
import org.example.dao.impl.MotorisationDaoImpl;
import org.example.pojo.*;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        MotorisationDao motorisationDao = new MotorisationDaoImpl();

        //Création d'un moteur
        motorisationDao.saveMotorisation(new Motorisation(TypeCarburant.DIESEL,
                150));
        motorisationDao.saveMotorisation(new Motorisation(TypeCarburant.ESSENCE,
                150));

        //recuperation des moteurs
        System.out.println(motorisationDao.getAllMotorisation());

        //suppression des moteurs diesel
        motorisationDao.deleteMotorisationByCarburant(TypeCarburant.DIESEL);

        //recuperation des moteurs
        System.out.println(motorisationDao.getAllMotorisation());

        /**
        Garage monGarage = createGarage();
        //System.out.println(monGarage);

        Garage unGarage = new Garage("toto","titi",2);
        boolean result = unGarage instanceof Garage;
        System.out.println("est ce que unGarage est un garage ? " + result);
        boolean resultTwo = unGarage instanceof Hangar;
        System.out.println("est ce que unGarage est un hangar ? " + resultTwo);

        Marque marque = new Marque("test");
         **/

    }

    public static Garage createGarage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer le nom d'un garage :");
        String nomGarage = sc.nextLine();
        System.out.println("Veuillez entrer l'adresse du garage : ");
        String adresseGarage = sc.nextLine();
        int nombrePlace = 0;
        boolean verif = false;

        while(!verif) {
            try {
                System.out.println("Veuillez entrer le nombre de place de votre garage : ");
                nombrePlace = sc.nextInt();
                verif = true;
            } catch (InputMismatchException exception) {
                System.out.println("bien essayé ! ");
                sc.next();
            }
        }

        return new Hangar(nomGarage,adresseGarage,nombrePlace);
    }
}
