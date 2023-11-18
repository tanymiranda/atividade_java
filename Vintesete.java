package TodosExecicios;
//27. Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
//números 4, 5 e 6. A soma das duas médias. A média das médias.
public class Vintesete {
	public static void main (String [] args) {
		double media1 = ((8+9+7)/3.0);
		double media2 = ((4+5+6)/3.0);
		double soma = media1 + media2;
		double medias = soma/2;
		System.out.println("Média aritmética dos numeros 8, 9 e 7: " + media1 + "\n");
		System.out.println("Média dos números 4, 5 e 6: " + media2 + "\n");
		System.out.println("A soma das duas médias: " + soma + "\n" + "\nA média das médias é: " + medias);
	}
}
