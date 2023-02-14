package hardware_manager;

public class Processador extends Hardware {
	
	private String numeroDeNucleos;
	private String frequencia;
	
	
	//Sobrecarga do metodo imprimeHardware, acrescentando as caracteristicas de processador.
	public void imprimeHardware() {
		this.imprimeFabricante();
		System.out.println(
				"\nFun��o: " + getFuncao() +
				"\nModelo: " + getModelo() +
				"\nConex�o: " + getConexao() +
				"\nCor: " + getCor() +
				"\nNucleos: " + getNumeroDeNucleos() +
				"\nFrequ�ncia: " + getFrequencia()
				);
	}

	public Processador(
			String nome, 
			String site, 
			String paisDeOrigem, 
			String funcao, 
			String modelo, 
			String conexao,
			String cor, 
			String numeroDeNucleos, 
			String frequencia) {
		super(nome, site, paisDeOrigem, funcao, modelo, conexao, cor);
		this.numeroDeNucleos = numeroDeNucleos;
		this.frequencia = frequencia;
	}

	public String getNumeroDeNucleos() {
		return numeroDeNucleos;
	}
	public void setNumeroDeNucleos(String numeroDeNucleos) {
		this.numeroDeNucleos = numeroDeNucleos;
	}
	public String getFrequencia() {
		return frequencia;
	}
	public void setFrequencia(String frequencia) {
		this.frequencia = frequencia;
	}

	@Override
	public String toString() {
		return super.toString() 
				+ "Processador [numeroDeNucleos=" + numeroDeNucleos 
				+ ", frequencia=" + frequencia + "]";
	}
}
