package vehicles;

public class Carro extends Veiculo {
	
	private String airBag;
	
	/*
	 * Aqui temos um exemplo de polimorfismo de sobrecarga construtor
	 * Acrescentamos um parâmetro ao construtor original da classe pai Veiculo
	 */
	public Carro(
			String descricao, 
			int velocidade, 
			int numeroPassageiros, 
			String airBag) {
		super(
				descricao, 
				"Não especificado", 
				velocidade, 
				numeroPassageiros);
		this.airBag = airBag;
	}

	public String getAirBag() {
		return airBag;
	}
	public void setAirBag(String airBag) {
		this.airBag = airBag;
	}
	
	/*
	 * Aqui utilizamos o polimorfismo de Sobrecarga de método, 
	 * acrescentando a verificação flex ao tipo de combustível
	 */
	public void setCombustivel(String combustivel, String flex) {
		if(flex =="sim") {
			this.combustivel = "Gasolina e Etanol";
		}else {
			this.combustivel = combustivel;
		}
	}
	
	/*
	 * Aqui utilizamos o Polimorfismo de sobreposição de método,
	 * modificando o retorno do método para adequar à classe a qual pertence
	 */

	@Override
	public String toString() {
		return 
				"Carro [airBag=" + airBag + "]"
				+super.toString();
	}

}
