package TodosExecicios;
//16.Façaumprogramaqueleiaumarraydenúmerosdousuário
//atéqueousuárioinsiraumnúmeroigualaoprimeironúmerolido.

import java.util.ArrayList;
import java.util.Scanner;
public class Quinze {
	public static void main (String []args) {

		ArrayList<Integer> maiores = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		Integer guardar = Integer.MIN_VALUE;
		int cont = 0;
		System.out.println("Digite uum número igual o primeiro para encerrar. ");
		while(true) {
			System.out.println("Informe números: ");
			Integer maior = sc.nextInt();

			maiores.add(maior);
			if (guardar == maiores.get(cont)) {
				break;
			}
			guardar = maiores.get(0);

			cont++;
		}
		System.out.println("Foram informados " + cont + " números.");

		sc.close();

	}
}
