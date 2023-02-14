package geometric_shapes;

public abstract class Forma {
	
	private String nome;	
	public Forma(String nome) {
		super();
		this.nome = nome;
	}
	
	public abstract double obterArea();

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Forma [nome=" + nome + "] ";
	}
	
	
}
