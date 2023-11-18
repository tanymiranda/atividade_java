package TodosExecicios;
//28. Informar um saldo e imprimir o saldo com reajuste de 1%
import java.util.Scanner;

public class Vinteoito {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe seu saldo: ");
		double saldo = sc.nextDouble();
		
		double reajuste = saldo * 1.01;
		
		System.out.println("Seu saldo com reajuste em 1% é : " + reajuste);
		
	}
}
