package abstraction;

public class AccountDriver extends ATM {
	
int balance;
	
	public void withdraw(int bal)
	{
		System.out.println("withdrawn" + bal);
		balance-=bal;
	}
	public void deposite(int bal)
	{
		System.out.println("deposited" + bal);
		balance+=bal;
	}
	public void checkbal()
	{
		System.out.println(balance);
	}

	public static void main(String[] args) {
		
		ATM a=new AccountDriver();
		a.withdraw(600);
		a.checkbal();
		a.deposite(500000);
		a.checkbal();
		
	}
}
