
public class Ligne {

	public String retournePosition(String joueurCourant, String ligne) {
		
		//------------------------ Appel à la gestion des lignes joueur B ----------------
		if(joueurCourant.equals("B")){
			return ligne = joueurCourantB(ligne);
		}			
		
		//------------------------Appel à la gestion des lignes joueur W ----------------
		return ligne = joueurCourantW(ligne);
	}

	//------------------------ Gestion des lignes joueur W ----------------
	public String joueurCourantW(String ligne) {
		if(ligne.indexOf("W")<ligne.indexOf("B.")){
			ligne = ligne.replace("B.","B0");
		}
		if(ligne.indexOf("W")>ligne.indexOf(".B")){
			ligne = ligne.replace(".B","0B");
		}
		return ligne;
	}

	//------------------------ Gestion des lignes joueur B ----------------
	public String joueurCourantB(String ligne) {
		if(ligne.indexOf("B")<ligne.indexOf("W.")){
			ligne = ligne.replace("W.","W0");
		}
		if(ligne.indexOf("B")>ligne.indexOf(".W")){
			ligne = ligne.replace(".W","0W");
		}
		return ligne;
	}

}
