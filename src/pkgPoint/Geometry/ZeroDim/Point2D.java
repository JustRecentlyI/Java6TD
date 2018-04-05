package pkgPoint.Geometry.ZeroDim;

/**
 * Write a description of class Point2D here.
 *
 * @author Alexandre Arnaud - Corentin Besnard
 * @version 02/15/2018
 */
public class Point2D
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
}
