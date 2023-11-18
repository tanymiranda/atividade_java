package TodosExecicios;
//9.Façaumprogramaqueleiaumarraydenúmerosdousuárioatéqueousuárioinsira0.
//Emseguida,imprimaaquantidadedenúmeroslidos.
import java.util.Scanner;

public class Oitavo {
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do Array: ");
		int tamanho = sc.nextInt();
		Integer [] numero = new Integer[tamanho];
		
		int cont = 0;
		
		System.out.println("Informe os números do array: ");
		System.out.println("Ou digite 0 para encerrar. ");

		for (int i = 0; i < tamanho; i++) {
			numero[i] = sc.nextInt();
			
			if (numero [i] == 0) {
			break;
			}

			cont++;
		}
		System.out.println("Foram informados " + cont + " números.");
		
	}
}
