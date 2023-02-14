package bank_account;

public abstract class Conta {

	private double saldo;
	private int codigo;
	
	public Conta(int codigo){
		this.setSaldo(0);
		this.codigo = codigo;	
	}

	public int getCodigo(){
		return codigo;
	}
	
	public void exibeTipo(){
		System.out.println("Conta: " + getCodigo());
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
