package desafio.algoritimo;

public class AlgoritimoContagem {

	public static void main(String[] args) {
		String frase = "Eu sou a pessoa mais incrível que eu posso ser, "
				+ "e através do meu esforço vou conquistar o que já é MEU. ";

		char letra ='a';
		int contador =0;

		for (int i =0 ; i <frase.length();i++){
			if (frase.charAt(i) == letra) {
				contador++;
			} 
		}

		System.out.println(" \r\n"
				+ "                                                                               \r\n"
				+ "  _.    _.      _. ._ _|_ o  _|  _.  _|  _   _    _|  _    |  _ _|_ ._ _.  _   \r\n"
				+ " (_|   (_| |_| (_| | | |_ | (_| (_| (_| (/_ _>   (_| (/_   | (/_ |_ | (_| _>   \r\n"
				+ "         |                                                                     \r\n"
				+ " " +letra+ " é "+contador+ "");
			}


			


	}


