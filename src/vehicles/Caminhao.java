package vehicles;

public class Caminhao extends Veiculo{
	
	private int numeroDeEixos;

	public Caminhao(
			String descricao, 
			int velocidade, 
			int numeroPassageiros, 
			int numeroDeEixos) {
		super(
				descricao, 
				"Diesel", 
				velocidade, 
				numeroPassageiros);
		this.numeroDeEixos = numeroDeEixos;
	}
	public int getNumeroDeEixos() {
		return numeroDeEixos;
	}
	public void setNumeroDeEixos(int numeroDeEixos) {
		this.numeroDeEixos = numeroDeEixos;
	}
	
	/*
	 * Aqui utilizamos o polimorfismo de Sobrecarga de método,
	 * substituimos o parâmetro combustivel,
	 * acrescentando o tipo de diesel ao combustivel pre-programado Diesel
	 */
	public void setCombustivel(String tipoDiesel) {
		combustivel = combustivel +" " + tipoDiesel;
	}
	@Override
	public String toString() {
		return 
				"Caminhao [numeroDeEixos=" + numeroDeEixos + "]"
				+super.toString();
	}

}
