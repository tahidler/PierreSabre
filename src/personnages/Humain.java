package personnages;

import java.util.LinkedHashSet;
import java.util.Set;
//
//
//public class Humain {
//   
//    //private String nom;
//    private String boissonFavorite;
//    private int argent;
//    
//    protected String nom;
//    protected String boisson;
//    
//    
//    // constructeur
//    public Humain(String nom, String boissonFavorite, int argent, String boisson) {
//        this.nom = nom;
//        this.boissonFavorite = boissonFavorite;
//        this.argent = argent;
//        this.boissonFavorite  = boisson;
//    }
//    
//    
//    public String getNom() {
//        return nom;
//    }
//    
////    public int getArgent() {
////        return argent;
////        
////    }
////    
//    protected int getArgent() {
//        return argent;
//    }
//
//    
//    
////    private void parler(String texte) {
////        System.out.println("(" + nom + ") - " + texte);
////    }
////    
//    
//    protected void parler(String texte) {
//        System.out.println("(" + getNom() + ") - " + texte);
//    }
//
//    public void direBonjour() {
//        parler("Bonjour! Je m�appelle " + nom + " et j�aime boire du " + boissonFavorite + ".");
//    }
//    
//    public void boire() {
//        parler("Mmmm, un bon verre de " + boissonFavorite + "! GLOUPS!");
//    }
//    
//    public void ajouterArgent(int montant) {
//        this.argent += montant;
//    }
//
//    public void acheter(String bien, int prix) {
//        if (argent >= prix) {
//            parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir une " + bien + " � " + prix + " sous.");
//            argent -= prix;
//        } else {
//            parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux m�me pas m'offrir un " + bien + " � " + prix + " sous.");
//        }
//    }
//    
//    
//    
//    public void setArgent(int montant) {
//        this.argent = montant;
//    }
//
//
//
//    
////    public void gagnerArgent(int gain) {
////        argent += gain;
////    }
////    
//    protected void gagnerArgent(int gain) {
//        argent += gain;
//    }
//
////    public void perdreArgent(int perte) {
////        argent -= perte;
////    }
////    
//    
//    protected void perdreArgent(int perte) {
//        argent -= perte;
//    }
//}
//
//

public class Humain {

	protected String nom;
	protected String boisson;
	protected int argent;
	protected int nbConnaissance;
	protected Set<Humain> memoire;

	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
		this.nbConnaissance = 0;
		this.memoire = new LinkedHashSet<>();
	}

	public void faireConnaissanceAvec(Humain autreHumain) {
		if (this.memoire.size() >= 30) {

			this.memoire.remove(this.memoire.iterator().next());
		}

		if (!this.memoire.contains(autreHumain)) {
			this.memoire.add(autreHumain);
			autreHumain.memoire.add(this);
			this.direBonjour();
			autreHumain.direBonjour();
		}
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boisson + ".");
	}

	public void parler(String texte) {
		System.out.println(texte);
	}

	public void listerConnaissance() {
		if (memoire.isEmpty()) {
			System.out.println(this.nom + " ne se souvient de personne.");
		} else {
			System.out.println(this.nom + " se souvient des personnes suivantes :");
			for (Humain humain : memoire) {
				System.out.println("- " + humain.nom);
			}
		}
	}

	// Getter pour l'argent
	public int getArgent() {
		return argent;
	}

	// Setter pour l'argent
	public void setArgent(int argent) {
		this.argent = argent;
	}

	// Méthode pour ajouter de l'argent
	public void ajouterArgent(int montant) {
		this.argent += montant;
	}

	// ... autres méthodes et attributs ...
}
