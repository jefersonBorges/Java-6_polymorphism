package vehicle_tax;

public class Categoria1 extends Ipva{
	
	/*
	 * Criação da classe categoria1 para automóveis e camionetes
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
	 * Neste método implementado, 
	 * fazemos a sobrecarga, removendo o parâmetro taxa, 
	 * pois já será aplicado com o valor de 5% diretamente na categoria.
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
