package TodosExecicios;
//17- Implemente um programa que leia um array de numeros do usuário até que o usuário 
//insira um número primo.
import java.util.Scanner;

public class Dezesseis {
	public static void main (String []args) {
		Scanner sc = new Scanner (System.in);
		
		int cont=0;
		
		System.out.println("Informe o tamanho do Array: ");
		int tamanho = sc.nextInt();
		Integer [] numero = new Integer[tamanho];
		
		System.out.println("Informe os números (Insira um número primo, caso deseje parar) ");
		for (int i = 0; i < tamanho; i++) {
			numero[i] = sc.nextInt();	
			
			cont++;
			
			if (numero[i]%2!=0) {
				System.out.println("Você digitou um número primo.");
				break;
			}
		}
		System.out.println("Números inseridos:");
        for (int i = 0; i < cont; i++) {
            System.out.println(numero[i]);
        }

	}
}
