package hardware_manager;

public class Monitor extends Hardware {
	
	private String tamanho;
	
	//Sobrecarga do metodo imprimeHardware, acrescentando as caracteristicas de monitor.
	public void imprimeHardware() {
		this.imprimeFabricante();
		System.out.println(
				"\nFuncao: " + getFuncao() +
				"\nModelo: " + getModelo() +
				"\nConexao: " + getConexao() +
				"\nCor: " + getCor() +
				"\nTamanho de tela: " + getTamanho()
				);
	}

	public Monitor(String nome, String site, String paisDeOrigem, String funcao, String modelo, String conexao,
			String cor, String tamanho) {
		super(nome, site, paisDeOrigem, funcao, modelo, conexao, cor);
		this.tamanho = tamanho;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		return super.toString()
				+"Monitor [tamanho=" + tamanho + "]";
	}

}
