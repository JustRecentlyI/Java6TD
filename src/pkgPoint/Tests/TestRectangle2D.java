package pkgPoint.Tests;
import pkgPoint.Geometry.ZeroDim.Point2D;
import pkgPoint.Geometry.OneDim.Segment2D;
import pkgPoint.Geometry.TwoDim.Rectangle2D;
import java.util.Scanner;

/**
 * Décrivez votre classe TestRectangle2D ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class TestRectangle2D
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Veuillez saisir les coordonnées du premier point :");
        System.out.println("Saisie x :");
        float x1 = sc.nextInt();
        System.out.println("Saisie y :");
        float y1 = sc.nextInt();
        Point2D a = new Point2D(x1,y1);
        
        System.out.println("Saisie d'une hauteur :");
        float h = sc.nextInt();
        System.out.println("Saisie d'une largeur :");
        float l = sc.nextInt();
        
        Rectangle2D abcd = new Rectangle2D(a,h,l);
        abcd.afficheP();
        abcd.afficheA();
    }
}
