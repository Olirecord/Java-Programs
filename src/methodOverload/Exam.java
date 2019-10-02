package methodOverload;

public class Exam {
	
	private int totalMarks;
	
	public Exam(int marks) {
		totalMarks=marks;
	}
	
	public void showResults(int marksOBT) {
		float per = (float) marksOBT*100/totalMarks;
		if (per>=60) {
			System.out.println("STUFFY? BREAK?! SWEATY?!?!?!");
			System.out.println(per);
		}
		else System.out.println(per);
		
	}
	
	
	

}
