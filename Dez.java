package TodosExecicios;
//10.Escrevaumprogramaqueleiaumarraydenúmerosdousuárioatéqueousuárioinsiraumnúmerorepetido.
//Emseguida,imprimaaquantidadedenúmeroslidosantesdarepetição.
import java.util.Scanner;
import java.util.HashSet;
public class Nono {
	public static void main (String []args) {
		
		Scanner sc = new Scanner(System.in);
		HashSet<Integer>numerosSet = new HashSet<>();
		
		int cont = 0;
		int num = 0;
		
		System.out.println("Informe o tamanho do Array: ");
		int tamanho = sc.nextInt();
		Integer [] numero = new Integer[tamanho];
		
		System.out.println("Informe os números do array: ");
		System.out.println("Ou repita um numero para encerrar. ");
		
		while(true) {
			for (int i =0;i< tamanho; i++) {
			numero[i] = sc.nextInt();
			
			if(!numerosSet.add(numero[i])) {
				break;
			}
			cont++;
			
		}
			System.out.println("Foram informados " + cont + " números.");
		}
		
}
}
