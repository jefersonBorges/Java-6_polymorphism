package hardware_manager;

public abstract class Hardware extends Fabricante {
	
	private String funcao;
	private String modelo;
	private String conexao;
	private String cor;
	
	public void imprimeHardware() {
		this.imprimeFabricante();
		System.out.println(
				"\nFuncao: " + getFuncao() +
				"\nModelo: " + getModelo() +
				"\nConexao: " + getConexao() +
				"\nCor: " + getCor()
				);
	}
	
	public Hardware(
			String nome, 
			String site, 
			String paisDeOrigem, 
			String funcao, 
			String modelo, 
			String conexao,
			String cor) {
		super(nome, site, paisDeOrigem);
		this.funcao = funcao;
		this.modelo = modelo;
		this.conexao = conexao;
		this.cor = cor;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getConexao() {
		return conexao;
	}
	public void setConexao(String conexao) {
		this.conexao = conexao;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return super.toString()
				+"Hardware [funcao=" + funcao 
				+ ", modelo=" + modelo 
				+ ", conexao=" + conexao 
				+ ", cor=" + cor + "]";
	}
	
}
