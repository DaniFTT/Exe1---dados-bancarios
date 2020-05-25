package entities;

public class Banco {

	
	// ATRIBUTOs
	private double taxa = 5.00; 
	private String name;
	private int accountNumber;
	private double money;
	
	//CONTRUTORES
	

	public Banco() {		
	}

	public Banco (int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;

	}
			

	public Banco(String name, int accountNumber, double initialDeposit) {
		this.name = name;
		this.accountNumber = accountNumber;
		money = initialDeposit;
	}



	// GETTERS AND SETTERS
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getName() {
		return name;
	}	
	
	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}
	
	
   //METODOS
	
	public void addValue(double value) {
		 money += value;
	}
	public void removeValue(double value) {
		money -= value + taxa;
	}
	
	public String toString() {
		return	"Account " + getAccountNumber() + ", Holder: " + getName() + ", Balance: " + String.format("%.2f", money);
	}
	
}
