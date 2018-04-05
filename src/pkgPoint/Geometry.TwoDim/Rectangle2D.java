package pkgPoint.Geometry;
import pkgPoint.Geometry.ZeroDim.Point2D;
import pkgPoint.Geometry.OneDim.Segment2D;

/**
 * Décrivez votre classe Rectangle2D ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */

public class Rectangle2D{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int x;
    Point2D a;
    Point2D b;
    Point2D c;
    Point2D d;
    private Segment2D ab;
    private Segment2D bc;
    private Segment2D cd;
    private Segment2D ad;
    
    /** Constructeur Rectangle2D */
    public Rectangle2D(Point2D a, float h, float l){
        this.a = a;
        b=new Point2D(a.getX(),a.getY()+h);
        c=new Point2D(a.getX()+l,a.getY()+h);
        d=new Point2D(a.getX()+l,a.getY());
        ab = new Segment2D(a,b);
        bc = new Segment2D(b,c);
        cd = new Segment2D(c,d);
        ad = new Segment2D(a,d);
    }

    public double perimetre(){
        double perim = ab.longueur()+bc.longueur()+cd.longueur()+ad.longueur();
        return perim;
    }
    
    public double aire(){
        double aire = ab.longueur()*bc.longueur();
        return aire;
    }
    
    public void afficheP(){
        System.out.println(perimetre());
    }
    
    public void afficheA(){
        System.out.println(aire());
    }
}
