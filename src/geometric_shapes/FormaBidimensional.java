package geometric_shapes;

public abstract class FormaBidimensional extends Forma {

	public FormaBidimensional(String nome) {
		super(nome);
	}

	public double obterArea() {
		double area;
		double dimensao1 = 0;
		double dimensao2 = 0;
		area = dimensao1 * dimensao2;
		return area;
	}

	@Override
	public String toString() {
		return super.toString() + "FormaBidimensional []";
	}

}
