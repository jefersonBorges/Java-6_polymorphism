package device_manager;

public class Videogame extends Hardware {
	
	private String plataforma;

	//polimorfismo de sobrecarga
	public Videogame(
			Fabricante fabricante, 
			String modelo, 
			int anoLancamento, 
			int capacidadeArmazenamento,
			String plataforma) {
		super(
				fabricante, 
				modelo, 
				anoLancamento, 
				capacidadeArmazenamento);
		this.plataforma = plataforma;
	}
	//polimorfismo de sobreposicao
	public Videogame(
			Fabricante fabricante, 
			String modelo, 
			int anoLancamento, 
			int capacidadeArmazenamento) {
		this(
				fabricante, 
				modelo, 
				anoLancamento, 
				capacidadeArmazenamento,
				"N�o especificado");
	}
	
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	//polimorfismo de sobreposicao
	@Override
	public String toString() {
		return 
				"Videogame [plataforma=" + plataforma + "]"
				+super.toString();
	}

}
