package vehicle_tax;

public class Categoria2 extends Ipva{
	
	/*
	 * Criação da classe categoria2 para motocicleta
	 */
	public Categoria2(
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
	 * pois já será aplicado com o valor de 3% diretamente na categoria.
	 */
	public double calculaImposto() {
		return this.valor * 0.03;
	}

	@Override
	public String toString() {
		return 
				super.toString()+
				"Categoria2 [calculaImposto()=" + calculaImposto() + "]";
	}
	
}
