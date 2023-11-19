package TodosExecicios;
//39. Escreva um programa para converter um número decimal em um número octal.

import java.util.Scanner;

public class Trintanove {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número decimal (somente com ou sem \",\") ");
		double decimal = scanner.nextDouble();
		
		int decimal1 = (int) decimal;

		String octal = Integer.toOctalString(decimal1);

		System.out.println("O número octal é: " + octal);
	}
}
