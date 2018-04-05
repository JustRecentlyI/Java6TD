package pkgPoint.Geometry;
import pkgPoint.Geometry.ZeroDim.Point2D;
import pkgPoint.Geometry.OneDim.Segment2D;

/**
 * Décrivez votre classe Triangle2D ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Triangle2D
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int x;
    private Segment2D ab;
    private Segment2D ac;
    private Segment2D bc;
    

    /** Constructeur Triangle2D */
    public Triangle2D(Point2D a, Point2D b, Point2D c){
        ab = new Segment2D(a,b);
        ac = new Segment2D(a,c);
        bc = new Segment2D(b,c);
    }

    public double perimetre(){
        double perim = ab.longueur()+ac.longueur()+bc.longueur();
        return perim;
    }
    
    public double aire(){
        double c = ab.longueur();
        double b = ac.longueur();
        double a = bc.longueur();
        double p = (a+b+c)/2;
        double aire = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return aire;
    }
    
    public void afficheP(){
        System.out.println(perimetre());
    }
    
    public void afficheA(){
        System.out.println(aire());
    }
}
