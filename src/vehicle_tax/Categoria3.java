package vehicle_tax;

public class Categoria3 extends Ipva{
	
	/*
	 * Cria��o da classe categoria3, 
	 * para caminh�es, �nibus, micro-�nibus e
	 *  autom�veis e camionetes para loca��o.
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
	 * Neste m�todo implementado, 
	 * fazemos a sobrecarga, removendo o par�metro taxa, 
	 * pois j� ser� aplicado com o valor de 2% diretamente na categoria.
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