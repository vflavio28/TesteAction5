package testes;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCalculadora {

public Calculadora cal = new Calculadora();
	
	@Test
	public void test() {
		double soma = cal.somar(4, 4);
		assertEquals(8.0,soma,0);
		
	}
}
