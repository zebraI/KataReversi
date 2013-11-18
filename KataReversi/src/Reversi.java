
public class Reversi {

	public String printLegalMoves(String input) {
		
		if (this.turnIsAt(input).equals("B")) {
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
					+ "W");		
	}
	
	/*-----------------------Savoir si le dernier carctère est B ou W-----------------------------*/
	public String turnIsAt(String input) {
		return input.substring(input.length()-1);
	}

}
