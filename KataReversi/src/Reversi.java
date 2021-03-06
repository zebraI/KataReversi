
public class Reversi {
	
	private String[] tableau = null;
	private String output = null;
	
	public String printLegalMoves(String input) {

		//-------------------------Creation Tableau et variables------------------
		
		tableau = input.split("\n");
		String joueurCourant = this.turnIsAt(input);
		output= "";

		//------------------------Gestion des lignes / D�l�gation � la classe Ligne ----------------

		for (int i = 0; i < tableau.length; i++) {
			Ligne ligne = new Ligne(); 	
			output = sortieTableau(tableau, joueurCourant, output, i, ligne);
		}

		//System.out.println(output);
		return output;
	}


	//-------------------Gestion des sauts de lignes � la sortie-------------------------
	public String sortieTableau(String[] tableau, String joueurCourant,
			String output, int i, Ligne ligne) {
		if (i==tableau.length-1){
			return output + ligne.retournePosition(joueurCourant,tableau[i]);
		}
		return output + ligne.retournePosition(joueurCourant,tableau[i]) + "\n";
	}

	/*-----------------------Savoir si le dernier carct�re est B ou W-----------------------------*/
	public String turnIsAt(String input) {
		return input.substring(input.length()-1);
	}

	
	/*-----------------------Transformation colonnes en lignes-----------------------------*/
	public String transformationColonneLigne(String input) {
		
		String col="";
		output="";
		tableau = input.split("\n");
		
	    for (int j = 0; j < tableau.length - 1; j++) {
	    	col = parcourirCaracteresLigneCourante(col, tableau, j);
	    	col = col + "//";	    	
	    }
	    
	    col = col.replace("//","\n");
	    return col;

	}


	public String parcourirCaracteresLigneCourante(String col, String[] tableau, int j) {
		for (int i = 0; i < tableau.length - 1; i++) {
			col = col + tableau[i].substring(j, j+1);
		}
		return col;
	}

}
