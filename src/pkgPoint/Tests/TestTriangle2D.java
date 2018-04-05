package pkgPoint.Tests;
import pkgPoint.Geometry.ZeroDim.Point2D;
import pkgPoint.Geometry.OneDim.Segment2D;
import pkgPoint.Geometry.TwoDim.Triangle2D;
import pkgPoint.Geometry.TwoDim.Rectangle2D;
import java.util.Scanner;

/**
 * Décrivez votre classe TestTriangle2D ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class TestTriangle2D
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Veuillez saisir les coordonnées des points du triangle ABC :");
        System.out.println("Saisie xA :");
        float x1 = sc.nextInt();
        System.out.println("Saisie yA :");
        float y1 = sc.nextInt();
        Point2D a = new Point2D(x1,y1);
        
        System.out.println("Saisie xB :");
        float x2 = sc.nextInt();
        System.out.println("Saisie yB :");
        float y2 = sc.nextInt();
        Point2D b = new Point2D(x2,y2);
        
        System.out.println("Saisie xC :");
        float x3 = sc.nextInt();
        System.out.println("Saisie yC :");
        float y3 = sc.nextInt();
        Point2D c = new Point2D(x3,y3);
        
        Triangle2D abc = new Triangle2D(a,b,c);
        abc.afficheP();
        abc.afficheA();
    }
}
