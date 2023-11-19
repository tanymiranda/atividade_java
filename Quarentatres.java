package TodosExecicios;
/*43. Faça um programa que receba um nome completo na forma de uma String e
mostre a abreviatura deste nome. Não se devem abreviar as palavras com 2 ou
menos letras. A abreviatura deve vir separada por pontos. Ex: Paulo Jose de
Almeida Prado. Abreviatura: P. J. de A. P.
 */
import java.util.Scanner;

public class Quarentatres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        String[] palavras = nomeCompleto.split(" ");
        StringBuilder abreviatura = new StringBuilder();

        for (String palavra : palavras) {
            if (palavra.length() > 2) {
                abreviatura.append(palavra.charAt(0)).append(". ");
            } else {
                abreviatura.append(palavra).append(" ");
            }
        }

        System.out.println("Abreviatura: " + abreviatura.toString().trim());
    }

}
