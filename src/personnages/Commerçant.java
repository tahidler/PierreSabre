package personnages;

public class Commer�ant extends Humain {
    
    public Commer�ant(String nom, int argent) {
        super(nom, "th�", argent);
    }

    public int seFaireExtorquer() {
        int montantExtorque = getArgent();
        perdreArgent(montantExtorque); // Utilise la m�thode de la classe parent
        parler("J�ai tout perdu! Le monde est trop injuste...");
        return montantExtorque;
    }

    public void recevoir(int argent) {
        gagnerArgent(argent); // Utilise la m�thode de la classe parent
        parler(argent + " sous! Je te remercie g�n�reux donateur!");
    }
}
