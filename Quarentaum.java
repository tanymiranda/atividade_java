package TodosExecicios;
//41. Escreva um programa Java para exibir a hora do sistema.
import java.time.LocalTime;

public class Quarentaum {
    public static void main(String[] args) {

        LocalTime horaAtual = LocalTime.now();


        System.out.println("A hora do sistema é: " + horaAtual);
    }

}
