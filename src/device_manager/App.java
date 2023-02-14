package device_manager;

public class App {

	public static void main(String[] args) {
		
		Fabricante dell 		= new Fabricante("DELL", "www.dell.com", "EUA");
		Fabricante apple 		= new Fabricante("Apple", "www.apple.com", "EUA");
		Fabricante samsung 		= new Fabricante("Samsung", "www.samsung.com", "Cor�ia do Sul");
		Fabricante sony 		= new Fabricante("Sony", "www.sony.com", "Jap�o");

		Hardware hardware1 		= new Hardware(dell, "XN1", 2020, 256);
		
		Computador computador1 	= new Computador(apple, "macbook", 2021, 256);
		
		Celular celular1 		= new Celular(apple, "Iphone", 2019, 64);
		Celular celular2 		= new Celular(samsung, "Galaxy", 2019, "+5551123456789", "Vivo", 64, 512);
		
		Videogame videogame1 	=new Videogame(sony, "PS4", 2020, 1024);
		
		System.out.println(hardware1);
		System.out.println(computador1);
		System.out.println(celular1);
		System.out.println(celular2);
		System.out.println(videogame1);
		
		System.out.println();

	}

}
