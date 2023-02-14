package geometric_shapes;

public class Cubo extends FormaTridimensional {
	
	private double lado;
	
	public Cubo(String nome, double lado) {
		super(nome);
		this.lado = lado;
	}
	
	//Polimorfismo de Sobreposicao
	public double obterArea() {
		double area;
		double dimensao1 = 6;
		double dimensao2 = Math.pow(lado, 2);
		area = dimensao1 * dimensao2;
		return area;
	}
	//Polimorfismo de Sobreposicao
	public double obterVolume() {
		double volume;
		double dimensao1 = lado;
		double dimensao2 = lado;
		double dimensao3 = lado;
		volume = dimensao1 * dimensao2 * dimensao3;
		return volume;
	}

	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return super.toString() + "Cubo [lado=" + lado + "]";
	}

}
