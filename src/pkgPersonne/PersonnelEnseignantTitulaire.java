
package pkgPersonne;


public class PersonnelEnseignantTitulaire extends PersonnelEnseignant {
    private int salaireHoraire;
    private int volHoraire;
    private int salaireHeureComplementaire;
    private int volHeureComplementaire;
    private String grade; 
    private int salaire;
    
    public PersonnelEnseignantTitulaire (String nom, String prenom, String sexe, int anneeNaissance, String numBureau, int anneeRecrutement, int[] classes, int salaireHoraire, int volHoraire, int salaireHeureComplementaire, int volHeureComplementaire, String grade) {
        super(nom, prenom, sexe, anneeNaissance, numBureau, anneeRecrutement, classes);
        this.salaireHoraire = salaireHoraire;
        this.volHoraire = volHoraire;
        this.salaireHeureComplementaire = salaireHeureComplementaire;
        this.volHeureComplementaire = volHeureComplementaire;
        this.grade = grade;
        salaire = volHoraire * salaireHoraire + salaireHeureComplementaire * volHeureComplementaire;
    }
        
        public int getSalaireHoraire () {return salaireHoraire;}
        public int getVolHoraire () {return volHoraire;}
        public int getSalaireHeureComplementaire () {return salaireHeureComplementaire;}
        public int getVolHoraireComplementaire () {return volHeureComplementaire;}
        public int getSalaire () {return salaire;}
        public String getNomPoste () {return grade;}


        public void setSalaireHoraire (int salaireHoraire) {this.salaireHoraire = salaireHoraire;}
        public void setVolHoraire (int volHoraire) {this.volHoraire = volHoraire;}
        public void setSalaireHeureComplementaire (int salaireHeureComplementaire) {this.salaireHeureComplementaire = salaireHeureComplementaire;}
        public void setVolHeureComplementaire (int volHeureComplementaire) {this.volHeureComplementaire = volHeureComplementaire;}
        public void setNomPoste (String nomPoste) {this.grade = nomPoste;}
}
