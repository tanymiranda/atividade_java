package TodosExecicios;
/* 45. Fazer uma classe ArrayNumeroInteiro com as seguintes características:
● Atributos: array de inteiros e duas variáveis para controlar o número
atual e máximo de elementos inseridos no array

● Métodos: o Construtor que recebe o tamanho do array como parâmetro e
inicializa o objeto (cria array, etc.)

● o public boolean adicionar(int n) – adiciona elemento ao final do
array, retornando true se bem sucedido e false caso contrário

● o public int calculaMedia() – retorna a média aritmética dos
números armazenados no array

Fazer a classe Principal que:
● Pergunta, via console, qual o tamanho N do array que o usuário quer
instanciar
● Instancia um objeto da classe ArrayNumeroInteiro, passando N como argumento
● Pergunta N números ao usuário e armazena no objeto instanciado
● Chama o método para calcular a média aritmética e mostra o resultado
 */
import java.util.Scanner;

public class ArrayNumeroInteiro {
	    private int[] array;
	    private int numeroAtual;
	    private int numeroMaximo;

	    public ArrayNumeroInteiro(int tamanho) {
	        array = new int[tamanho];
	        numeroAtual = 0;
	        numeroMaximo = tamanho;
	    }

	    public boolean adicionar(int numero) {
	        if (numeroAtual < numeroMaximo) {
	            array[numeroAtual] = numero;
	            numeroAtual++;
	            return true;
	        } else {
	            return false; // Não foi possível adicionar, array está cheio.
	        }
	    }

	    public int calculaMedia() {
	        if (numeroAtual == 0) {
	            return 0; // Evita divisão por zero.
	        }

	        int soma = 0;
	        for (int i = 0; i < numeroAtual; i++) {
	            soma += array[i];
	        }

	        return soma / numeroAtual;
	    }
}
