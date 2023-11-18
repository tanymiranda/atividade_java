package TodosExecicios;
//18-Escreva um programa que leia um array de números do usuário ate que ele insira
//um número que seja a soma dos dois números anteriores

import java.util.Scanner;

public class Dezessete {
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o tamanho do Array: ");
		int tamanho = sc.nextInt();
		 Integer [] numeros = new Integer [tamanho];
		 
		 for (int i=0; i< numeros.length; i++) {
			 System.out.println("Digite um número (Digite a soma dos dois números anteriores para encerrar)");
			 numeros[i] = sc.nextInt();
			 
			 if (i >= 2 && numeros [i] == numeros [i-1] + numeros [i-2]) {
				 System.out.println("Você digitou a soma dos dois números anteriores.");
				 break;
			 }
		 }
		
		sc.close();
		}
	}

