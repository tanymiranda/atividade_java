package TodosExecicios;
//14.Escrevaumprogramaqueleia5nomesdousuárioeosimprimaemordemalfabética.
import java.util.Scanner;
import java.util.Arrays;

public class Treze {
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);
		
		String[] nomes = new String[5];
		
		for( int i=0;i<5;i++) {
		System.out.println("Informe o "+ (i+1) + "º nome:");
		 nomes[i] = sc.nextLine();
		}
		Arrays.sort(nomes);
		System.out.println("Os nomes em ordem Alfabética: ");
		for(String nome: nomes) {
		System.out.println(nome);
		}
	}		
}
