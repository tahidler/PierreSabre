package personnages;


public class Humain {
   
    private String nom;
    private String boissonFavorite;
    private int argent;
    
    // constructeur
    public Humain(String nom, String boissonFavorite, int argent) {
        this.nom = nom;
        this.boissonFavorite = boissonFavorite;
        this.argent = argent;
    }
    
    
    public String getNom() {
        return nom;
    }
    
    public int getArgent() {
        return argent;
    }
    
    
    private void parler(String texte) {
        System.out.println("(" + nom + ") - " + texte);
    }

    public void direBonjour() {
        parler("Bonjour! Je m�appelle " + nom + " et j�aime boire du " + boissonFavorite + ".");
    }
    
    public void boire() {
        parler("Mmmm, un bon verre de " + boissonFavorite + "! GLOUPS!");
    }
    
    public void acheter(String bien, int prix) {
        if (argent >= prix) {
            parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir une " + bien + " � " + prix + " sous.");
            argent -= prix;
        } else {
            parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux m�me pas m'offrir un " + bien + " � " + prix + " sous.");
        }
    }


    
    public void gagnerArgent(int gain) {
        argent += gain;
    }

    public void perdreArgent(int perte) {
        argent -= perte;
    }
}
