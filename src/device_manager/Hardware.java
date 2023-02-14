package device_manager;

public class Hardware {
	
	protected Fabricante 	fabricante;
	protected String 		modelo;
	protected int 			anoLancamento;
	protected int 			capacidadeArmazenamento;
	
	public Hardware(
			Fabricante fabricante, 
			String modelo, 
			int anoLancamento, 
			int capacidadeArmazenamento) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.anoLancamento = anoLancamento;
		this.capacidadeArmazenamento = capacidadeArmazenamento;
	}
	
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	public int getCapacidadeArmazenamento() {
		return capacidadeArmazenamento;
	}
	public void setCapacidadeArmazenamento(int capacidadeArmazenamento) {
		this.capacidadeArmazenamento = capacidadeArmazenamento;
	}

	//polimorfismo de sobreposicao
	@Override
	public String toString() {
		return 
				"Hardware [fabricante=" + fabricante 
				+ ", modelo=" + modelo 
				+ ", anoLancamento=" + anoLancamento
				+ ", capacidadeArmazenamento=" + capacidadeArmazenamento + "]";
	}
	
}
