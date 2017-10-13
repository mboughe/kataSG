package kataSG;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class debiterCompteBancaireTest {

	@Test
		public void debiterCompteTest() {
			CompteBancaire junit = new CompteBancaire();
			double result = junit.debiterCompteBancaire(100);
			assertEquals(-100, result,0);
		}
		
	}
