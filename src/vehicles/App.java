package vehicles;

public class App {

	public static void main(String[] args) {
		
		Carro carro1 		= new Carro("Celta", 150, 5, "n�o");
		Carro carro2 		= new Carro("Gol", 220, 5, "sim");
		Caminhao caminhao1 	= new Caminhao("Scania", 120, 3, 3);
		Caminhao caminhao2 	= new Caminhao("Volvo", 150, 3, 3);

		
		System.out.println(carro1);
		System.out.println(carro2);
		System.out.println(caminhao1);
		System.out.println(caminhao2);
		
		/*
		 * Neste primeiro momento testamos o cadastro inicial, 
		 * sem as especifica��es do m�todo setCombustivel.
		 * Abaixo agora vamos inserir
		 */
		
		carro1.setCombustivel("Gasolina", "n�o");
		carro2.setCombustivel("Gasolina", "sim");
		
		caminhao1.setCombustivel("S-500");
		caminhao2.setCombustivel("S-1800");
		
		/*
		 * Teste de funcionamento do c�digo
		 */
		System.out.println(carro1);
		System.out.println(carro2);
		System.out.println(caminhao1);
		System.out.println(caminhao2);
		
	}

}
