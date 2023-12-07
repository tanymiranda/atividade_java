package revisao;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Dez {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> numeros = new ArrayList<Integer>();

		Boolean ehNumeroRepetido = false;
		do {
			System.out.println("---BEM VINDO AO SISTEMA---");
			System.out.println("Informe um número, por favor: ");
			Integer numero = sc.nextInt();
			//não coloca numeros.add(numero); só no final
			
			for(int i =0; i<numeros.size(); i++) {
				if(numeros.size() > 1 && numero == numeros.get(i)) {
					ehNumeroRepetido = true;
					System.out.println("A quantidade de números é " + numeros.size());
				}else {
					System.out.println("Numero: " + numeros.get(i));
				}
			}
			numeros.add(numero);

		}while(ehNumeroRepetido != true);
	}
}
