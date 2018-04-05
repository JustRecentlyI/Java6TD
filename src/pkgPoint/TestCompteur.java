/**
 * Décrivez votre classe Test ici.
 *
 * @author Besnard Corentin - Alexandre Arnaud
 * @version 26/01/18
 */

import java.util.Scanner;

public class TestCompteur
{
    public static void main(String[] args){
        int cpt,init;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Veuillez saisir le nombre de compteur voulu :");
            cpt = sc.nextInt();
        }while(cpt<0);
        Compteur [] tabC = new Compteur[cpt];
        
        do{
            System.out.println("Veuillez saisir une valeur initiale :");
            init = sc.nextInt();
        }while(init<0);
        
        for(int i=0; i<cpt;i++){
            /* Enregistrement des compteurs */
            tabC[i] = new Compteur(init);
            System.out.print("Création du compteur "+i+" ,");
            tabC[i].afficheId();
        }
        tabC[1].afficheNbObjet();
        
        
    }
}
