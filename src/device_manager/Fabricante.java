package device_manager;

public class Fabricante {
	
	private String nome;
	private String site;
	private String pais;
	
	public Fabricante(
			String nome, 
			String site, 
			String pais) {
		super();
		this.nome = nome;
		this.site = site;
		this.pais = pais;
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
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	//polimorfismo de sobreposicao
	@Override
	public String toString() {
		return 
				"Fabricante [nome=" + nome 
				+ ", site=" + site 
				+ ", pais=" + pais + "]";
	}

}
