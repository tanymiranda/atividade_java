package TodosExecicios;
/* 44. Um dos sistemas de encriptação mais antigos é atribuído a Júlio César: se uma
letra a ser encriptada é a letra de número N do alfabeto, substitua-a com a letra
(N+K), onde K é um número inteiro constante (César utilizava K = 3).
Usualmente consideramos o espaço como zero e todos os cálculos são
realizados com módulo-27. Dessa forma, para K = 1 a mensagem “Ataque ao
amanhecer” se torna “bubrfabpabnboifdfs”. Faça um programa que receba como
entrada uma mensagem e um valor de J e retorne a mensagem criptografada
pelo código de César
 */
import java.util.Scanner;
public class Quarentaqua {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Leitura da mensagem e valor de J
		System.out.print("Digite a mensagem: ");
		String mensagem = scanner.nextLine().toUpperCase(); // Converte para maiúsculas para facilitar a manipulação.

		System.out.print("Digite o valor de J (inteiro): ");
		int valorJ = scanner.nextInt();

		// Criptografia de César
		String mensagemCriptografada = criptografarCesar(mensagem, valorJ);

		// Exibição do resultado
		System.out.println("Mensagem criptografada: " + mensagemCriptografada);
	}

	private static String criptografarCesar(String mensagem, int valorJ) {
		StringBuilder resultado = new StringBuilder();

		for (int i = 0; i < mensagem.length(); i++) {
			char caractere = mensagem.charAt(i);

			if (caractere == ' ') {
				resultado.append(' ');  // Mantém espaços inalterados.
			} else {
				char caractereCriptografado = (char) ((caractere - 'A' + valorJ) % 26 + 'A'); //modulo 26 para manter as letras de 1 a 25 do alfabeto
				resultado.append(caractereCriptografado);
			}
		}

		return resultado.toString();
	}
}
