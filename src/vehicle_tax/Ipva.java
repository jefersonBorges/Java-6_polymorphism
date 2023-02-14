package vehicle_tax;

public abstract class Ipva {
	
	/*
	 * Criação da classe Ipva,
	 * Esta classe é abstrata pois não se faz necessário 
	 * o cadastro de nenhum objeto específico IPVA.
	 * Os objetos filhos herdarão os métodos e atributos da classe.
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
	 * Método calculaImposto,
	 * O cálculo é genérico, 
	 * solicitando atribuição de um valor ao parâmetro taxa
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
