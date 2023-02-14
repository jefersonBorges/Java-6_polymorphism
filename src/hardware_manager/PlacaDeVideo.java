package hardware_manager;

public class PlacaDeVideo extends Hardware {
	
	private String memoria;
	
	//Sobrecarga do metodo imprimeHardware, acrescentando as caracterissticas de placa de video.
	public void imprimeHardware() {
		this.imprimeFabricante();
		System.out.println(
				"\nFuncao: " + getFuncao() +
				"\nModelo: " + getModelo() +
				"\nConexao: " + getConexao() +
				"\nCor: " + getCor() +
				"\nMemoria: " + getMemoria()				
				);
	}
	public PlacaDeVideo(
			String nome, 
			String site, 
			String paisDeOrigem, 
			String funcao, 
			String modelo, 
			String conexao,
			String cor, 
			String memoria) {
		super(nome, site, paisDeOrigem, funcao, modelo, conexao, cor);
		this.memoria = memoria;
	}
	public String getMemoria() {
		return memoria;
	}
	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}
	@Override
	public String toString() {
		return super.toString() 
				+ "PlacaDeVideo [memoria=" + memoria + "]";
	}
}
