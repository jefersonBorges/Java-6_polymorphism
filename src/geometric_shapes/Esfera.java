package geometric_shapes;

public class Esfera extends FormaTridimensional {
	
	double raio;

	public Esfera(String nome, double raio) {
		super(nome);
		this.raio = raio;
	}
	
	//Polimorfismo de Sobreposicao
	public double obterArea() {
		double area;
		double dimensao1 = Math.PI;
		double dimensao2 = Math.pow(raio, 2);
		area = 4*(dimensao1 * dimensao2);
		return area;
	}
	//Polimorfismo de Sobreposicao
	public double obterVolume() {
		double volume;
		double dimensao1 = 4;
		double dimensao2 = Math.PI;
		double dimensao3 = Math.pow(raio, 3);
		volume = (dimensao1 * dimensao2 * dimensao3)/3;
		return volume;
	}
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	@Override
	public String toString() {
		return super.toString() + "Esfera [raio=" + raio + "]";
	}

}
