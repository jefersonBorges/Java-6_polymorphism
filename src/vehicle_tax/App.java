package vehicle_tax;

public class App {

	public static void main(String[] args) {
		
		Categoria1 carro = new Categoria1("carro", "aaa-1111", 15000, 1999);
		Categoria2 motocicleta = new Categoria2("motocicleta", "bbb-2222", 6000, 2000);
		Categoria3 caminhao = new Categoria3("caminhao", "ccc-3333", 150000, 2015);
		
		/*
		 * Teste dos objetos e m�todo calculaImposto
		 */
		System.out.println(carro);
		System.out.println(motocicleta);
		System.out.println(caminhao);
		
		/*
		 * Como o ve�culo � cadastrado diretamente na classe a qual pertence, 
		 * o m�todo j� aplica automaticamente o c�lculo,
		 * pois � solicitado * pelo m�todo toString de cada classe.
		 */


	}

}
