package TodosExecicios;
//3.Façaumprogramaquecalculeasomadosnúmerosímparesde1a50.
public class Terceiro {
	public static void main (String [] args) {
		int r=0;
		for(int i=1; i<=50;i++) {
			if (i%2!=0) {
				r +=i;
			}
		}
		System.out.println("A soma dos números impares de 1 a 50 é: " + r);

	}
}
