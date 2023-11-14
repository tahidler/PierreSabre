package personnages;

//public class Ronin extends Humain {
//    private int honneur = 1;
//
//    public Ronin(String nom, int argent) {
//        super(nom, "shochu", argent);
//    }
//
//    public void donner(Commerçant beneficiaire) {
//    	int montantDonne = (int) (0.1 * getArgent()); // Calcul de 10% de l'argent du ronin
//    }
//        perdreArgent(montantDonne);
//        parler(beneficiaire.getNom() + " prend ces " + montantDonne + " sous.");
//        beneficiaire.recevoir(montantDonne);
//    }
////}


public class Ronin extends Humain {
    private int honneur;

    public Ronin(String nom, int argent) {
        super(nom, "Thé", argent); // boisson par défaut définie comme "Thé"
        this.honneur = 5; 
    }

    public void sePresenter() {
        System.out.println("(" + nom + ") - Je suis un Ronin!");
    }

    
    public void perdreArgent(int montant) {
        this.argent -= montant;
        if (this.argent < 0) { // Si le Ronin n'a pas assez d'argent
            this.argent = 0; // Son argent ne devrait pas être négatif
        }
    }

    
    
    public void donner(Commercant commercant) {
        int montantADonner = 10; // Par exemple, vous pouvez définir une logique pour le montant à donner
        this.perdreArgent(montantADonner); // Le Ronin perd de l'argent
        commercant.recevoirArgent(montantADonner); // Le Commerçant reçoit de l'argent
    }

    
    
    
    
    
    
    public void provoquer(Yakuza yakuza) {
        int force = this.honneur * 2;

        if (force >= yakuza.getReputation()) {
            this.ajouterArgent(yakuza.getArgent());
            yakuza.perdre();
            System.out.println("(" + nom + ") - Je t'ai eu petit yakuza!");
        } else {
            this.argent = 0;
            this.honneur--;
            yakuza.gagner(this.argent);
            System.out.println("(" + nom + ") - J'ai perdu contre le yakuza...");
        }
    }
}
