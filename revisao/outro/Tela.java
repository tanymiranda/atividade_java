package revisao;
import java.util.Scanner;

public class Tela {
	Scanner sc = new Scanner (System.in);
	public void menu() {
		String opcao = null;
		Double resultado = 0.0;
		do {
			System.out.println("=========Bem vindo ao sistema de calculadora=========");
			System.out.println("Informe o primeiro número: ");
			Double numero1 = sc.nextDouble();
			System.out.println("Informe o segundo número: ");
			Double numero2 = sc.nextDouble();

			sc.nextLine();
			System.out.println("Informe a opçao a qual deseja calcular: ");
			System.out.println("+ = SOMAR\n" + "- : SUBTRAÇÃO\n"+ "* : MULTIPLICAÇÃO\n" + "/ : DIVISÃO\n"+ "0 : Sair da Calculadora\n"+"------------------------");
			opcao = sc.nextLine();

			if (opcao.equals("+")){
				resultado = numero1 + numero2;
			}else if(opcao.equals("-")){
				//subtrair
				resultado = numero1 - numero2;
			}else if(opcao.equals("*")){
				//multiplicar
				resultado = numero1 * numero2;
			}else if(opcao.equals("/")){
				//dividir
				resultado = numero1 / numero2;
			}else if(opcao.equals("0")) {
				System.out.println("Saindo do sistema de calculadora...");
			}else {
				System.out.println("Opção invalida. Tente novamente!");
			}
			
			System.out.println("O resultado do calculo é: "+ resultado);
			
		}while (opcao.equals("0") == false);
	}
}
