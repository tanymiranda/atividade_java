package TodosExecicios;
//13.Implementeumprogramaqueleiaumarraydenúmerosdousuárioatéqueousuárioinsira999.
//Emseguida,imprimaasomadosnúmerospareseasomadosnúmerosímpareslidos.
import java.util.Scanner;

public class Doze {
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o tamanho do Array: ");
		int tamanho = sc.nextInt();
		Integer [] numero = new Integer[tamanho];

		int p = 0;
		int im = 0;
		int cont = 0;

		System.out.println("Informe os números do array: ");
		System.out.println("Ou digite o número 999 para encerrar. ");

		for (int i = 0; i < tamanho; i++) {
			numero[i] = sc.nextInt();			

			if (numero [i] == 999) {
				break;
			}
			else {
				if (numero[i]%2!=0) {
					im += numero[i];
				}else {
					if (numero[i]%2==0) {
						p += numero[i];
					}
				}
				cont++;
			}
		}
		System.out.println("Foram informados " + cont + " números.");
		System.out.println("A soma dos números pares é dos numeros é: " + p);
		System.out.println("A soma dos números impares é dos numeros é: " + im);


	}

}
