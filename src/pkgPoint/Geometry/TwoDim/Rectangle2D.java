package pkgPoint.Geometry.TwoDim;
import java.util.Objects;
import pkgPoint.Geometry.FigGeo2D;
import pkgPoint.Geometry.ZeroDim.Point2D;
import pkgPoint.Geometry.OneDim.Segment2D;

/**
 * Décrivez votre classe Rectangle2D ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */

public class Rectangle2D implements Cloneable, FigGeo2D{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int x;
    Point2D a;
    Point2D b;
    Point2D c;
    Point2D d;
    private final Segment2D ab;
    private final Segment2D bc;
    private final Segment2D cd;
    private final Segment2D ad;
    
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
    
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true ;
        if(obj==null) return false ;
        if(getClass() != obj.getClass()) return false ;
        Rectangle2D r = (Rectangle2D) obj ;
        return this.a.equals(r.a) && this.b.equals(r.b) && this.c.equals(r.c) && this.d.equals(r.d) ;
    }
    //hashcode généré automatiquement par NetBeans
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.a);
        hash = 79 * hash + Objects.hashCode(this.b);
        hash = 79 * hash + Objects.hashCode(this.c);
        hash = 79 * hash + Objects.hashCode(this.d);
        return hash;
    }

    @Override
    public void deplace(float dx, float dy) {
        this.a.deplace(dx, dy);
        this.b.deplace(dx, dy);
        this.c.deplace(dx, dy);
        this.d.deplace(dx, dy);
        this.ab.deplace(dx, dy);
        this.ab.deplace(dx, dy);
        this.bc.deplace(dx, dy);
        this.cd.deplace(dx, dy);
    }

    @Override
    public boolean estIdentique(Object o) {
        return this.equals(o);
    }

    @Override
    public void affiche() {
        System.out.println("Rectangle abcd de coordonnées :");
        System.out.print("a : ");
        this.a.affiche();
        System.out.print("b : ");
        this.a.affiche();
        System.out.print("c : ");
        this.a.affiche();
        System.out.print("d : ");
        this.a.affiche();
    }
    
    @Override
    public Rectangle2D clone(){
        return new Rectangle2D(this.a.clone(), (float)ab.longueur(), (float)ad.longueur());
    }
}
