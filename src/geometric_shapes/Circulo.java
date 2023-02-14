package geometric_shapes;

public class Circulo extends FormaBidimensional {
	
	public double raio;

	public Circulo(String nome, double raio) {
		super(nome);
		this.raio = raio;
	}

	//Sobreposicao de metodo
	public double obterArea() {
		double area;
		double dimensao1 = Math.pow(raio, 2);
		double dimensao2 = Math.PI;
		area = dimensao1 * dimensao2;
		return area;
	}
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public String toString() {
		return super.toString() + "Circulo [raio=" + raio + "]";
	}

}
