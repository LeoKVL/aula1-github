package entities;

public class banco {

	private int number;
	private String name;
	private double saldo;
	
	public banco(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public banco(int number, String name, double depositoInicial) {
		this.number = number;
		this.name = name;
		deposito(depositoInicial);
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito (double valor) {
		saldo += valor;
	}
	
	public void saque (double valor) {
		saldo -= valor + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ number 
				+ ", Holder: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", saldo);
	}
	 
	
}
