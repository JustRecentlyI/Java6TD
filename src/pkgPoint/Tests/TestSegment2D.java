package pkgPoint.Tests;
import pkgPoint.Geometry.ZeroDim.Point2D;
import pkgPoint.Geometry.OneDim.Segment2D;
import java.util.Scanner;

/**
 * Décrivez votre classe TestSegment2D ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class TestSegment2D
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
        
        System.out.println("Veuillez saisir les coordonnées du point B :");
        System.out.println("Saisie xB :");
        float x2 = sc.nextInt();
        System.out.println("Saisie yB :");
        float y2 = sc.nextInt();
        Point2D b = new Point2D(x2,y2);
        b.affiche();
        
        Segment2D ab = new Segment2D(a,b);
        ab.affiche();
        
        System.out.println("Veuillez saisir le vecteur de déplacement du point A :");
        System.out.println("Saisie VxA :");
        float dx1 = sc.nextInt();
        System.out.println("Saisie VyA :");
        float dy1 = sc.nextInt();
        ab.deplaceP1(dx1,dy1);
        a.affiche();
        
        System.out.println("Veuillez saisir le vecteur de déplacement du point B :");
        System.out.println("Saisie VxB :");
        float dx2 = sc.nextInt();
        System.out.println("Saisie VyB :");
        float dy2 = sc.nextInt();
        ab.deplaceP2(dx2,dy2);
        b.affiche();
        ab.affiche();
        
    }
}
