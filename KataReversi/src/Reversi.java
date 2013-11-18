
public class Reversi {

	public String printLegalMoves(String input) {

		//-------------------------Creation Tableau------------------
		String[] tableau = input.split("\n");
		String joueurCourant = this.turnIsAt(input);
		//------------------------Gestion des lignes Joueur B----------------
		String output= "";
		for (int i = 0; i < tableau.length; i++) {
			Ligne ligne = new Ligne();
			/*if(joueurCourant.equals("B")){
				if(tableau[i].indexOf("B")<tableau[i].indexOf("W.") && tableau[i].indexOf("B")!=-1){
					tableau[i] = tableau[i].replace("W.","W0");
				}
				if(tableau[i].indexOf("B")>tableau[i].indexOf(".W") && tableau[i].indexOf("B")!=-1){
					tableau[i] = tableau[i].replace(".W","0W");
				}
			}
			else{
				//------------------------Gestion des lignes Joueur W----------------

				if(tableau[i].indexOf("W")<tableau[i].indexOf("B.") && tableau[i].indexOf("W")!=-1){
					tableau[i] = tableau[i].replace("B.","B0");
				}
				if(tableau[i].indexOf("W")>tableau[i].indexOf(".B") && tableau[i].indexOf("W")!=-1){
					tableau[i] = tableau[i].replace(".B","0B");
				}
			}*/					    	
			//-------------------Gestion des sauts de lignes à la sortie-------------------------
			if (i==tableau.length-1){
				output = output + ligne.retournePosition(joueurCourant,tableau[i]);
			}
			else
				output = output + ligne.retournePosition(joueurCourant,tableau[i]) + "\n";
		}
		System.out.println(output);
		return output;
	}

	/*-----------------------Savoir si le dernier carctère est B ou W-----------------------------*/
	public String turnIsAt(String input) {
		return input.substring(input.length()-1);
	}

}
