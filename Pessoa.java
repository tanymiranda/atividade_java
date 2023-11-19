package TodosExecicios;
/*46. Criar a classe Pessoa com as seguintes características:
 * 
● atributos: idade e dia, mês e ano de nascimento, nome da pessoa

● métodos:
○ o calculaIdade(), que recebe a data atual em dias, mês e anos e
calcula e armazena no atributo idade a idade atual da pessoa
○ o informaIdade(), que retorna o valor da idade
○ o informaNome(), que retorna o nome da pessoa
○ o ajustaDataDeNascimento(), que recebe dia, mês e ano de
nascimento como parâmetros e preenche nos atributos
correspondentes do objeto.

● Criar dois objetos da classe Pessoa, um representando Albert Einstein
(nascido em 14/3/1879) e o outro representando Isaac Newton (nascido em
4/1/1643)

● Fazer uma classe principal(2) que instancie os objetos, inicialize e mostre quais
seriam as idades de Einstein e Newton caso estivessem vivos.
 */

public class Pessoa {
    private int idade;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private String nome;

    public Pessoa(String nome, int diaNascimento, int mesNascimento, int anoNascimento) {
        this.nome = nome;
        ajustaDataDeNascimento(diaNascimento, mesNascimento, anoNascimento);
    }

    public void calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
        idade = anoAtual - anoNascimento;

        if (mesAtual < mesNascimento || (mesAtual == mesNascimento && diaAtual < diaNascimento)) {
            idade--;  // Ainda não fez aniversário no ano atual.
        }
    }

    public int informaIdade() {
        return idade;
    }

    public String informaNome() {
        return nome;
    }

    public void ajustaDataDeNascimento(int dia, int mes, int ano) {
        diaNascimento = dia;
        mesNascimento = mes;
        anoNascimento = ano;
    }
}
