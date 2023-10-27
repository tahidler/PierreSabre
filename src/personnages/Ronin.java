package personnages;

public class Ronin extends Humain {
    private int honneur = 1;

    public Ronin(String nom, int argent) {
        super(nom, "shochu", argent);
    }

    public void donner(Commerçant beneficiaire) {
        int montantDonne = (int) (0.1 * getArgent()); // Calcul de 10% de l'argent du ronin
        perdreArgent(montantDonne);
        parler(beneficiaire.getNom() + " prend ces " + montantDonne + " sous.");
        beneficiaire.recevoir(montantDonne);
    }

}
