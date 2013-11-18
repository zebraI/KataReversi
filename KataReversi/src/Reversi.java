
public class Reversi {

	public String printLegalMoves(String input) {

		//-------------------------Creation Tableau et variables------------------
		String[] tableau = input.split("\n");
		String joueurCourant = this.turnIsAt(input);
		String output= "";

		//------------------------Gestion des lignes / Délégation à la classe Ligne ----------------

		for (int i = 0; i < tableau.length; i++) {
			Ligne ligne = new Ligne(); 	
			output = sortieTableau(tableau, joueurCourant, output, i, ligne);
		}

		//System.out.println(output);
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

	/*-----------------------Transformation colonnes en lignes-----------------------------*/
	public String transformationColonneLigne(String input) {
		
		String col="";
		String output="";
		String[] tableau = input.split("\n");
		
	    for (int j = 0; j < tableau.length - 1; j++) {
	    	for (int i = 0; i < tableau.length - 1; i++) {
				col = col + tableau[i].substring(j,j+1);
			}
	    	col = col + "//";	    	
	    }
	    
	    col = col.replace("//","\n");
	    return col;

	}

}
