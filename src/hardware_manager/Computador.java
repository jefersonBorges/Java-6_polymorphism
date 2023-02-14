package hardware_manager;

//montagem de computadores e impressao das fichas
public class Computador {
	public static void main(String []args) {
		
		//Cadastro de componentes
		
		DiscoRigido discoRigido1 = new DiscoRigido(
				"Fabricante11", 
				"www.fabricante11.com",
				"PaisDeOrigem11", 
				"DiscoRigido11",
				"Modelo11", 
				"Conexaoo11", 
				"Cor11", 
				"Memoria11", 
				"Formato11");
		
		DiscoRigido discoRigido2 = new DiscoRigido(
				"Fabricante12", 
				"www.fabricante12.com",
				"PaisDeOrigem12", 
				"DiscoRigido12",
				"Modelo12", 
				"Conexao12", 
				"Cor12", 
				"Memoria12", 
				"Formato12");
		
		DiscoRigido discoRigido3 = new DiscoRigido(
				"Fabricante13", 
				"www.fabricante13.com",
				"PaisDeOrigem13", 
				"DiscoRigido13",
				"Modelo13", 
				"Conexao13", 
				"Cor13", 
				"Memoria13", 
				"Formato13");
		
		MemoriaRam memoriaRam1 = new MemoriaRam(
				"Fabricante21", 
				"www.fabricante21.com",
				"PaisDeOrigem21", 
				"DiscoRigido21",
				"Modelo21", 
				"Conexao21", 
				"Cor21", 
				"Memoria21", 
				"Tensao21");
		
		MemoriaRam memoriaRam2 = new MemoriaRam(
				"Fabricante22", 
				"www.fabricante22.com",
				"PaisDeOrigem", 
				"DiscoRigido22",
				"Modelo22", 
				"Conexao22", 
				"Cor22", 
				"Memoriaa22", 
				"Tensao22");
		
		MemoriaRam memoriaRam3 = new MemoriaRam(
				"Fabricante23", 
				"www.fabricante23.com",
				"PaisDeOrigem23", 
				"DiscoRigido23",
				"Modelo23", 
				"Conexao23", 
				"Cor23", 
				"Memoria23", 
				"Tensao23");
		
		Monitor monitor1 = new Monitor(
				"Fabricante31", 
				"www.fabricante31.com",
				"PaisDeOrigem31", 
				"DiscoRigido31",
				"Modelo31", 
				"Conexao31", 
				"Cor31", 
				"Tamanho31");
		
		Monitor monitor2 = new Monitor(
				"Fabricante32", 
				"www.fabricante32.com",
				"PaisDeOrigem32", 
				"DiscoRigido32",
				"Modelo32", 
				"Conexao32", 
				"Cor32", 
				"Tamanho32");
		
		Monitor monitor3 = new Monitor(
				"Fabricante33", 
				"www.fabricante33.com",
				"PaisDeOrigem33", 
				"DiscoRigido33",
				"Modelo33", 
				"Conexao33", 
				"Cor33", 
				"Tamanho33");
		
		Mouse mouse1 = new Mouse(
				"Fabricante41", 
				"www.fabricante41.com",
				"PaisDeOrigem41", 
				"DiscoRigido41",
				"Modelo41", 
				"Conexao41", 
				"Cor41");
		
		Mouse mouse2 = new Mouse(
				"Fabricante42", 
				"www.fabricante42.com",
				"PaisDeOrigem42", 
				"DiscoRigido42",
				"Modelo42", 
				"Conexao42", 
				"Cor42");
		
		Mouse mouse3 = new Mouse(
				"Fabricante43", 
				"www.fabricante43.com",
				"PaisDeOrigem43", 
				"DiscoRigido43",
				"Modelo43", 
				"Conexao43", 
				"Cor43");
		
		PlacaDeVideo placaDeVideo1 = new PlacaDeVideo(
				"Fabricante51", 
				"www.fabricante51.com",
				"PaisDeOrigem51", 
				"DiscoRigido51",
				"Modelo51", 
				"Conexaoo51", 
				"Cor51",
				"Memoria51");
		
		PlacaDeVideo placaDeVideo2 = new PlacaDeVideo(
				"Fabricante52", 
				"www.fabricante52.com",
				"PaisDeOrigem52", 
				"DiscoRigido52",
				"Modelo52", 
				"Conexao52", 
				"Cor52",
				"Memoria52");
		
		PlacaDeVideo placaDeVideo3 = new PlacaDeVideo(
				"Fabricante53", 
				"www.fabricante53.com",
				"PaisDeOrigem53", 
				"DiscoRigido53",
				"Modelo53", 
				"Conexao53", 
				"Cor53",
				"Memoria53");
		
		Processador processador1 = new Processador(
				"Fabricante61", 
				"www.fabricante61.com",
				"PaisDeOrigem61", 
				"DiscoRigido61",
				"Modelo61", 
				"Conexao61", 
				"Cor61",
				"Nucleos61",
				"Frequencia61");
		
		Processador processador2 = new Processador(
				"Fabricante62", 
				"www.fabricante62.com",
				"PaisDeOrigem62", 
				"DiscoRigido62",
				"Modelo62", 
				"Conexao62", 
				"Cor62",
				"Nucleos62",
				"Frequencia62");
		
		Processador processador3 = new Processador(
				"Fabricante63", 
				"www.fabricante63.com",
				"PaisDeOrigem63", 
				"DiscoRigido63",
				"Modelo63", 
				"Conexaoo63", 
				"Cor63",
				"Nucleoss63",
				"Frequencia63");
		
		Teclado teclado1 = new Teclado(
				"Fabricante71", 
				"www.fabricante71.com",
				"PaisDeOrigem71", 
				"DiscoRigido71",
				"Modelo71", 
				"Conexao71", 
				"Cor71");
		
		Teclado teclado2 = new Teclado(
				"Fabricante72", 
				"www.fabricante72.com",
				"PaisDeOrigem72", 
				"DiscoRigido72",
				"Modelo72", 
				"Conexao72", 
				"Cor72");
		
		Teclado teclado3 = new Teclado(
				"Fabricante73", 
				"www.fabricante73.com",
				"PaisDeOrigem73", 
				"DiscoRigido73",
				"Modelo73", 
				"Conexao73", 
				"Cor73");
		
		//Gerando relatorio do computador 1
		
		System.out.println("\nComputador1 { ");
		processador1.imprimeHardware();
		memoriaRam1.imprimeHardware();
		placaDeVideo1.imprimeHardware();
		discoRigido1.imprimeHardware();
		monitor1.imprimeHardware();
		mouse1.imprimeHardware();
		teclado1.imprimeHardware();
		System.out.println(" }");
		
		//Gerando relatorio do computador 2
		
		System.out.println("\nComputador2 { ");
		processador2.imprimeHardware();
		memoriaRam2.imprimeHardware();
		placaDeVideo2.imprimeHardware();
		discoRigido2.imprimeHardware();
		monitor2.imprimeHardware();
		mouse2.imprimeHardware();
		teclado2.imprimeHardware();
		System.out.println(" }");
		
		//Gerando relatorio do computador 3
		
		System.out.println("\nComputador3 { ");
		processador3.imprimeHardware();
		memoriaRam3.imprimeHardware();
		placaDeVideo3.imprimeHardware();
		discoRigido3.imprimeHardware();
		monitor3.imprimeHardware();
		mouse3.imprimeHardware();
		teclado3.imprimeHardware();
		System.out.println(" }");
	}
	
}