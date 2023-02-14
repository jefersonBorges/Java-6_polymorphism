package hardware_manager;

public class MemoriaRam extends Hardware {
	private String memoria;
	private String tensao;
	
	//Sobrecarga do metodo imprimeHardware, acrescentando as caracterissticas de placa de memoria ram.
	public void imprimeHardware() {
		this.imprimeFabricante();
		System.out.println(
				"\nFuncao: " + getFuncao() +
				"\nModelo: " + getModelo() +
				"\nConexaoo: " + getConexao() +
				"\nCor: " + getCor() +
				"\nMemoria: " + getMemoria() +
				"\nTensao: " + getTensao()
				);
	}

	public MemoriaRam(
			String nome, 
			String site, 
			String paisDeOrigem, 
			String funcao, 
			String modelo, 
			String conexao,
			String cor, 
			String memoria, 
			String tensao) {
		super(nome, site, paisDeOrigem, funcao, modelo, conexao, cor);
		this.memoria = memoria;
		this.tensao = tensao;
	}

	public String getMemoria() {
		return memoria;
	}
	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}
	public String getTensao() {
		return tensao;
	}
	public void setTensao(String tensao) {
		this.tensao = tensao;
	}

	@Override
	public String toString() {
		return super.toString()
				+"MemoriaRam [memoria=" + memoria 
				+ ", tensao=" + tensao + "]";
	}

}
