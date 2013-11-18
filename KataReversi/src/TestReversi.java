import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestReversi {
		
		//@Before
		private Reversi reversi;

		@Test
		public void grilleAuCommencementBParLigne(){
			String input = ""+
					"........\n"
					+ "........\n"
					+ "........\n"
					+ "...BW...\n"
					+ "...WB...\n"
					+ "........\n"
					+ "........\n"
					+ "........\n"
					+ "B";
			
			String output = ""+
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
