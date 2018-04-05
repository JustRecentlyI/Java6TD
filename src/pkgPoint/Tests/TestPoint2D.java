package pkgPoint.Tests;
import pkgPoint.Geometry.ZeroDim.Point2D;
import java.util.Scanner;

/**
 * Décrivez votre classe TestPoint2D ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class TestPoint2D
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Veuillez saisir les coordonnées du point A :");
        System.out.println("Saisie xA :");
        float x1 = sc.nextInt();
        System.out.println("Saisie yA :");
        float y1 = sc.nextInt();
        Point2D a = new Point2D(x1,y1);
        a.affiche();
        
        System.out.println("Veuillez saisir les coordonnées du point A :");
        System.out.println("Saisie xB :");
        float x2 = sc.nextInt();
        System.out.println("Saisie yB :");
        float y2 = sc.nextInt();
        Point2D b = new Point2D(x2,y2);
        b.affiche();
        
        System.out.println("Dist entre a et b : "+a.distance(b));
        
        System.out.println("Veuillez saisir le vecteur de déplacement du point B :");
        System.out.println("Saisie Vx :");
        x2 = sc.nextInt();
        System.out.println("Saisie Vy :");
        y2 = sc.nextInt();
        b.deplace(x2,y2);
        b.affiche();
        
        System.out.println("Dist entre a et b : "+a.distance(b));
    }
}
