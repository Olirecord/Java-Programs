
public class School {

	private int che, phy;
	private int invalid, valid;
	
	public void chemistry(int c){
		if(c>=0 & c<=150){
			che=c;
			System.out.println("Che Result Accepted");
			if (c<=60 & c>=0) {
				valid+=1;
			}
			else valid=0;
		}
		else {
			System.out.println("Che Result Invalid");
			invalid=1;
		}
	}

	public void physics(int p){
		if(p>=0 & p<=150){
			phy=p;
			System.out.println("Phy Result Accepted");
			if (p<=60 & p>=0) {
				valid+=1;
			}
			else valid=0;
		}
		else {
			System.out.println("Phy Result Invalid");
			invalid=1;
		}
	}

	public void showRes(){
		int total=0;
		float per=0f;
		if(invalid==0){
			total=che+phy;
			System.out.println("total:"+total);
		}
		else {
			System.out.println("one of the results is invalid");
		}
		if(valid==1) System.out.println("retake the exam");
		if (valid==2) System.out.println("repeat the course");
		if(valid==0 & invalid==0) System.out.println("you passed");		
	}


}	



