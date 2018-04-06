/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgPoint.Geometry;
/**
 *
 * @author p1705387
 */
public abstract class FigureGeometrique {
    
    //les méthodes abstraites doivent être redéfinies dans une autre classe
    //elle ne peut pas être private
    public abstract void homothetie(double coef);
    public abstract void rotation(double angle);
    public abstract void identite();
    
    public void affiche(){
        System.out.println("Je suis une figure géométrique de type :");
        identite();
    }
    
    public static void afficheFigures(FigureGeometrique[] fg){
        for(int i = 0; i < fg.length; i++){
            fg[i].affiche();
        }
    }
    
    public static void homoethetieFigures(FigureGeometrique[] fg, double coef){
        for(int i = 0; i < fg.length; i++){
            fg[i].homothetie(coef);
        }
    }
    
    public static void rotationFigures(FigureGeometrique[] fg, double angle){
        for(int i = 0; i < fg.length; i++){
            fg[i].rotation(angle);
        }
    }
}
