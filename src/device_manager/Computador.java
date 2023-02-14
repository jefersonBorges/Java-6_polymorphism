package device_manager;

public class Computador extends Hardware {
	
	private String periferico;

	//polimorfismo de sobrecarga de construtor
	public Computador(
			Fabricante fabricante, 
			String modelo, 
			int anoLancamento, 
			int capacidadeArmazenamento,
			String periferico) {
		super(
				fabricante, 
				modelo, 
				anoLancamento, 
				capacidadeArmazenamento);
		this.periferico = periferico;
	}
	//polimorfismo de sobreposicao construtor
	public Computador(
			Fabricante fabricante, 
			String modelo, 
			int anoLancamento, 
			int capacidadeArmazenamento) {
		this(
				fabricante, 
				modelo, 
				anoLancamento,
				capacidadeArmazenamento,
				"Nao especificado");
	}
	
	public String getModelo(int opcao) {
		if(opcao == 1) {
			return "Computador: " + super.getModelo();
		} else {
			return super.getModelo();
		}
	}
	
	public String getPeriferico() {
		return periferico;
	}
	public void setPeriferico(String periferico) {
		this.periferico = periferico;
	}
	@Override
	public String toString() {
		return 
				"Computador [periferico=" + periferico + "]"
				+super.toString();
	}

}
