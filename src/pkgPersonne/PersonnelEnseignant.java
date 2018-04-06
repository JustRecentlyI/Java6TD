
package pkgPersonne;


public abstract class PersonnelEnseignant extends Personnel {
    private int[] classes;
    
    public PersonnelEnseignant (String nom, String prenom, String sexe, int anneeNaissance, String numBureau, int anneeRecrutement, int[] classes) {
        super(nom, prenom, sexe, anneeNaissance, numBureau, anneeRecrutement);
        this.classes = classes; 
    }
    
    public int[] getClasses () {return classes;}
    
    public void setClasses (int[] classes) {this.classes = classes;}
}


