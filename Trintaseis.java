package TodosExecicios;
//36. Escreva um programa para multiplicar dois números binários.

import java.util.Scanner;

public class Trintaseis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número binário: ");
        String binario1 = scanner.next();

        System.out.print("Digite o segundo número binário: ");
        String binario2 = scanner.next();

        int decimal1 = Integer.parseInt(binario1, 2);
        int decimal2 = Integer.parseInt(binario2, 2);

        int multiplicacaoDecimal = decimal1 * decimal2;

        String multiplicacaoBinaria = Integer.toBinaryString(multiplicacaoDecimal);

        System.out.println("A multiplicação dos números binários é: " + multiplicacaoBinaria);
    }
}
