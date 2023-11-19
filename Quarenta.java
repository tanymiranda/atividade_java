package TodosExecicios;
//40. Escreva um programa Java para converter um número binário em um número decimal.

public class Quarenta {
	public static void main(String[] args) {
		String binario = "111001101";

		int decimal = Integer.parseInt(binario,2);
		System.out.println("O número binário (111001101) em decimal é: " + decimal);

	}
}
