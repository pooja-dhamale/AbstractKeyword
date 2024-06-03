package abstraction;

public class Doctor extends Person {
	
	public void work()
	
	{
		System.out.println("working");
	}

	public static void main(String[] args) {
		
		Person p=new Doctor();
		p.work();
		p.eat();
	}
}
