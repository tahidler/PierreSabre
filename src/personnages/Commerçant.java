package personnages;

public class Commerçant extends Humain {
    
    public Commerçant(String nom, int argent) {
        super(nom, "th�", argent);
    }

    public int seFaireExtorquer() {
        int montantExtorque = 15;
        if(getArgent() < montantExtorque) {
            montantExtorque = getArgent();
        }
        perdreArgent(montantExtorque);
        parler("J’ai tout perdu! Le monde est trop injuste...");
        return montantExtorque;
    }


    public void recevoir(int argent) {
        gagnerArgent(argent); // Utilise la m�thode de la classe parent
        parler(argent + " sous! Je te remercie g�n�reux donateur!");
    }
}
