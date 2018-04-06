
package pkgPersonne;

public class Etudiant extends Personne {
    private String cursus;
    private String campus;
    private String promotion;
    
    public Etudiant (String nom, String prenom, String sexe, int anneeNaissance, String cursus, String campus, String promotion) {
        super(nom, prenom, sexe, anneeNaissance);
        this.cursus = cursus;
        this.campus = campus;
        this.promotion = promotion;  
    }
    
    public String getCursus() { return cursus;}
    public String getCampus() { return campus;}
    public String getPromotion() { return promotion;}
    
    public void setCursus (String cursus) { this.cursus = cursus;}
    public void setCampus (String campus) { this.campus = campus;}
    public void setPromotion (String promotion) { this.promotion = promotion;}
}
