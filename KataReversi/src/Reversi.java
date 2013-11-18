
public class Reversi {

	public String printLegalMoves(String input) {

		//-------------------------Creation Tableau------------------
		String[] tableau = input.split("\n");
		String joueurCourant = this.turnIsAt(input);
		//------------------------Gestion des lignes Joueur B----------------
		String output= "";
		for (int i = 0; i < tableau.length; i++) {
			Ligne ligne = new Ligne();
		    	
			output = sortieTableau(tableau, joueurCourant, output, i, ligne);
		}
		System.out.println(output);
		return output;
	}
	
	
	//-------------------Gestion des sauts de lignes à la sortie-------------------------
	public String sortieTableau(String[] tableau, String joueurCourant,
			String output, int i, Ligne ligne) {
		if (i==tableau.length-1){
			return output + ligne.retournePosition(joueurCourant,tableau[i]);
		}
			return output + ligne.retournePosition(joueurCourant,tableau[i]) + "\n";
	}

	/*-----------------------Savoir si le dernier carctère est B ou W-----------------------------*/
	public String turnIsAt(String input) {
		return input.substring(input.length()-1);
	}

}
