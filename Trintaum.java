package TodosExecicios;
//31. Desenvolva um algoritmo que leia um número inteiro e imprima o seu
//antecessor e seu sucessor.
import java.util.Scanner;

public class Trintaum {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		Integer numero;

		System.out.println("Informe um número: ");
		numero = sc.nextInt();
		int antecessor = numero - 1;
		int sucessor = numero +1;

		System.out.println("O antecessor de "  + numero + " é " + antecessor + "\nO sucessor é " + sucessor);
	}

}
