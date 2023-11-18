package TodosExecicios;
//11.Crieumprogramaqueleia10númerosdousuárioeimprimaomenordeles
import java.util.Scanner;

public class Decimo {
	public static void main (String [] args) {
	Scanner sc = new Scanner(System.in);
	Integer nu;
	Integer m = Integer.MAX_VALUE;

	for(int i =0; i<10; i++) {
		System.out.println("Fale o " + (i+1) + "º numero: ");
		nu = sc.nextInt();
		if (nu<m) {
			m = nu;
		}
	}
	System.out.println("O menor numero informado é: " + m);
}
}
