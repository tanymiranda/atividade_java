package TodosExecicios;
import java.util.Scanner;

//7.Crieumprogramaqueleiaumarraydenúmerose,emseguida,imprimaasomadosnúmeroslidos.

public class Sexto {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		System.out.println("Informe o tamanho do Array: ");
		int tamanho = sc.nextInt();
		Integer [] numero = new Integer[tamanho];
	
		System.out.println("Informe os números do array: ");
		for (int i = 0; i< tamanho; i++) {
			numero[i] = sc.nextInt();
			 soma += numero[i];
		}
		System.out.println("A soma dos números é: " + soma);
	}
}
