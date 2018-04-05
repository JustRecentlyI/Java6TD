/**
 * Write a description of class Compteur here.
 *
 * @author Alexandre Arnaud - Corentin Besnard
 * @version 15/02/2018
 */

import java.util.Scanner;

public class Compteur{
    private static int idObjet;
    static int nbObjet;
    private static int init;
    
    Scanner sc = new Scanner(System.in);
    
    /** Constructeur Compteur */
    public Compteur(int x){
        idObjet = x + nbObjet;
        nbObjet++;
    }

    /** Affichage */
    public void afficheId(){
        System.out.println("il porte l'ID "+idObjet);
    }
    
    public void afficheNbObjet(){
        System.out.println("Il existe "+nbObjet+ " objets");
    }
       
    /** Getters */
    public int getId(){return idObjet;}
    static int getIdMax(){return nbObjet;}
    
}
