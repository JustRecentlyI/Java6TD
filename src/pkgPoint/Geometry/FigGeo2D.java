/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgPoint.Geometry;
import pkgPoint.Affichable;
/**
 *
 * @author p1705387
 */
public interface FigGeo2D extends Affichable{
    void deplace(float dx, float dy);
    boolean estIdentique(Object o);
}
