package geometric_shapes;

public class FormaTridimensional extends Forma {

	public FormaTridimensional(String nome) {
		super(nome);
	}

	public double obterArea() {
		double area;
		double dimensao1 = 0;
		double dimensao2 = 0;
		area = dimensao1 * dimensao2;
		return area;
	}
	
	public double obterVolume() {
		double volume;
		double dimensao1 = 0;
		double dimensao2 = 0;
		double dimensao3 = 0;
		volume = dimensao1 * dimensao2 * dimensao3;
		return volume;
	}

	@Override
	public String toString() {
		return super.toString() + "FormaTridimensional []";
	}
	

}
