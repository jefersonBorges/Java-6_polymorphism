package device_manager;

public class Celular extends Hardware {
	
	private String numero;
	private String operadora;
	private int capacidadeArmazenamentoInterna;
	private int capacidadeArmazenamentoExterna;

	public Celular(
			Fabricante fabricante, 
			String modelo, 
			int anoLancamento, 
			String numero,
			String operadora, 
			int capacidadeArmazenamentoInterna, 
			int capacidadeArmazenamentoExterna) {
		super(
				fabricante, 
				modelo, 
				anoLancamento, 
				0);
		this.numero = numero;
		this.operadora = operadora;
		
		setCapacidadeArmazenamentoInterna(getCapacidadeArmazenamentoInterna());
		setCapacidadeArmazenamentoExterna(getCapacidadeArmazenamentoExterna());
	}
	
	public Celular(
			Fabricante fabricante, 
			String modelo, 
			int anoLancamento, 
			int capacidadeArmazenamento) {
		this(
				fabricante,
				modelo,
				anoLancamento,
				"S/N",
				"N�o especificada",
				0,
				0);
	}

	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getOperadora() {
		return operadora;
	}
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	
	//polimorfismo de sobreposicao
	public int getCapacidadeArmazenamento() {
		return 
				getCapacidadeArmazenamentoInterna() + 
				getCapacidadeArmazenamentoExterna(); 
	}
	
	//polimorfismo de sobreposicao
	public void setCapacidadeArmazenamento(int capacidadeArmazenamento) {
		this.capacidadeArmazenamentoInterna = capacidadeArmazenamento;
		this.capacidadeArmazenamentoExterna = 0;
	}
	//polimorfismo de sobrecarga
	public void setCapacidadeArmazenamento(
			int capacidadeArmazenamentoInterna, 
			int capacidadeArmazenamentoExterna) {
		setCapacidadeArmazenamentoInterna(capacidadeArmazenamentoInterna);
		setCapacidadeArmazenamentoExterna(capacidadeArmazenamentoExterna);
	}

	public int getCapacidadeArmazenamentoInterna() {
		return capacidadeArmazenamentoInterna;
	}
	public void setCapacidadeArmazenamentoInterna(int capacidadeArmazenamentoInterna) {
		this.capacidadeArmazenamentoInterna = capacidadeArmazenamentoInterna;
		super.capacidadeArmazenamento = capacidadeArmazenamentoInterna + this.capacidadeArmazenamentoExterna;
	}
	public int getCapacidadeArmazenamentoExterna() {
		return capacidadeArmazenamentoExterna;
	}
	public void setCapacidadeArmazenamentoExterna(int capacidadeArmazenamentoExterna) {
		this.capacidadeArmazenamentoExterna = capacidadeArmazenamentoExterna;
		super.capacidadeArmazenamento = capacidadeArmazenamentoInterna + this.capacidadeArmazenamentoExterna;
	}
	
	//polimorfismo de sobreposicao
	@Override
	public String toString() {
		return 
				"Celular [numero=" + numero 
				+ ", operadora=" + operadora 
				+ ", capacidadeArmazenamentoInterna=" + capacidadeArmazenamentoInterna 
				+ ", capacidadeArmazenamentoExterna=" + capacidadeArmazenamentoExterna
				+ "]" 
				+super.toString();
	}

}