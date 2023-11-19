package TodosExecicios;
//30. Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
//calcule a quantidade de salários mínimos que esse usuário ganha e imprima o resultado.
//(1SM=R$1.500,00)
import java.util.Scanner;

public class Trinta {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		double salarioM = 1.500;
		double salario;

		System.out.println("Informe o seu salário: ");
		salario = sc.nextDouble();

		double quantos = ((salario/ salarioM)/1000);

		System.out.println("Você recebe " + quantos + " salários minímos.");
	}

}
