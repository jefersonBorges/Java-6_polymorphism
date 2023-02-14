package vehicle_tax;

public class Categoria1 extends Ipva{
	
	/*
	 * Cria��o da classe categoria1 para autom�veis e camionetes
	 */
	public Categoria1(
			String nome, 
			String placa, 
			int valor, 
			int ano) {
		super(
				nome, 
				placa, 
				valor, 
				ano);
	}

	/*
	 * Neste m�todo implementado, 
	 * fazemos a sobrecarga, removendo o par�metro taxa, 
	 * pois j� ser� aplicado com o valor de 5% diretamente na categoria.
	 */
	public double calculaImposto() {
		return this.valor * 0.05;
	}

	@Override
	public String toString() {
		return 
				super.toString()
				+"Categoria1 [calculaImposto()=" + calculaImposto() + "]";
	};
	
}
