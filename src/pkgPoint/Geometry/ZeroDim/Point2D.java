package pkgPoint.Geometry.ZeroDim;
import pkgPoint.Geometry.FigGeo2D;
/**
 * Write a description of class Point2D here.
 *
 * @author Alexandre Arnaud - Corentin Besnard
 * @version 02/15/2018
 */
public class Point2D implements Cloneable, FigGeo2D
{
    // instance variables 
    private float x;
    private float y;
    
    /** Constructor for objects of class Point2D */
    public Point2D(){
        Point2D p = new Point2D(0,0);
    }
    
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public void deplace(float dx, float dy){
        x = dx + x;
        y = dy + y;
    }
    
    public double distance(Point2D p2){
        double distance = Math.sqrt(Math.pow((p2.getX()-this.getX()),2)+Math.pow((p2.getY()-this.getY()),2));
        return distance;
    }
    
    public void affiche(){
        System.out.println("coord = (" + x + ", " + y+")");
    }
    
    public float getX(){
        return x;
    }
    
    public float getY(){
        return y;
    }
    
    @Override
    public Point2D clone(){
        try{
            return (Point2D) super.clone();
        }
        catch (CloneNotSupportedException e ) {
            System.out.println("Cette classe n'implémente pas Cloneable");
            e.printStackTrace();
            return null;
        }
    }
    
    
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true ;
        if(obj==null) return false ;
        if(getClass() != obj.getClass()) return false ;
        Point2D p = (Point2D) obj ;
        return x==p.x && y==p.y ;
    }

    //hashcode géneré automatiquement par NetBeans
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Float.floatToIntBits(this.x);
        hash = 43 * hash + Float.floatToIntBits(this.y);
        return hash;
    }

    @Override
    public boolean estIdentique(Object o) {
        return this.equals(o);
    }
}
