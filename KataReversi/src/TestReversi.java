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
		
		
		//---------------------Tests renvoyant le tour---------------		
		@Test
		public void tourJoueurB(){
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
			assertEquals("B",this.reversi.turnIsAt(input));
		}
		
		@Test
		public void tourJoueurW(){
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
			assertEquals("W", this.reversi.turnIsAt(input));
		}
		
//---------------------Tests une ligne Joueur B---------------
		@Test
		public void testLigneBWRetournePositionsJB(){
			input = "...BW...\n"+"B";
			output = "...BW0..\n"+"B";
			
			testEgalite(input,output);
		}
		
		@Test
		public void testLigneBWWRetournePositionsJB(){
			input = "...BWW..\n"+"B";
			output = "...BWW0.\n"+"B";
			
			testEgalite(input,output);
		}
		
		@Test
		public void testLigneWBRetournePositionsJB(){
			input = "...WB...\n"+"B";
			output = "..0WB...\n"+"B";
			
			testEgalite(input,output);
		}
		
		@Test
		public void testLigneWWBRetournePositionsJB(){
			input = "...WWB..\n"+"B";
			output = "..0WWB..\n"+"B";
			
			testEgalite(input,output);
		}
		
		
		//---------------------Tests une ligne Joueur W---------------
		@Test
		public void testLigneBWRetournePositionsJW(){
			input = "...BW...\n"+"W";
			output = "..0BW...\n"+"W";
					
			testEgalite(input,output);
		}
				
		@Test
		public void testLigneBBWRetournePositionsJW(){
			input = "...BBW..\n"+"W";
			output = "..0BBW..\n"+"W";
					
			testEgalite(input,output);
		}

		@Test
		public void testLigneWBRetournePositionsJW(){
			input = "...WB...\n"+"W";
			output = "...WB0..\n"+"W";

			testEgalite(input,output);
		}

		@Test
		public void testLigneWBBRetournePositionsJW(){
			input = "...WBB..\n"+"W";
			output = "...WBB0.\n"+"W";

			testEgalite(input,output);
		}

		
		//---------------------Test un tableau Joueur B---------------
		@Test
		public void testTableauEntierJB(){
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
		
		
		
		//---------------------Test un tableau Joueur W---------------
		@Test
		public void testTableauEntierJW(){
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
		}
		
		
}
