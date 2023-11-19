package TodosExecicios;
//37. Escreva um programa para converter um número decimal em um número binário.
import java.util.Scanner;

public class Trintasete {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número decimal (somente com ou sem \",\") ");
		double decimal = scanner.nextDouble();
		
		int decimal1 = (int) decimal;

		String binario = Integer.toBinaryString(decimal1);

		System.out.println("O número binário é: " + binario);
	}
}
