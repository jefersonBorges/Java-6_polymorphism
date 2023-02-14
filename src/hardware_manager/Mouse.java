package hardware_manager;

public class Mouse extends Hardware {
	
	//Sobreposicao do metodo imprimeHardware, modificando o formato do relatorio para mouse .
	public void imprimeHardware() {
		this.imprimeFabricante();
		System.out.println(
				"\nFuncao gamer: " + getFuncao() +
				"\nModelo: " + getModelo() +
				"\nConexao: " + getConexao() +
				"\nCor do teclado: " + getCor()
				);
	}

	public Mouse(
			String nome, 
			String site, 
			String paisDeOrigem, 
			String funcao, 
			String modelo, 
			String conexao,
			String cor) {
		super(nome, site, paisDeOrigem, funcao, modelo, conexao, cor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() 
				+ "Mouse []";
	}
	

}
