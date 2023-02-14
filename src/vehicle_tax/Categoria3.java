package vehicle_tax;

public class Categoria3 extends Ipva{
	
	/*
	 * Criação da classe categoria3, 
	 * para caminhões, ônibus, micro-ônibus e
	 *  automóveis e camionetes para locação.
	 */
	public Categoria3(
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
	 * pois já será aplicado com o valor de 2% diretamente na categoria.
	 */
	public double calculaImposto() {
		return this.valor * 0.02;
	}

	@Override
	public String toString() {
		return 
				super.toString()+
				"Categoria3 [calculaImposto()=" + calculaImposto() + "]";
	}
	
}