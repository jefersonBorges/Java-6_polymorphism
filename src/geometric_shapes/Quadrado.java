package geometric_shapes;

public class Quadrado extends FormaBidimensional {
	private double lado;
	
	public Quadrado(String nome, double lado) {
		super(nome);
		this.lado = lado;
	}

	//Polimorfismo de Sobreposicao
	public double obterArea() {
		double area;
		double dimensao1 = lado;
		double dimensao2 = lado;
		area = dimensao1 * dimensao2;
		return area;
	}

	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return super.toString() + "Quadrado [lado=" + lado + "]";
	}
	
}
