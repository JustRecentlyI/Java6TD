package pkgPoint.Geometry.OneDim;
import pkgPoint.Geometry.ZeroDim.Point2D;

/**
 * Write a description of class Segment2D here.
 *
 * @author Alexandre Arnaud - Corentin Besnard
 * @version 15/02/2018
 */

public class Segment2D
{
    // instance variables - replace the example below with your own
    private Point2D p1;
    private Point2D p2;

    /**
     * Constructor for objects of class Segment2D
     */
    public Segment2D(Point2D p1, Point2D p2){
        // initialise instance variables
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public double longueur(){
        double lg = Math.sqrt(Math.pow((p2.getX()-p1.getX()),2)+Math.pow((p2.getY()-p1.getY()),2));
        //lg = lg*1000;lg=Math.round(lg);lg=lg/1000;
        return lg;
    }

    public void deplaceP1(float dxP1, float dyP1){
        p1.deplace(dxP1,dyP1);
    }
    
    public void deplaceP2(float dxP2, float dyP2){
        p2.deplace(dxP2,dyP2);
    }
    
    public void affiche(){
        System.out.println("Segment de longueur : "+longueur());
    }
    
    public Point2D getP1(){
        return p1;
    }
    
    public Point2D getP2(){
        return p2;
    }
}
