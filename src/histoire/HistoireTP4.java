package histoire;

import personnages.Humain;
import personnages.Commer�ant;



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

public class HistoireTP4{

	public static void main(String[] args) {
		Commer�ant marco = new Commer�ant("Marco", 20);
    
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
	}
}