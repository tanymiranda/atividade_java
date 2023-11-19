package TodosExecicios;
import java.util.Scanner;

public class Principal {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Pergunta ao usuário o tamanho do array
	        
	        System.out.print("Digite o tamanho do array: ");
	        int tamanhoArray = scanner.nextInt();

	        // Instancia um objeto da classe ArrayNumeroInteiro
	        
	        ArrayNumeroInteiro arrayInteiro = new ArrayNumeroInteiro(tamanhoArray);

	        // Preenche o array com números fornecidos pelo usuário
	        
	        for (int i = 0; i < tamanhoArray; i++) {
	            System.out.print("Digite o número " + (i + 1) + ": ");
	            int numero = scanner.nextInt();
	            arrayInteiro.adicionar(numero);
	        }

	        // Calcula a média e mostra o resultado
	        int media = arrayInteiro.calculaMedia();
	        System.out.println("A média dos números é: " + media);
	    }
	}
