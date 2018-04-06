
package pkgPersonne;

public abstract class Personne {
    private String nom;
    private final String prenom;
    private final String sexe;
    private final int anneeNaissance;
    private static int nbPers = 0;
    private final int idPers;
    
    public Personne (String nom, String prenom, String sexe, int anneeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.anneeNaissance = anneeNaissance;
        nbPers++;
        idPers = nbPers;
    }
    
    public String getNom() { return nom;}
    public String getPrenom() { return prenom;}
    public String getSexe() { return sexe;}
    public int getDateNaiss() { return anneeNaissance;}
    public int getNbPers() {return nbPers;}
    public int getIdPers() {return idPers;}
    
    public void setNom (String nom) { this.nom = nom; } // en cas de mariage
    
}
