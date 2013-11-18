
public class Reversi {

	public String printLegalMoves(String input) {
		

		/*if (this.turnIsAt(input).equals("B")) {
			return (""
					+"........\n"
					+ "........\n"
					+ "........\n"
					+ "...BW0..\n"
					+ "..0WB...\n"
					+ "........\n"
					+ "........\n"
					+ "........\n"
					+ "B");
		}
		else
			return (""+
					"........\n"
					+ "........\n"
					+ "........\n"
					+ "..0BW...\n"
					+ "...WB0..\n"
					+ "........\n"
					+ "........\n"
					+ "........\n"
					+ "W");	*/	
		String[] tableau = input.split("\n");
		String output= "";
		for (int i = 0; i < tableau.length; i++) {
	    	if(tableau[i].indexOf("B")<tableau[i].indexOf("W.") && tableau[i].indexOf("B")!=-1){
	    		tableau[i] = tableau[i].replace("W.","W0");
	    	}
	    	if(tableau[i].indexOf("B")>tableau[i].indexOf(".W") && tableau[i].indexOf("B")!=-1){
	    		tableau[i] = tableau[i].replace(".W","0W");
	    	}
	    	//System.out.println(tableau[i]);
	    	if (i==1){
	    		output = output + tableau[i];
	    	}
	    	else
	    		output = output + tableau[i] + "\n";
		}
		System.out.println(output);
		return output;
	}
	
	/*-----------------------Savoir si le dernier carctère est B ou W-----------------------------*/
	public String turnIsAt(String input) {
		return input.substring(input.length()-1);
	}

}
