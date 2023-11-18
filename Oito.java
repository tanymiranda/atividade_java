package TodosExecicios;
//8.Implementeumprogramaqueleiaumnúmerointeirodousuárioeimprimaosseusdivisores.
import java.util.Scanner;
public class Setimo {
	public static void main (String []args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Fale um número inteiro: ");
		int numero = sc.nextInt();
		
		System.out.println("Os divisores de "+ numero + " são: ");
		
		for(int i = 1; i <= numero; i++) {
			if ((numero % i)==0) {
				System.out.println("" + i);
			}
		}
				
	}
}
