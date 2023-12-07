package simulado;
/* sistema para produtos eletronicos, listar, cadastrar
 */
public class Produto {
	//definir as variaveis - o que o produto deve ter
	private String nome;
	private Integer codigo;
	private String modelo;
	private String eletronico;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getEletronico() {
		return eletronico;
	}
	public void setEletronico(String eletronico) {
		this.eletronico = eletronico;
	}

}
