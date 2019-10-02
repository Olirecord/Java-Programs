package methodOverload;

public class Accounts {
	
	
	public void tax() {
		System.out.println("tax rate "+21);
	}
	public void tax(int salary) {
		float T= ((float) salary)/100*21;
		System.out.println("your tax is "+T);
	}
	
}
