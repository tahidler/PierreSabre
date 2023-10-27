package histoire;

import personnages.Humain;
import personnages.Commerçant;
import personnages.Yakuza;
import personnages.Ronin;

//public class HistoireTP4 {
	
//    public static void main(String[] args) {
//        Humain prof = new Humain("Prof", "kombucha", 54);
//        
//        prof.direBonjour();
//        prof.acheter("boisson", 12);
//        prof.boire();
//        prof.acheter("jeu", 2);
//        prof.acheter("kimono", 50);
//        
//        
//    }
//}

//public class HistoireTP4{
//
//	public static void main(String[] args) {
//		Commerçant marco = new Commerçant("Marco", 20);
//    
//		marco.direBonjour();
//		marco.seFaireExtorquer();
//		marco.recevoir(15);
//		marco.boire();
//	}
//}

//public class HistoireTP4 {
//    public static void main(String[] args) {
//        Commerçant marco = new Commerçant("Marco", 20);
//        Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", 30, "Warsong");
//        
//        yakuLeNoir.direBonjour();
//        yakuLeNoir.extorquer(marco);
//    }
//}

//public class HistoireTP4 {
//    public static void main(String[] args) {
//        Commerçant Marco = new Commerçant("Marco", 20);
//        Ronin Roro = new Ronin("Roro", 60);
//
//        Roro.direBonjour();
//        Roro.donner(Marco);
//    }
//}


public class HistoireTP4 {

    public static void main(String[] args) {
        // Création des personnages
    	Commerçant marco = new Commerçant("Marco", 15);  // en supposant que 15 est l'argent initial.

    	Yakuza yaku = new Yakuza("Yaku Le Noir", 30);  // en supposant que 30 est l'argent initial.


    	Ronin rozo = new Ronin("Rozo", 60);  // en supposant que 60 est l'argent initial.


        // Scénario pour le Yakuza extorquant le commerçant
        yaku.sePresenter();
        yaku.extorquer(marco);

        // Scénario pour le Ronin donnant de l'argent au commerçant
        rozo.sePresenter();
        rozo.donner(marco);

        // Scénario de duel entre Ronin et Yakuza
        System.out.println("(Roro) - Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
        rozo.provoquer(yaku);

        // Modification de la réputation du Yakuza pour le prochain scénario
        yaku.setReputation(4);

        // Nouveau duel
        rozo.provoquer(yaku);
    }
}

