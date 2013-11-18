import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestReversi {
		
		private Reversi reversi;
		private String input = "";
		private String output ="";
	
		@Before
		public void initializeReversi(){
			this.reversi = new Reversi();
		}
		
		public void testEgalite(String input, String output){
			assertEquals(output,reversi.printLegalMoves(input));
		}
		
		/*@Test
		public void grilleAuCommencementBParLigne(){
			input = ""+
					"........\n"
					+ "........\n"
					+ "........\n"
					+ "...BW...\n"
					+ "...WB...\n"
					+ "........\n"
					+ "........\n"
					+ "........\n"
					+ "B";
			
			output = ""+
					"........\n"
					+ "........\n"
					+ "........\n"
					+ "...BW0..\n"
					+ "..0WB...\n"
					+ "........\n"
					+ "........\n"
					+ "........\n"
					+ "B";
			
			testEgalite(input,output);
		}
		
		@Test
		public void grilleAuCommencementWParLigne(){
			input = ""+
					"........\n"
					+ "........\n"
					+ "........\n"
					+ "...BW...\n"
					+ "...WB...\n"
					+ "........\n"
					+ "........\n"
					+ "........\n"
					+ "W";
			
			output = ""+
					"........\n"
					+ "........\n"
					+ "........\n"
					+ "..0BW...\n"
					+ "...WB0..\n"
					+ "........\n"
					+ "........\n"
					+ "........\n"
					+ "W";
			
			testEgalite(input,output);
		}*/
		
		@Test
		public void testLigneJoueurBRetournePositions(){
			input = "...BW...\n"+"B";
			output = "...BW0..\n"+"B";
			
			testEgalite(input,output);
		}
}
