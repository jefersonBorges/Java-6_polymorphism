package hardware_manager;

public class DiscoRigido extends Hardware {
	
	private String memoria;
	private String formato;
	
	//Sobrecarga do metodo imprimeHardware, acrescentando as caracteristicas de memoria rigida.
		public void imprimeHardware() {
			this.imprimeFabricante();
			System.out.println(
					"\nFuncao: " + getFuncao() +
					"\nModelo: " + getModelo() +
					"\nConexao: " + getConexao() +
					"\nCor: " + getCor() +
					"\nMemoria: " + getMemoria() +
					"\nFormato: " + getFormato()
					);
		}

	public DiscoRigido(
			String nome, 
			String site, 
			String paisDeOrigem, 
			String funcao, 
			String modelo, 
			String conexao,
			String cor, 
			String memoria, 
			String formato) {
		super(nome, site, paisDeOrigem, funcao, modelo, conexao, cor);
		this.memoria = memoria;
		this.formato = formato;
	}
	
	public String getMemoria() {
		return memoria;
	}
	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}

	@Override
	public String toString() {
		return super.toString()
				+"DiscoRigido [memoria=" + memoria + ", formato=" + formato + "]";
	}
}
