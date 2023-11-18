package TodosExecicios;
//5.Escrevaumprogramaqueleia10númerosdousuárioeimprimaamédiadeles.
import java.util.Scanner;
public class Quinto {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		double nu;
		double soma=0;
		for(int i =0; i<10; i++) {
			System.out.println("Fale o " + (i+1) + "º numero: ");
			nu = sc.nextInt();
			soma += nu;
		}
		double resultado = soma/10;
		System.out.println("A média dos números informados é  " + resultado);
	}
}
