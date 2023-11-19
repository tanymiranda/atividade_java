package TodosExecicios;
//34.Problemática:
//João está faturando uma nota fiscal e nesta está destacado os impostos federais ICMS, IPI,
//PIS e COFINS.
//ICMS: 17,5 %
//IPI: 7%
//PIS: 3,75%
//COFINS: 4%
//O valor da base de cálculo da nota fiscal é R$1.372,22.
//O valor total da nota fiscal inclui o imposto de ICMS, já os outros impostos são destacados
//de forma individual.
//Solução: Implemente um programa em Java para calcular e retornar o valor total da nota
//fiscal e também o valor individual calculado de cada imposto.

public class Trintaquatro {
	public static void main(String[] args) {
		
        double percentualIcms = 17.5 / 100;

        double percentualIpi = 7.0 / 100;

        double percentualPis = 3.75 / 100;

        double percentualCofins = 4.0 / 100;

        double valorBaseNotaFiscal = 1372.22;

        double valorIcms = valorBaseNotaFiscal * percentualIcms;
        System.out.println("Valor do imposto de ICMS: " + valorIcms);

        double valorIpi = valorBaseNotaFiscal  * percentualIpi;
        System.out.println("Valor do imposto de IPI: " + valorIpi);

        double valorPis = valorBaseNotaFiscal  * percentualPis;
        System.out.println("Valor do imposto de PIS: " + valorPis);

        double valorCofins = valorBaseNotaFiscal  * percentualCofins;
        System.out.println("Valor do imposto de COFINS: " + valorCofins);

        double valorTotalDaNotaFiscal = valorBaseNotaFiscal + valorIcms;

        System.out.println("Valor total da Nota Fiscal: " + valorTotalDaNotaFiscal);
}
}
