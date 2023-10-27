package personnages;

//public class Commerçant extends Humain {
//    
//    public Commerçant(String nom, int argent) {
//        super(nom, "th�", argent);
//    }
//
//    public int seFaireExtorquer() {
//        int montantExtorque = 15;
//        if(getArgent() < montantExtorque) {
//            montantExtorque = getArgent();
//        }
//        perdreArgent(montantExtorque);
//        parler("J’ai tout perdu! Le monde est trop injuste...");
//        return montantExtorque;
//    }
//
//

//    
//    
//		public void recevoir(int argent) {
//        gagnerArgent(argent);
//        parler(argent + " sous ! Je te remercie généreux donateur!");
//    }    
//
//}

public class Commerçant {
    private String nom;
    private int argent;

    public Commerçant(String nom, int argent) {
        this.nom = nom;
        this.argent = argent;
    }

  
    public String getNom() {
        return this.nom;
    }

    public void recevoirArgent(int montant) {
        this.argent += montant; // Augmente la quantité d'argent du Commerçant de 'montant'
    }
    
    
    
    public int donnerArgent() {
        int montant = this.argent;
        this.argent = 0;
        return montant;
    }
}
