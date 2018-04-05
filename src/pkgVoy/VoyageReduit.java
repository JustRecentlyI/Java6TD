
package pkgVoy;

public class VoyageReduit extends Voyage {
    
    private final ReelContraint tauxPromo;
    
    // Constructeur
    public VoyageReduit(String depart, String arrive, int distance, double coutKilometre, double tauxPromotion) {
        super(depart, arrive, distance, coutKilometre);
        tauxPromo = new ReelContraint (0.01, 0.99, tauxPromotion);
    }
    
    //Redéfinition getPrix et saisir
    
    public double getPrixKilometre(ReelContraint tauxPromo){
        double nvPrix;
        nvPrix = (1-tauxPromo.getVal()) * this.getPrixKilometre(); 
        return nvPrix;
    }
    
    public void saisir() {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Saisissez votre ville de départ :");
        setDepart(scan.nextLine());
        System.out.println("Saisissez votre ville d'arrivée :");
        setArrive(scan.nextLine());
        System.out.println("Saisissez votre distance :");
        setLongueur(scan.nextInt());
        System.out.println("Saisissez votre px / km :");
        setPrixKilometre(scan.nextDouble()); 
        System.out.println("Saisissez taux de réduction (de 0.01 à 0.99):");
        this.tauxPromo.setVal(scan.nextDouble()); 
        scan.nextLine();//vidage de buffer
    }
  
}
