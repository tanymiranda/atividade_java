package TodosExecicios;
//23. Crie um programa que leia um array de nomes do usuário até que o usuário insira "FIM".
//Em seguida, imprima os nomes em ordem inversa.

import java.util.ArrayList;
import java.util.Scanner;

public class Vintetres {
	public static void main (String []args) {

		ArrayList<String> nomes = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite \"FIM\" (em maiúsculo) para encerrar. ");
		System.out.println("Informe nomes: ");
		while(true) {
			String nome = sc.next();

			if (nome.equals("FIM")){
				break;
			}
			nomes.add(nome);
		}

		for (int i = nomes.size()- 1; i >= 0; i--) {
			System.out.println(nomes.get(i));
		}
		System.out.println("Os nomes em ordem inversa.");

		sc.close();

	}
}
