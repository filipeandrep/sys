package teste.testesys;

/**
 *  Desenvolva uma função que receba de entrada dois numeros inteiros
	 e calcule o maior numero primo entre os dois.
 * @author filipe.souza
 *
 */
public class Desafio1 {

	/**
	 * Função para retornar o maior número primo entre dois parametros.
	 * @param valor1 primeiro valor da sequencia de maior primo.
	 * @param valor2 segundo valor da sequencia para gerar o maior primo;
	 * @throws Exception caso o primeiro valor seja maior ou igual ao segundo valor.
	 */
	public int calcularMaiorNumeroPrimo(int valor1, int valor2) throws Exception{
		if(valor1 >= valor2){
			throw new Exception("O primeiro parametro deve ser menor que o segundo");
		}
		int maiorNumero = 0;
		for(int  i = valor1; i<=valor2;i++){
			int contDiv = 0;
			for(int j = 1; j<=i;j++){
				if(i % j == 0){
					contDiv++;
				}
			}
			if(contDiv == 2 && i > maiorNumero){
				maiorNumero = i;
			}
		}
		return maiorNumero;
	}
}
