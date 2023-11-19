package TodosExecicios;
/*42. Fazer uma classe Sorteio para:
● Sortear um número de 0 a 1000 (dica: usar Math.random())
● Pedir um palpite ao usuário. Se ele errar, informar se o palpite é maior ou
menor do que o número sorteado.
● Pedir novos palpites até que o usuário acerte e, depois disso, mostrar em
quantas tentativas ele acertou.
 */
import java.util.Scanner;

public class Sorteio {
	public static void main(String[] args) {

		int numeroSorteado = sortearNumero();
		int tentativas = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Bem-vindo ao jogo de sorteio!");

		do {
			System.out.print("Digite seu palpite (de 0 a 1000): ");
			int palpite = scanner.nextInt();
			tentativas++;

			if (palpite == numeroSorteado) {
				System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
				break;
			} else if (palpite < numeroSorteado) {
				System.out.println("Seu palpite é menor. Tente novamente!");
			} else {
				System.out.println("Seu palpite é maior. Tente novamente!");
			}

		} while (true); // Continua pedindo palpites até o usuário acertar (o loop é quebrado quando ele acerta).
	}
	//deixa acessivel apenas nessa classe. Numeros inteiros a serem sorteados de 0 a 1000 o math.random tras numero decimal
	//convertemos ele a numero inteiro (sempre um numero a menos do multiplicado 0 a 1001)
	private static int sortearNumero() {
		return (int) (Math.random() * 1001);
	}
}
