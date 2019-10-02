package taxCalc;

public class Salary {

	public static void main(String[] args) {
		

		TaxCalc ref = new TaxCalc();
		
		
		//ENTER SALARY IN BRACKETS AFTER ref.taxBand
		// e.g  ref.taxBand(28000)
		
		
		ref.taxBand(135000);
		ref.calc();
		
	}

}
