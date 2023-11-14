package personnages;

//public class Yakuza extends Humain {

//    
//    private String clan;
//    private int reputation;
//
//    public Yakuza(String nom, int argent, String clan) {
//        super(nom, "whisky", argent);
//        this.clan = clan;
//        this.reputation = 0;
//    }
//
//    public void extorquer(Commerçant victime) {
//        parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
//        parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
//        
//        int montantExtorque = victime.seFaireExtorquer();
//        gagnerArgent(montantExtorque);
//        reputation++;
//
//        parler("J’ai piqué les " + montantExtorque + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");
//    }
//
//}

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boissonFav, int argent, String clan) {
		super(nom, boissonFav, argent);
		this.clan = clan;
	}

	public void sePresenter() {
		System.out.println("(" + nom + ") - Je suis un Yakuza!");
	}

	public void extorquer(Commercant commercant) {
		this.ajouterArgent(commercant.donnerArgent());
		System.out.println("(" + nom + ") - J'ai extorqué de l'argent!");
	}

	public void perdre() {
		this.argent = 0;
		this.reputation--;
		System.out.println("(" + nom + ") - J'ai perdu mon duel et mon argent...");
	}

	public void gagner(int gain) {
		this.ajouterArgent(gain);
		this.reputation++;
		System.out.println("(" + nom + ") - J'ai gagné le duel et " + gain + " sous!");
	}

	public int getReputation() {
		return reputation;
	}

	public void setReputation(int reputation) {
		this.reputation = reputation;
	}
}
