package TodosExecicios;
//32. Tabuada: Escreva um programa em Java que exiba a tabuada de multiplicação do
//número inteiro 1 até o número
//inteiro 10.

public class Trintadois {
	public static void main (String [] args) {
		for (int i = 1; i<=10; i++) {
			System.out.println("Tabuada do número: " + i);
			
			for (int y = 1; y<=10; y++) {
				int resultado = i * y;
				
				System.out.println(i + " x " + y + " = " + resultado);

			}
		}
	}
}
