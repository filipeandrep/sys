package teste.testesys;

import org.junit.Assert;
import org.junit.Test;


public class Desafio2Test {

	@Test
	public void deveRetornarPalavraCriptografada() throws Exception{
		Desafio2 des = new Desafio2();
		String result = des.criptografar("ZAZA");
		Assert.assertEquals(result, "CDCD");
	}
	
	@Test
	public void deveRetornarPalavraDescriptografada() throws Exception{
		Desafio2 des = new Desafio2();
		String result = des.descriptografar("CDCD");
		Assert.assertEquals(result, "ZAZA");
	}

	@Test(expected=Exception.class)
	public void deveDarExcecaoQuandoHouverCaractereInvalidoCriptografia() throws Exception{
		Desafio2 des = new Desafio2();
		des.criptografar("1zaza");
	}
	@Test(expected=Exception.class)
	public void deveDarExcecaoQuandoHouverCaractereInvalidoDescriptografia() throws Exception{
		Desafio2 des = new Desafio2();
		des.descriptografar("1zaza");
	}
}
