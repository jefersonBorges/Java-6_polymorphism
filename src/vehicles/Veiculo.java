package vehicles;


/*
 * Polimorfismo é a capacidade de um objeto ou método de assumir varias formas.
 * Em Herança, utilizamos os métodos e construtores das classes Pai, para organizar, 
 * agilizar e manter um codigo mais limpo.
 * O polimorfismo pode ser de sobrecarga ou de sobreposição.
 * Polimorfismo de sobrecarga ocorre quando a parametrização de um método de mesma assinatura é alterada.
 * Polimorfismo de sobrecarga acontece quando utilizamos um método de mesma assinatura e parêmtros, 
 * porém alteramos o retorno deste.
 * Neste exemplo a classe Pai é Veiculo e as classes filhas são Carro e Caminhão. 
 * Os exemplos serão comentados.
 */
public abstract class Veiculo {
	
	private String descricao;
	protected String combustivel;
	private int velocidade;
	private int numeroPassageiros;

	public Veiculo(
			String descricao, 
			String combustivel, 
			int velocidade, 
			int numeroPassageiros) {
		super();
		this.descricao = descricao;
		this.combustivel = combustivel;
		this.velocidade = velocidade;
		this.numeroPassageiros = numeroPassageiros;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getNumeroPassageiros() {
		return numeroPassageiros;
	}
	public void setNumeroPassageiros(int numeroPassageiros) {
		this.numeroPassageiros = numeroPassageiros;
	}
	@Override
	public String toString() {
		return 
				"Veiculo [descricao=" + descricao 
				+ ", combustivel=" + combustivel 
				+ ", velocidade=" + velocidade
				+ ", numeroPassageiros=" + numeroPassageiros + "]";
	}



}
