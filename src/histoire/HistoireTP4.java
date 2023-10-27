package histoire;

import personnages.Humain;
import personnages.Commerçant;
import personnages.Yakuza;

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

public class HistoireTP4 {
    public static void main(String[] args) {
        Commerçant marco = new Commerçant("Marco", 20);
        Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", 30, "Warsong");
        
        yakuLeNoir.direBonjour();
        yakuLeNoir.extorquer(marco);
    }
}
