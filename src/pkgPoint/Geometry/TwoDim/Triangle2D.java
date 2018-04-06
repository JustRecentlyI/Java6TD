package pkgPoint.Geometry.TwoDim;
import java.util.Objects;
import pkgPoint.Geometry.ZeroDim.Point2D;
import pkgPoint.Geometry.OneDim.Segment2D;
import pkgPoint.Geometry.FigGeo2D;
/**
 * Décrivez votre classe Triangle2D ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Triangle2D implements FigGeo2D, Cloneable
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private final Segment2D ab;
    private final Segment2D ac;
    private final Segment2D bc;
    

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
    
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true ;
        if(obj==null) return false ;
        if(getClass() != obj.getClass()) return false ;
        Triangle2D t = (Triangle2D) obj ;
        return this.ab.equals(t.ab) && this.ac.equals(t.ac) && this.bc.equals(t.bc);
    }
    //hashcode généré automatiquement par NetBeans
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.ab);
        hash = 13 * hash + Objects.hashCode(this.ac);
        hash = 13 * hash + Objects.hashCode(this.bc);
        return hash;
    }

    @Override
    public void deplace(float dx, float dy) {
        ab.deplace(dx, dy);
        ac.deplace(dx, dy);
        bc.deplace(dx, dy);
    }

    @Override
    public boolean estIdentique(Object o) {
        return equals(o);
    }

    @Override
    public void affiche() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Triangle2D clone(){
        return new Triangle2D(ab.getP1().clone(), ac.getP2().clone(), bc.getP1().clone());
    }
}
