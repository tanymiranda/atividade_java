package TodosExecicios;

public class Principal2 {
    public static void main(String[] args) {
    	
        Pessoa albertEinstein = new Pessoa("Albert Einstein", 14, 3, 1879);
        Pessoa isaacNewton = new Pessoa("Isaac Newton", 4, 1, 1643);

        // Supondo que a data atual seja 19/11/2023
        int diaAtual = 19;
        int mesAtual = 11;
        int anoAtual = 2023;

        albertEinstein.calculaIdade(diaAtual, mesAtual, anoAtual);
        isaacNewton.calculaIdade(diaAtual, mesAtual, anoAtual);

        System.out.println("Idade de " + albertEinstein.informaNome() + ": " + albertEinstein.informaIdade());
        System.out.println("Idade de " + isaacNewton.informaNome() + ": " + isaacNewton.informaIdade());
    }

}
