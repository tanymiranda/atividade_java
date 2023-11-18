package TodosExecicios;
//21 - Implemente um programa que leia um array de numeros do usuario e 
//encontre a média dos numeros e quantos estão acima da média.
import java.util.Scanner;

public class Vinteum {
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o tamanho do Array: ");
		int tamanho = sc.nextInt();
		Integer [] numero = new Integer[tamanho];
		int quantos = 0;
		int cont = 0;
		int acima = 0;
		int soma = 0;

		System.out.println("Informe os números do array: ");

		for (int i = 0; i < tamanho; i++) {
			numero[i] = sc.nextInt();			
			soma +=numero[i];
			cont++;
		}
		double m = (double) soma/cont;

		for (int y=0; y < tamanho; y++) {
			if (numero[y] > m) {
				numero[y] = acima;
				quantos++;
			}
		}


		System.out.println("Estão acima da média " + quantos + " números.");
		System.out.println("A média dos numeros é: " + m);
	}

}
