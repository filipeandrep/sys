package teste.testesys;

import org.junit.Assert;
import org.junit.Test;


public class Desafio3Test {

	@Test
	public void deveTestarPrimeiroValor() throws Exception{
		Desafio3 des = new Desafio3();
		Assert.assertEquals(1, des.calc(1));
	}
	@Test
	public void deveTestarSegundoValor() throws Exception{
		Desafio3 des = new Desafio3();
		Assert.assertEquals(1, des.calc(2));
	}
	@Test
	public void deveTestarTerceiroValor() throws Exception{
		Desafio3 des = new Desafio3();
		Assert.assertEquals(2, des.calc(3));
	}
	@Test
	public void deveTestarQuartoValor() throws Exception{
		Desafio3 des = new Desafio3();
		Assert.assertEquals(3, des.calc(4));
	}
	@Test(expected=Exception.class)
	public void deveDarExcessaoDeFaltaDeMemoria() throws Exception{
		Desafio3 des = new Desafio3();
		des.obterSequencia(10000000);
	}
}
