package vehicle_tax;

public abstract class Ipva {
	
	/*
	 * Cria��o da classe Ipva,
	 * Esta classe � abstrata pois n�o se faz necess�rio 
	 * o cadastro de nenhum objeto espec�fico IPVA.
	 * Os objetos filhos herdar�o os m�todos e atributos da classe.
	 */
	
	private String nome;
	private String placa;
	protected int valor;
	private int ano;
	
	public Ipva(
			String nome, 
			String placa, 
			int valor, 
			int ano) {
		super();
		this.nome = nome;
		this.placa = placa;
		this.valor = valor;
		this.ano = ano;
	}
	
	/*
	 * M�todo calculaImposto,
	 * O c�lculo � gen�rico, 
	 * solicitando atribui��o de um valor ao par�metro taxa
	 */
	public double calculaImposto(double taxa) {
		return this.valor * taxa;
	};

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return 
				"Ipva [nome=" + nome 
				+ ", placa=" + placa 
				+ ", valor=" + valor 
				+ ", ano=" + ano + "]";
	}

}
