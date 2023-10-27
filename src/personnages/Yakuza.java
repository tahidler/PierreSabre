package personnages;

public class Yakuza extends Humain {
    
    private String clan;
    private int reputation;

    public Yakuza(String nom, int argent, String clan) {
        super(nom, "whisky", argent);
        this.clan = clan;
        this.reputation = 0;
    }

    public void extorquer(Commerçant victime) {
        parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
        parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
        
        int montantExtorque = victime.seFaireExtorquer();
        gagnerArgent(montantExtorque);
        reputation++;

        parler("J’ai piqué les " + montantExtorque + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");
    }

}
