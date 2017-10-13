package kataSG;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class crediterCompteBancaireTest {

	@Test
	public void crediterCompteTest() {
		CompteBancaire junit = new CompteBancaire();
		double result = junit.crediterCompteBancaire(100);
		assertEquals(100, result,0);
	}

}
