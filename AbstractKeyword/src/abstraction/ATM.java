package abstraction;

public abstract class ATM {
	
	int balance;

	
	public abstract void deposite(int bal);
	public abstract void withdraw(int bal);
	public abstract void checkbal();

}
