package TodosExecicios;
//38. Escreva um programa para converter um número decimal em um número hexadecimal.
import java.util.Scanner;

public class Trintaoito {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número decimal (somente com ou sem \",\") ");
		double decimal = scanner.nextDouble();
		
		int decimal1 = (int) decimal;

		String hexa = Integer.toHexString(decimal1);
		
		System.out.println("- 10 em hexadecimal é representado como a;\n"
				+ "- 11 em hexadecimal é representado como b;\n"
				+ "- 12 em hexadecimal é representado como c;\n"
				+ "- 13 em hexadecimal é representado como d;\n"
				+ "- 14 em hexadecimal é representado como e;\n"
				+ "- 15 em hexadecimal é representado como f.\n");

		System.out.println("O número hexadecimal é: " + hexa);
	}
}
