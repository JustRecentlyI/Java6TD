
package pkgPersonne;

public class PersonnelAdministratif extends Personnel {
    private int salaireHoraire;
    private int volHoraire;
    private String nomPoste; 
    private int salaire;
    
    public PersonnelAdministratif (String nom, String prenom, String sexe, int anneeNaissance, String numBureau, int anneeRecrutement, int salaireHoraire, int volHoraire, String nomPoste) {
        super(nom, prenom, sexe, anneeNaissance, numBureau, anneeRecrutement);
        this.salaireHoraire = salaireHoraire;
        this.volHoraire = volHoraire;
        this.nomPoste = nomPoste;
        salaire = volHoraire * salaireHoraire;       
    }
    
    public int getSalaireHoraire () {return salaireHoraire;}
    public int getVolHoraire () {return volHoraire;}
    public int getSalaire () {return salaire;}
    public String getNomPoste () {return nomPoste;}
    
    
    public void setSalaireHoraire (int salaireHoraire) {this.salaireHoraire = salaireHoraire;}
    public void setVolHoraire (int volHoraire) {this.volHoraire = volHoraire;}
    public void setNomPoste (String nomPoste) {this.nomPoste = nomPoste;}
}
