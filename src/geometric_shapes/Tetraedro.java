package geometric_shapes;

public class Tetraedro extends FormaTridimensional {
	
	private double aresta;
	
	public Tetraedro(String nome, double aresta) {
		super(nome);
		this.aresta = aresta;
	}

	//Polimorfismo de Sobreposicao
	public double obterArea() {
		double area;
		double dimensao1 = Math.pow(aresta, 2);
		double dimensao2 = Math.sqrt(3);
		area = (dimensao1 * dimensao2);
		return area;
	}
	
	//Polimorfismo de Sobreposicao
	public double obterVolume() {
		double volume;
		double dimensao1 = Math.pow(aresta, 3);
		double dimensao2 = Math.sqrt(2);
		double dimensao3 = 12;
		volume = (dimensao1 * dimensao2)/dimensao3;
		return volume;
	}

	public double getAresta() {
		return aresta;
	}
	public void setAresta(double aresta) {
		this.aresta = aresta;
	}

	@Override
	public String toString() {
		return super.toString() + "Tetraedro [aresta=" + aresta + "]";
	}

}
