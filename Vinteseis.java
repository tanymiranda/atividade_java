package TodosExecicios;
//26. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
//mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
//Ex: 3 anos, 2 meses e 15 dias = 1170 dias.
import java.util.Scanner;
public class Vinteseis {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a idade em anos, meses e dias:");
		System.out.print("Anos: ");
		int anos = scanner.nextInt();
		System.out.print("Meses: ");
		int meses = scanner.nextInt();
		System.out.print("Dias: ");
		int dias = scanner.nextInt();

		int totalDias = (anos * 365) + (meses * 30) + dias;

		System.out.println("A idade em dias é: " + totalDias + " dias.");
		scanner.close();
	}
}
