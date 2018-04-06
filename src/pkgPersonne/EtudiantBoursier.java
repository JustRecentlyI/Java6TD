/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgPersonne;

/**
 *
 * @author alexa
 */
public class EtudiantBoursier extends Etudiant {
    private int montantBourse;
    
    public EtudiantBoursier (String nom, String prenom, String sexe, int anneeNaissance, String cursus, String campus, String promotion, int montantBourse){
        super(nom, prenom, sexe, anneeNaissance, cursus, campus, promotion);
        this.montantBourse = montantBourse;
    }
    
    public int getMontantBourse () { return montantBourse;}
    
    public void setMontantBourse (int montantBourse) { this.montantBourse = montantBourse;}
    
}
