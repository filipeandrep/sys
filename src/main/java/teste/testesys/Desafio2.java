package teste.testesys;

/**
 * Algoritmo de criptografia.
 * @author filipe.souza
 *
 */
public class Desafio2 {

	private static final String ALFABETO = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	/**
	 * Realiza a criptografia alterando a letra referenciada pela sua terceira subsequente.
	 * @param palavra a ser criptografada. 
	 * @return texto criptografado.
	 * @throws Exception caso ocorra uma letra nõo suportada no texto.
	 */
	public String criptografar(String palavra) throws Exception{
		if(possuiCaractereForaDoRange(palavra)){
			throw new Exception("Caractere fora do range");
		}
		String result = "";
		for(int i=0;i < palavra.length();i++){
			String letra = obterLetraCorrespondenteCriptografada(palavra.toUpperCase().charAt(i)); 
			result += letra;
		}
		return result;
	}
	/**
	 * Recebe a palavra criptografada e retorna o texto original.
	 * @param palavraCriptografada texto criptografado para voltar ao normal.
	 * @return texto descriptografado.
	 * @throws Exception caso ocorra uma letra não suportada.
	 */
	public String descriptografar(String palavraCriptografada) throws Exception{
		if(possuiCaractereForaDoRange(palavraCriptografada)){
			throw new Exception("Caractere fora do range");
		}
		String result = "";
		for(int i=0;i < palavraCriptografada.length();i++){
			String letra = obterLetraCorrespondenteDescriptografada(palavraCriptografada.toUpperCase().charAt(i)); 
			result += letra;
		}
		return result;
	}
	private boolean possuiCaractereForaDoRange(String valor) {
		for(int i=0;i < valor.length();i++){
			if(ALFABETO.indexOf(valor.charAt(i)) == -1){
				return true;
			}
		}
		return false;
	}
	private String obterLetraCorrespondenteCriptografada(char letra) {
		for(int i=0; i < ALFABETO.length(); i++){
			if(letra == ALFABETO.charAt(i)){
				if(i + 3 < ALFABETO.length()){
					return ALFABETO.charAt(i + 3) + "";
				}
				else{
					return ALFABETO.charAt((i + 3) - ALFABETO.length()) + "";
				}
			}
		}
		return null;
	}
	private String obterLetraCorrespondenteDescriptografada(char letra) {
		for(int i=0; i < ALFABETO.length(); i++){
			if(letra == ALFABETO.charAt(i)){
				if(i - 3 >= 0){
					return ALFABETO.charAt(i - 3) + "";
				}
				else{
					return ALFABETO.charAt((i - 3) + ALFABETO.length()) + "";
				}
			}
		}
		return null;
	}
}
