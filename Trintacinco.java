package TodosExecicios;
//35. Escreva um programa para somar dois números binários.
import java.util.Scanner;

public class Trintacinco {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		 System.out.print("Digite o primeiro número binário: ");
	        String binario1 = scanner.next();

	        System.out.print("Digite o segundo número binário: ");
	        String binario2 = scanner.next();

	        int decimal1 = Integer.parseInt(binario1, 2);
	        int decimal2 = Integer.parseInt(binario2, 2);

	        int somaDecimal = decimal1 + decimal2;

	        String somaBinaria = Integer.toBinaryString(somaDecimal);

	        System.out.println("A soma em binário é: " + somaBinaria);
	    
	}
}
