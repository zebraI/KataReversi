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
		
		@Test
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
			
			assertEquals(output,reversi.printLegalMoves(input));
		}
		


}
