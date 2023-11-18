package TodosExecicios;
//22 - Implemente um programa que leia um array de numeros do usuario e 
//encontre o segundo maior numero.

import java.util.Scanner;

public class Vintedois {
	public static void main (String []args) {
		Scanner sc = new Scanner (System.in);

		System.out.println("Informe o tamanho do Array: ");
		int tamanho = sc.nextInt();
		
		Integer [] numero = new Integer[tamanho];
		
		System.out.println("Informe os números: ");
		for (int i = 0; i < tamanho; i++) {
			numero[i] = sc.nextInt();	
		}
		int maior = numero[0];
		int segundom = numero[0];
		
        for (int y = 0; y < numero.length ; y++) {
           if (numero[y]> maior) {
        	   segundom = maior;
        	   maior = numero[y];
           }else if(numero[y] > segundom && numero[y] < maior){
        	   segundom = numero[y];
           }
        }
    	System.out.println("O segundo maior numero informado é: " + segundom );

	}
}
