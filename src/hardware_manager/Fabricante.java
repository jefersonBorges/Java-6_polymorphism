package hardware_manager;

public abstract class Fabricante {
	
	private String nome;
	private String site;
	private String paisDeOrigem;
	
	public void imprimeFabricante() {
		System.out.println(
				"\nFabricante: " + nome +
				"\nSite: " + site +
				"\nPais de origem: " + paisDeOrigem
				);
	}

	public Fabricante(String nome, String site, String paisDeOrigem) {
		super();
		this.nome = nome;
		this.site = site;
		this.paisDeOrigem = paisDeOrigem;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getPaisDeOrigem() {
		return paisDeOrigem;
	}
	public void setPaisDeOrigem(String paisDeOrigem) {
		this.paisDeOrigem = paisDeOrigem;
	}

	@Override
	public String toString() {
		return "Fabricante [nome=" + nome + 
			   ", site=" + site + 
			   ", paisDeOrigem=" + paisDeOrigem + "]";
	}
	
}
