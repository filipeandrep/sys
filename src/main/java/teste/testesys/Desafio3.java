package teste.testesys;

import java.nio.ByteBuffer;

/**
 * Algoritmo de fibonacci com teste de alocação de memória.
 * @author filipe.souza
 *
 */
public class Desafio3 {

	private static final int BUFFER_SIZE = 1024;

	/**
	 * Função que calcula o fibonacci.
	 * @param valor a ser iterado
	 * @return resultado da iteração.
	 */
	public long calc(int valor) {
		if (valor < 2) {
			return valor;
		} else {
			return calc(valor - 1) + calc(valor - 2);
		}
	}

	/**
	 * Obtém lista de resultados de fibonacci.
	 * @param quantidadeIteracoes número de vezes para executar o algoritmo de fibonacci. 
	 * @return string contendo lista de fibonacci separado por vírgula.
	 * @throws Exception caso o número de iterações não seja suuportado.
	 */
	public String obterSequencia(int quantidadeIteracoes) throws Exception {
		try {
			ByteBuffer.allocate(quantidadeIteracoes * BUFFER_SIZE);
		} catch (OutOfMemoryError e) {
			throw new Exception("Sem memoria suficiente para esta iteração");
		}
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < quantidadeIteracoes; i++) {
			result.append(calc(i) + ",");
		}
		return result.toString().substring(0, result.length() - 1);
	}
}
