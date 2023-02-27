package org.example;


import org.example.pojo.Garage;
import org.example.pojo.TypeCarburant;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //monGarage est une instance de Garage
        //monGarage est une version de Garage
        Garage monGarage = new Garage("Garage un","2 rue du pont",2);
        System.out.println(monGarage.getNom());
        monGarage.setNom("Toto");
        System.out.println(monGarage.getNom());

    }
}
