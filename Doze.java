package TodosExecicios;

import java.util.Scanner;

//12.Façaumprogramaqueleiaumarraydenúmerosdousuárioatéqueousuárioinsiraumnúmeronegativo.
//Emseguida,imprimaamédiadosnúmeroslidos.

public class Onze {
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o tamanho do Array: ");
		int tamanho = sc.nextInt();
		Integer [] numero = new Integer[tamanho];

		int cont = 0;
		int num = 0;
		int media = 0;

		System.out.println("Informe os números do array: ");
		System.out.println("Ou digite um número negativo para encerrar. ");

		for (int i = 0; i < tamanho; i++) {
			numero[i] = sc.nextInt();			
			if (numero [i] < 0) {
				break;
			}
			media +=numero[i];
			cont++;
		}
		double m = (double) media/cont;
		System.out.println("Foram informados " + cont + " números.");
		System.out.println("A média dos numeros é: " + m);


	}
}
