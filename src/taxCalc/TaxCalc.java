package taxCalc;

public class TaxCalc {
	
	float salary;
	float netSal;
	
	int band=0;
	float tax=0,tax1=0,tax2=0,tax3=0;
	
	
	
	public void taxBand(int s){
		salary=s;
		if(s>=0 & s<=11850) {
			band+=1;
			System.out.println("Salary entered: £"+salary);
			System.out.println("Tax band: 0%");
		}
		if(s>=11851 & s<=46350){
			band+=2;
			System.out.println("Salary entered: £"+salary);
			System.out.println("Tax band: 20%");
		}
		if(s>=46351 & s<=149999){
			band+=3;
			System.out.println("Salary entered: £"+salary);
			System.out.println("Tax band: 40%");
		}
		if(s>=150000){
			band+=4;
			System.out.println("Salary entered: £"+salary);
			System.out.println("Tax band: 45%");
		}
		//System.out.println(salary);
		//System.out.println("Band:"+band);
	}
	
	public void calc() {
		
		switch(band) {
		case 1: {
			netSal=salary;
			System.out.println("Tax exempt if salary under £11850pa"); break;
		}	
		case 2:{
			tax1=salary-11850;
			netSal=tax1/100*80+11850;
			System.out.println("Net Salary: £"+netSal);
			tax=salary-netSal;
			System.out.printf("Tax due p.a: £"+"%.2f",tax); break;
		}
		case 3:{
			tax2=(salary-46351)/100*60;
			tax1=27600.8f;
			netSal=tax1+tax2+11850;
			System.out.println("Net Salary: £"+netSal);
			tax=salary-netSal;
			System.out.printf("Tax due p.a: £"+"%.2f",tax); break;
		}	
		case 4:{
			tax3=(salary-149999)/100*55;
			tax2=62188.8f;
			tax1=27600.8f;
			netSal=tax1+tax2+tax3+11850;
			System.out.println("Net Salary: £"+netSal);
			tax=salary-netSal;
			System.out.printf("Tax due p.a: £"+"%.2f",tax); break;
		}
		default:netSal=0;
		}
	}
	
}
