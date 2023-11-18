package TodosExecicios;
//15.Crieumprogramaqueleiaumarraydenúmerosdousuário
//atéqueousuárioinsiraumnúmeroquesejamaiorqueoanterior.

import java.util.ArrayList;
import java.util.Scanner;

public class Quatorze {
	public static void main (String []args) {

		ArrayList<Integer> maiores = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		int guardar = 0;
		int cont = 0;

		while(true) {
			System.out.println("Digite um número maior que o informado anteriormente para encerrar. ");
			System.out.println("Informe números: ");
			Integer maior = sc.nextInt();

			maiores.add(maior);

			if (guardar == 0){
				guardar = maior;
				
			} else if (guardar < maiores.get(cont)) {
				break;
			}
			guardar = maiores.get(cont);
			cont++;
		}
		System.out.println("Foram informados " + cont + " números.");
		
		sc.close();

	}
}
