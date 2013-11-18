
public class Ligne {

	public String retournePosition(String joueurCourant, String ligne) {
		// TODO Auto-generated method stub
		if(joueurCourant.equals("B")){
			if(ligne.indexOf("B")<ligne.indexOf("W.") && ligne.indexOf("B")!=-1){
				ligne = ligne.replace("W.","W0");
			}
			if(ligne.indexOf("B")>ligne.indexOf(".W") && ligne.indexOf("B")!=-1){
				ligne = ligne.replace(".W","0W");
			}
		}			
		else{
			if(ligne.indexOf("W")<ligne.indexOf("B.") && ligne.indexOf("W")!=-1){
				ligne = ligne.replace("B.","B0");
			}
			if(ligne.indexOf("W")>ligne.indexOf(".B") && ligne.indexOf("W")!=-1){
				ligne = ligne.replace(".B","0B");
			}
		}
		return ligne;
	}

}
