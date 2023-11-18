package TodosExecicios;
//24. Faça um programa que leia um array de números do usuário até que o usuário insira um
//número negativo. Em seguida, imprima a média dos números lidos e quantos números foram pares.
import java.util.ArrayList;
import java.util.Scanner;

public class Vintequatro {
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<>();
		
		int soma = 0;
		int pares = 0;
		
		System.out.println("Digite um número negativo para encerrar. ");
		System.out.println("Informe os números: ");
		
		while(true) {
			Integer numeros = sc.nextInt();
			
			if (numeros< 0){
				break;
			}
			num.add(numeros);
			soma+=numeros;

			if (numeros%2==0) {
				pares++;
			}
		}
		if(!num.isEmpty()) {
			double m = (double) soma/num.size();
			System.out.println("A média dos números inseridos é: " + m + "\nE " + pares + " números são pares.");
		}else {
			System.out.println("Nenhum número foi inserido.");
		}
		sc.close();
	}
}
