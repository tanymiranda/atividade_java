package TodosExecicios;
//33. Troco: Fazer um programa em Java que implemente a solução de troco em uma
//operação de venda/compra
import java.util.Scanner;

public class Trintatres {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		Double valorPago = 1000.0;
		Double conta = 1020.0;
		Double troco;
			
		troco = valorPago - conta;
		
		if(troco < 0) {
			System.out.println("Falta R$" + troco*(-1));

		}else {
			System.out.println("Troco: R$");
		}


	}
}
