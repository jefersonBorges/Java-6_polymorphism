package geometric_shapes;

public class Triangulo extends FormaBidimensional {
	
	private double base;
	private double altura;
	
	public Triangulo(String nome, double base, double altura) {
		super(nome);
		this.base = base;
		this.altura = altura;
	}

	////Polimorfismo de Sobreposicao
	public double obterArea() {
		double area;
		double dimensao1 = base;
		double dimensao2 = altura;
		area = (dimensao1 * dimensao2)/2;
		return area;
	}

	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return super.toString() + "Triangulo [base=" + base + ", altura=" + altura + "]";
	}

}
