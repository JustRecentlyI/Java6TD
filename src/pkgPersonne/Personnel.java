package pkgPersonne;

public abstract class Personnel extends Personne {
    private String numBureau; // peut contenir des lettres
    private int anneeRecrutement;
    
    
    public Personnel (String nom, String prenom, String sexe, int anneeNaissance, String numBureau, int anneeRecrutement) {
        super(nom, prenom, sexe, anneeNaissance);
        this.numBureau = numBureau;
        this.anneeRecrutement = anneeRecrutement;  
    }
    
    public String getNumBureau () {return numBureau;}
    public int getAnneeRecrutement () {return anneeRecrutement;}
    
    public void setNumBureau (String numBureau) {this.numBureau = numBureau;}
    public void setAnneeRecrutement (int anneeRecrutement) {this.anneeRecrutement = anneeRecrutement;}
}
