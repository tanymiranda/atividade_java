package simulado;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Cadastro {

	Scanner sc = new Scanner (System.in);
	List<Produto> produtoList = new ArrayList<Produto>();

	public void Tela() {
		Integer opcao;

		do {
			System.out.println("----BEM VINDO----");
			System.out.println("Escolha uma opção:\n"+"1 - Cadastrar Produto\n"+"2 - Listar produtos já cadastrados\n"+"0 - Sair do programa\n");
			opcao = sc.nextInt();
			sc.nextLine();

			if (opcao == 1) {
				Cadastrar();
			}
			else if (opcao == 2) {

				for(int i =0;  i < produtoList.size(); i++) {
					Produto produto = produtoList.get(i);

					System.out.println("Nome do produto: " + produto.getNome()+"\n" + "Código do produto: " + produto.getCodigo()+"\n"
							+ "Modelo do produto: " + produto.getModelo()+"\n" + "Tipo eletrônico: " + produto.getEletronico()+"\n");				
				}
			}
			else if (opcao ==0) {
				System.out.println("--Saindo do sistema--");
			}else {
				System.out.println("--Opção inválida, tente novamente--");
			}

		}while(opcao!=0);
		sc.close();
	}
	public void Cadastrar(){
		Produto produto = new Produto();

		System.out.println("Dê o nome do produto: ");
		String nome = sc.nextLine();
		produto.setNome(nome);

		System.out.println("Dê o código do produto: ");
		Integer codigo = sc.nextInt();
		produto.setCodigo(codigo);

		System.out.println("Informe o modelo do produto: ");
		String modelo = sc.nextLine();
		produto.setModelo(modelo);
		sc.nextLine();

		System.out.println("Qual o tipo do eletrônico (EX: PC, Celular, Fone de Ouvido e etc): ");
		String eletronico = sc.nextLine();
		produto.setEletronico(eletronico);

		produtoList.add(produto);
		sc.nextLine();

	}
}
