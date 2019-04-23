package teste.testesys;

import org.junit.Assert;
import org.junit.Test;


public class Desafio1Test {

	@Test
	public void deveRetornarOMaiorNumeroPrimo() throws Exception{
		Desafio1 des = new Desafio1();
		int result = des.calcularMaiorNumeroPrimo(10, 20);
		Assert.assertEquals(result, 19);
	}
	
	@Test(expected=Exception.class)
	public void deveRetornarExcecaoCasoOValorDoParametroSejaInvalido() throws Exception{
		Desafio1 des = new Desafio1();
		des.calcularMaiorNumeroPrimo(30, 20);
	}
}
